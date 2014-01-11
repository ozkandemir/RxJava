package com.rx.samples;

import rx.Observable;
import rx.Observable.OnSubscribeFunc;
import rx.Observer;
import rx.Subscription;

public class ObservableTest {

	public static Observable<SampleDTO> testService(){
		return Observable.create(new OnSubscribeFunc<SampleDTO>() {
	
			@Override
			public Subscription onSubscribe(Observer<? super SampleDTO> observer) {
				System.out.println("Bilmem");
				observer.onNext(new SampleDTO());
				return null;
			}
			
		});
			
			
		
		
	}
	
	public static void main(String[] args) {
		testService().subscribe(new Observer<SampleDTO>() {
			@Override
			public void onNext(SampleDTO args) {
				System.out.println("1");
				
			}

			@Override
			public void onCompleted() {
				System.out.println("2");
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("3");
			}
			
			
		});
	}
	
	
	
	
	public static class SampleDTO{
		
	}
}
