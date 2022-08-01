package com.test.spring;

import java.util.List;

import lombok.Data;

@Data
public class BoardDTO {
	
	private String seq;
	private String title;
	private String regdate;
	
	private List<FileDTO> files;
	//게시물 하나당 여러개 첨부파일

}
