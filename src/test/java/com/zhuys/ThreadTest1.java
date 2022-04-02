package com.zhuys;

public class ThreadTest1 {

	static int NUM = 12;

	public static void main(String[] args) {

		MyThread mt = new MyThread("线程");
		Thread t1 = new Thread(mt, "线程1");
		Thread t2 = new Thread(mt, "线程2");
		Thread t3 = new Thread(mt, "线程3");
		Thread t4 = new Thread(mt, "线程4");
		Thread t5 = new Thread(mt, "线程5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}

class MyThread implements Runnable {

	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			if (ThreadTest1.NUM > 0) {
				System.out.println(Thread.currentThread().getName() + "初始化使用  共享数量为 ： " + ThreadTest1.NUM);
				ThreadTest1.NUM = ThreadTest1.NUM - 4;
				System.out.println(Thread.currentThread().getName() + "已经使用完成  共享数量为 ： " + ThreadTest1.NUM);
			}
		}

	}
}
