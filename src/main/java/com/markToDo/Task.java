package com.markToDo;

public class Task {
	private long id;
	private String name;
	private boolean check;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String strings) {
		this.name = strings;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
}
