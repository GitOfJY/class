package com.test.toy.board;

import java.util.ArrayList;

import lombok.Data;

@Data
public class BoardDTO {
	
	private String seq;
	private String subject;
	private String content;
	private String id;
	private String regdate;
	private String readcount;
	
	private String name;
	private String commentcount;
	
	private int thread;
	private int depth;
	
	private double isnew;
	
	private String filename;
	private String orgfilename;
	
	private ArrayList<String> taglist;
	
	private String good;
	private String bad;
	private String goodbad; //단일 데이터
		
	//private int cnt; //집합 데이터 > 성격이 다르기 때문에 dto 다시 생성
	
}
















