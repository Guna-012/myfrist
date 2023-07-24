package org.company;

public class CampanyInfo {
	public void companyName() {
		System.out.println("companyName");
	}

	public void companyId() {
		System.out.println("companyId");
	}

	public void companyAddress() {
		System.out.println("companyAddress");
	}

	public static void main(String[] arg) {
		CampanyInfo c = new CampanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}
}
