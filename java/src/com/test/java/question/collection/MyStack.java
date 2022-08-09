package com.test.java.question.collection;

public class MyStack {

	private String[] list;
	private int index;


	// 값을 순차적으로 추가한다.
	public boolean push(String value) {

		try

		{

			init();

			if (checkLength()) {
				doubleList();
			}

			this.list[this.index] = value;
			this.index++; // Append

			return true;
		} catch (Exception e) {
			return false;
		}
	} // push


	private void doubleList() {
		String[] temp = new String[this.list.length * 2];

		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i];
		}

		this.list = temp;
	} // doubkeList


	private boolean checkLength() {
		if (this.index == this.list.length) {
			return true;
		}
		return false;
	} // checkLength


	public void init() {
		if (this.index == 0) {
			this.list = new String[4];
		}
	} // init


	// 값을 순차적으로 가져온다. index 1개 감소
	// index == 0 일때도 추가해야하나?
	public String pop() {
		String temp = this.list[this.index - 1];
		this.list[this.index - 1] = null;
		this.index--;
		return temp;
	}


	// 요소의 개수를 반환한다.
	public int size() {
		return index;
	}


	// 이번에 가져올 값을 확인한다.
	public String peek() {
		return this.list[this.index - 1];
	}


	// 배열의 모든 요소를 삭제한다.
	public void clear() {
		index = 0;
	}


	// 배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	public void trimToSize() {
		String[] temp = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			temp[i] = this.list[i];
		}

		this.list = temp;
	}



}


