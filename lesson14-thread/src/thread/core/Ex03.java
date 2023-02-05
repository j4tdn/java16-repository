package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread t1 = new Thread(new task(),"thread 1");
		t1.start();
		join(t1);//t1 xong mới tới t2
		
		Thread t2 = new Thread(new task(),"thread 1");
		t2.start();
		join(t2);
		
		printCurrentThreadName();
		System.out.println("main end");
	}
	
	//dùng static: xem nó giống 1 hàm biến hay class nằm trong class này/ ngang hàng
	private static class task implements Runnable{
		@Override
		public void run() {
			printCurrentThreadName();
			System.out.println("running a tash .... ");
		}
	}

}
