package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("C_Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
