package com.cocoa.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.nio.channels.SelectionKey;

/**
 * Created by sj on 17/2/8.
 */
public class Main  extends Thread{

    public static void main(String[] args) {

//
//        Observable.create(new ObservableOnSubscribe() {
//            public void subscribe(ObservableEmitter e) throws Exception {
//
//                    e.onNext(1);
//                    e.onNext(2);
////                    e.onError(new Throwable("hjahjah"));
//                    e.onComplete();
//            }
//        }).subscribe(new Observer<Object>() {
//            public void onSubscribe(Disposable d) {
//                System.out.println("onSubscribe");
//            }
//
//            public void onNext(Object o) {
//                System.out.println(o);
//            }
//
//            public void onError(Throwable e) {
//                System.out.println(e);
//            }
//
//            public void onComplete() {
//                System.out.println("OnComplete");
//            }
//        });
//


//        double money = 1470;
//
//        for (int i = 0; i < 120; i++) {
//            money = (money * 1.0015);
//            System.out.println("第" + i + "个月,利息本金=" + money);
//            money = (money + 1470.00);
//        }
//
//        System.out.println(money);

        Main t  = new Main();
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void run() {
        super.run();
        try {
            int i = 10;
            while( i > 5) {
                i--;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// 02-27 14:51:57.385 11010-11041/com.cocoa.rxjava.rxjava D/MainActivity: Observable thread is : RxNewThreadScheduler-1
// 02-27 14:51:57.385 11010-11041/com.cocoa.rxjava.rxjava D/MainActivity: emit 1
// 02-27 14:51:57.385 11010-11010/com.cocoa.rxjava.rxjava D/MainActivity: After observeOn(mainThread), current thread is: main
// 02-27 14:51:57.395 11010-11042/com.cocoa.rxjava.rxjava D/MainActivity: After observeOn(io), current thread is : RxCachedThreadScheduler-2
// 02-27 14:51:57.395 11010-11042/com.cocoa.rxjava.rxjava D/MainActivity: Observer thread is :RxCachedThreadScheduler-2
// 02-27 14:51:57.395 11010-11042/com.cocoa.rxjava.rxjava D/MainActivity: onNext: 1

// 02-27 14:55:39.775 16935-17019/com.cocoa.rxjava.rxjava D/MainActivity: Observable thread is : RxNewThreadScheduler-1
// 02-27 14:55:39.775 16935-17019/com.cocoa.rxjava.rxjava D/MainActivity: emit 1
// 02-27 14:55:39.775 16935-16935/com.cocoa.rxjava.rxjava D/MainActivity: After observeOn(mainThread), current thread is: main
// 02-27 14:55:39.775 16935-17374/com.cocoa.rxjava.rxjava D/MainActivity: After observeOn(io), current thread is : RxCachedThreadScheduler-2
// 02-27 14:55:39.775 16935-16935/com.cocoa.rxjava.rxjava D/MainActivity: Observer thread is :main
// 02-27 14:55:39.775 16935-16935/com.cocoa.rxjava.rxjava D/MainActivity: onNext: 1