package com.test.spring;

import java.util.List;

public interface MyBatisDAO {

	void test();

	void m1();

	int m2(String seq);

	int m3(String seq);

	int m4(MyBatisDTO dto);

	int m5(String seq);

	MyBatisDTO m6(String seq);

	List<MyBatisDTO> m8();

	List<String> m7();

	int m9(String table);

	List<MyBatisDTO> m10(String word);

	List<MyBatisDTO> m11(String type);

}
