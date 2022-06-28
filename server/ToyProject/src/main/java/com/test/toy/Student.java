package com.test.toy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@Data > 한번에 가능
public class Student {
	
	private String name;
	private String age;
	private String address;

}
