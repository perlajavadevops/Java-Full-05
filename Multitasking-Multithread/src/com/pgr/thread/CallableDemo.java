package com.pgr.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Callable_Thread implements Callable<Student> {

	@Override
	public Student call() throws Exception {
		return new Student("Hi");
	}
}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Student> futureTask = new FutureTask<Student>(new Callable_Thread());
		Thread thread1 = new Thread(futureTask);
		thread1.start();
		System.out.println(futureTask.get().name);
	}
}
