package com.rx.samples;

import rx.Observable;
import rx.Observable.OnSubscribeFunc;
import rx.Observer;
import rx.Subscription;

public class MyService implements IMyService {
	public rx.Observable<MyResponse> doSomething(MyRequest myRequest) {
		return Observable.create(new OnSubscribeFunc<MyResponse>() {
			@Override
			public Subscription onSubscribe(final Observer<? super MyResponse> t1) {

				t1.onNext(new MyResponse());

				return null;
			}

		});

	};
}
