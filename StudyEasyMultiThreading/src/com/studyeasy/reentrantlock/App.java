package com.studyeasy.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
	static int counter=0;
	static Lock lock=new ReentrantLock();
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock.lock();
				try {
				for(int i=0;i<1000;i++)
					App.counter++;
				}
				finally {
				lock.unlock();
				}
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock.lock();
				try {
				for(int i=0;i<1000;i++)
					App.counter++;
				}
				finally {
				lock.unlock();
				}
				
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final Value of counter : "+counter);
	}

}
