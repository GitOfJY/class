package com.test.java.question.collection;


// ArrayList와 동일한 동작을 하는 클래스 선언하시오.
public class MyArrayList {

	private String[] list; // ArrayList 내부 배열
	private int index; // 가장 중요



	public MyArrayList() {
		this.index = 0;
	}



	// list.add("홍길동")
	public void add(String value) {

		// 첫 add인지?
		if (this.index == 0) {
			this.list = new String[4];
		}

		// 현재 배열의 길이보다 많은 데이터를 입력하려고 하는지?
		// 배열의 길이 2배로 늘려 + 복사 + 교체

		this.list[this.index] = value;
		this.index++;
	}



	public String get(int index) {
		return this.list[index];
		// 없는 방번호 요청했을때?
	} // get



	public int size() {
		return index;
	} // size



	public String set(int index, String value) {
		list[index] = value;
		return list[index];
	} // set



	public String remove(int index) {
		String newList[] = new String[list.length - 1];
		for (int i = index; i < list.length - 1; i++) {

			// if (i != list.length - index - 1) {
			// list[i] = list[i + 1];
			// newList[i] = list[i + 1];
			// } else {
			// list[list.length - index - 1] = null;
			// }
		}
		// i <index , i==index, i>index
		// remove 후 리스트 사이즈 1만큼 작아져야함...
		// 배열의 크기가 정해져있는데 어떻게 1만큼 줄이지?
		// 새 리스트 선언하고 교체하면 될 것같은데 그러면 밑에 있는 리스트도 다 변경?
		return newList[index];
	} // remove


	public boolean add(int index, String value) {

		/*Insert 모드로 원하는 위치에 요소를 삽입한다.
		index: 수정할 요소의 위치
		value: 수정할 요소의 값
		return: 성공 유무*/

		for (int i = index; i < list.length - 1; i++) {
			list[i + 1] = list[i];
		}

		list[index] = value;
		return true;
	} // boolean add



	public int indexOf(String value) {
		int result = -1;
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] == value) {
				result = i;
			}
		}
		return result;
	} // indexOf



	public int lastIndexOf(String value) {
		int result = -1;
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] == value) {
				result = i;
			}
		}
		return list.length - result;
	} // lastIndexOf



	public void clear() {
		// 배열의 모든 요소 삭제한다.
		for (int i = 0; i < list.length; i++) {
			// 배열 요소 삭제? null으로 초기화는 가능한데,,, 삭제가 가능한가?
		}
	}

	public void trimToSize() {
		// 배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	}



} // MyArrayList

