package com.zyngora.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable | "+Thread.currentThread().getName());
            }
        };

        new Thread(runnable).start();

        // java 8 lambda
        // () -> {};
        Runnable runnableLambda = () -> {
            System.out.println("Inside RunnableLambda | "+Thread.currentThread().getName());
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("Inside RunnableLambda1 | "+Thread.currentThread().getName());
        new  Thread(runnableLambda1).start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Inside Runnable1 | "+Thread.currentThread().getName());
            }
        }).start();

        new Thread(()->System.out.println("Inside RunnableLambda2 | "+Thread.currentThread().getName())).start();
    }
}
