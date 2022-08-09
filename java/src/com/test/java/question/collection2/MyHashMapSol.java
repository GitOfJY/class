package com.test.java.question.collection2;

public class MyHashMapSol {
	private String[] key;
	private String[] value;
	private int index;

	public MyHashMapSol() {

		// 그냥 생성과 동시에 배열 생성 해버렸음.
		this.key = new String[4];
		this.value = new String[4];
		this.index = 0;

	}

	public String put(String key, String value) {

		int index = indexOf(key);

		if (index > -1) {
			String temp = this.value[index];
			this.value[index] = value;
			return temp;
		}

		if (checkLength()) {
			doubleList();
		}

		this.key[this.index] = key;
		this.value[this.index] = value;
		this.index++;

		return null;

	}

	private int indexOf(String key) {

		for (int i = 0; i < this.index; i++) {
			if (this.key[i].equals(key)) {
				return i;
			}
		}

		return -1;
	}

	private boolean checkLength() {

		if (this.index == this.key.length) {
			return true;
		}

		return false;
	}

	private void doubleList() {

		String[] ktemp = new String[this.key.length * 2];
		String[] vtemp = new String[this.value.length * 2];

		for (int i = 0; i < this.key.length; i++) {
			ktemp[i] = this.key[i];
			vtemp[i] = this.value[i];
		}

		this.key = ktemp;
		this.value = vtemp;

	}

	public int size() {

		return this.index;
	}

	public String get(String key) {

		for (int i = 0; i < this.index; i++) {
			if (this.key[i].equals(key)) {
				return this.value[i];
			}
		}

		return null;
	}

	public String remove(String key) {

		int index = indexOf(key);

		if (index == -1) {
			return null;
		}

		for (int i = index; i < this.key.length - 1; i++) {
			this.key[i] = this.key[i + 1];
			this.value[i] = this.value[i + 1];
		}

		this.index--;

		return this.value[index];
	}

	public boolean containKey(String key) {

		if (indexOf(key) > -1) {
			return true;
		}

		return false;
	}

	public boolean containsValue(String value) {

		for (int i = 0; i < this.index; i++) {
			if (this.value[i].equals(value)) {
				return true;
			}
		}

		return false;
	}

	public void clear() {

		this.index = 0;

	}

	public void trimToSize() {

		String[] ktemp = new String[this.index];
		String[] vtemp = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			ktemp[i] = this.key[i];
			vtemp[i] = this.value[i];
		}

		this.key = ktemp;
		this.value = vtemp;

	}

	@Override
	public String toString() {

		String temp = "";

		temp += "\n";
		temp += String.format("length: %d\n", this.key.length);
		temp += String.format("size: %d\n", this.index);
		temp += String.format("[\n");
		for (int i = 0; i < this.key.length; i++) {
			temp += String.format("   %s: %s\n", this.key[i], this.value[i]);
		}
		temp += String.format("]");
		temp += "\n";

		return temp;
	}


}

/*
 
public class MyHashMap2 {

	private Item[] list;
	private int index;
	
	public MyHashMap2() {
		
		//그냥 생성과 동시에 배열 생성 해버렸음.
		this.list = new Item[4];
		this.index = 0;
		
	}
	
	public String put(String key, String value) {
		
		int index = indexOf(key);
		
		if (index > -1) {
			String temp = this.list[index].value;
			this.list[index].value = value;
			return temp;
		}
		
		if (checkLength()) {
			doubleList();
		}

		this.list[this.index] = new Item(key, value);
		this.index++;

		return null;

	}
	
	private int indexOf(String key) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].key.equals(key)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private boolean checkLength() {

		if (this.index == this.list.length) {
			return true;
		}

		return false;
	}

	private void doubleList() {

		Item[] temp = new Item[this.list.length * 2];

		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i];
		}

		this.list = temp;

	}
	
	public int size() {
		
		return this.index;
	}
	
	public String get(String key) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].key.equals(key)) {
				return this.list[i].value;
			}
		}
		
		return null;		
	}
	
	public String remove(String key) {
		
		int index = indexOf(key);
		
		if (index == -1) {
			return null;
		}
		
		for (int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
		
		return this.list[index].value;		
	}
	
	public boolean containKey(String key) {
		
		if (indexOf(key) > -1) {
			return true;
		} 
		
		return false;		
	}
	
	public boolean containsValue(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].value.equals(value)) {
				return true;
			}
		}
		
		return false;		
	}
	
	public void clear() {
		
		this.index = 0;
		
	}
	
	public void trimToSize() {

		Item[] temp = new Item[this.index];

		for (int i = 0; i < this.index; i++) {
			temp[i] = this.list[i];
		}

		this.list = temp;

	}
	
	@Override
	public String toString() {
		
		String temp = "";

		temp += "\n";
		temp += String.format("length: %d\n", this.list.length);
		temp += String.format("size: %d\n", this.index);
		temp += String.format("[\n");
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i] != null) {
				temp += String.format("   %s: %s\n", this.list[i].key, this.list[i].value);
			} else {
				temp += String.format("   %s: %s\n", null, null);
			}
		}
		temp += String.format("]");
		temp += "\n";

		return temp;
	}
	
}


class Item {
	public String key;
	public String value;
	
	public Item(String key, String value) {
		this.key = key;
		this.value = value;
	}
}

*/
