package com.test.spring.aop;

public class MemoImpl implements Memo {

	@Override
	public void add(String memo) {
		
		//주업무
		System.out.println("메모 쓰기: " + memo);
		
		//보조 업무
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG][%tF %tT] 로그를 기록합니다. \n", now, now);
	
	}

	@Override
	public String read(int seq) throws Exception{
	
		System.out.println("메모 읽기: " +seq);
		
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG][%tF %tT] 로그를 기록합니다. \n", now, now);
		if (seq >=1 && seq <=10) {
			System.out.println("메모 읽기: " +seq);
		} else {
			throw new Exception("존재하지 않은 메모");
		}
		return "메모입니다.";
	
	}

	@Override
	public boolean edit(int seq, String memo) {
		
		System.out.println("메모 수정하기: " +memo);		
		
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG][%tF %tT] 로그를 기록합니다. \n", now, now);
	
		return true;
		
	}

	@Override
	public boolean del(int seq) {
		
		System.out.println("메모 삭제하기: " +seq);
		
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG][%tF %tT] 로그를 기록합니다. \n", now, now);
		
		return true;
		
	}

}
