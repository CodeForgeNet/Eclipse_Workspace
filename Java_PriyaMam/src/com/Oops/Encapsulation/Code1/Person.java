package com.Oops.Encapsulation.Code1;

public class Person {

	private String pname;
	private int page;
	private long pcontact;

	public Person(String pname, int page, long pcontact) {
		this.pname = pname;
		this.page = page;
		this.pcontact = pcontact;
	}

	// getters
	public String getPname() {
		return pname;
	}

	public int getPage() {
		return page;
	}

	public long getPcontact() {
		return pcontact;
	}

	// setter

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPage(int page) {
		if (page > 0) {
			this.page = page;
		} else {
			System.out.println("invalid age");
		}
	}

	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}
}
