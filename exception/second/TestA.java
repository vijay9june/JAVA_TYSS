package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main Strr..");

		try {
			Thread.sleep(3000);
			System.out.println("Inside TRY");
		}
		catch (InterruptedException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	
		System.out.println("Main end..");

	}

}
