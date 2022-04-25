package com.ynnz.advice;


public class CameraAdvice {
    public void beforeAdvice() {
        System.out.println("摄像头监控中！");
    }

    public void afterReturningAdvice() {
        System.out.println("摄像头已经记录用户行为！");
    }
}
