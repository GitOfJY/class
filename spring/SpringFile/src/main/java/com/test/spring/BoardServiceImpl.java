package com.test.spring;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class BoardServiceImpl implements BoardService {

	private BoardDAO dao;
	
	@Autowired
	public BoardServiceImpl(BoardDAO dao) {
		this.dao = dao;
	}

	@Override
	public int write(HttpServletRequest req, String title) {
		
		//게시판 글쓰기
		int result = dao.add(title);
		int seq = dao.getSeq();
		
		
		MultipartHttpServletRequest multi = (MultipartHttpServletRequest)req;
		
		//MultipartFile file = multi.getFile("attachlist");
		//System.out.println(file.getOriginalFilename());
		
		List<MultipartFile> files = multi.getFiles("attachlist");
		String path = req.getRealPath("resources/files");
		
		
		for (MultipartFile file : files) {
		
			//System.out.println(file.getOriginalFilename());
		
			String filename = getFileName(path, file.getOriginalFilename());
			File tempfile = new File(path + "\\" + filename);
			
			try {
				file.transferTo(tempfile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			FileDTO fdto = new FileDTO();
			
			fdto.setFilename(filename);
			fdto.setFilesize(file.getSize()+"");
			fdto.setMimetype(file.getContentType());
			fdto.setBseq(seq+"");
			
			dao.addFile(fdto);
			
		}
		return result;
	}
	
	
	
	private String getFileName(String path, String filename) {
		
		int n = 1;
		int index = filename.lastIndexOf(".");
		
		String tempName = filename.substring(0, index); //MyBatis
		String tempExt = filename.substring(index);     //.png
		
		while (true) {
			
			File file = new File(path + "\\" + filename); //files\MyBatis.png
			
			if (file.exists()) {
				//존재 > 중복 > 파일명 변경
				filename = tempName + "_" + n + tempExt; //MyBatis_1.png
				n ++;
			} else {
				//존재 안함 > 파일명 사용 가능
				return filename;
			}
			
		}//while
		
	}//getFileName

	
	
	@Override
	public List<BoardDTO> list() {
		
		//게시물 select
		List<BoardDTO> list = dao.list();
		
		//게시물당 첨부파일 select
		for (BoardDTO dto : list) {
			
			List<FileDTO> flist = dao.flist(dto.getSeq());
			dto.setFiles(flist); //게시물 + 첨부파일리스트	
			
		}
		
		return list;
	}
	
	
}
