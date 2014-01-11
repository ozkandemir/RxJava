package com.rx.samples;

import rx.Observable;

public interface IMyService {
	public Observable<MyResponse> doSomething(MyRequest myRequest);
}
