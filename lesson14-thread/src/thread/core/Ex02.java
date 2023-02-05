package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread t1 = new Thread(new task(),"thread 1");
		t1.start();
		
		printCurrentThreadName();
		System.out.println("main end");
	}
	
	//dùng static: xem nó giống 1 hàm biến hay class nằm trong class này/ ngang hàng
	private static class task implements Runnable{
		@Override
		public void run() {
			//prepare data took 2s
			task(2, TimeUnit.SECONDS);
			
			printCurrentThreadName();
			System.out.println("running a tash .... ");
		}
	}

}
