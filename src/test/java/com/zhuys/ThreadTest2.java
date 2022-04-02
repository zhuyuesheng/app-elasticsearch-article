package com.zhuys;

public class ThreadTest2 {
	
	public static void main(String[] args) {
		int num = 10;
		MyThread2 mt2 = new MyThread2(num);
		new Thread(mt2,"线程1").start();
		new Thread(mt2,"线程2").start();
		new Thread(mt2,"线程3").start();
		new Thread(mt2,"线程4").start();
	}
}

class MyThread2 implements Runnable {
	
	private int num;
	
	public MyThread2(int num) {
		this.num = num;
	}
	
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				if(num > 0) {
					num--;
					System.out.println(Thread.currentThread().getName()+"-->"+num);
				}
			}
		}
	}
}
