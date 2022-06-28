package com.test.toy.member;

import lombok.Data;

@Data
public class MemberDTO {
	
	private String id;
	private String pw;
	private String name;
	private String lv;
	private String pic;
	private String regdate;

}


//logingOk 서블릿 > dto > 로그인 처리
	public MemberDTO login(MemberDTO dto) {
		try {
		
			String sql = "select * from tblToyUser where id = ? and pw = ? and active = 'y'";
		
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getId());
			pstat.setString(2, dto.getPw());
			
			rs = pstat.executeQuery();
			
			if (rs.next()) {
				
				//로그인 성공
				dto.setName(rs.getString("name"));
				dto.setLv(rs.getString("lv"));
				dto.setPic(rs.getString("pic"));
				dto.setRegdate(rs.getString("regdate"));
				
				return dto;
			
			} 
			
		} catch (Exception e) {
			System.out.println("MemberDAO.login");
			e.printStackTrace();
		}
		
		//로그인 실패
		return null;
	
	} 
	
	
//Info 서블릿
public MemberDto get(String id) {
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
	
	