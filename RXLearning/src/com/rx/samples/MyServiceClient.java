package com.rx.samples;

import rx.schedulers.Schedulers;
import rx.util.functions.Action1;

public class MyServiceClient {	
	
	public static void main(String[] args) {
		
		IMyService service = new MyService();
		service.doSomething(new MyRequest()).
		subscribeOn(Schedulers.newThread()).
		observeOn(Schedulers.immediate()).
		subscribe(new Action1<MyResponse>() {
			@Override
			public void call(MyResponse t1) {
				System.out.println("I got the response");
			}
			
			
		});

		
		System.out.println("Ozkan");
		
	}
	
}
