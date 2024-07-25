package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

//    @Before("execution(public void addAccount())")
//    public void beforeAddAccountAdvice() {
//        System.out.println("\n====>>> Executing @Before advice on addAccount()");
//    }

//    @Before("execution(public void com.example.aopdemo.dao.AccountDAO.addAccount())")
//    public void beforeAccountAddAccountAdvice() {
//        System.out.println("\n====>>> Executing @Before advice on Account addAccount()");
//    }

//    @Before("execution(public void add*())")
//    public void beforeAddAdvice() {
//        System.out.println("\n====>>> Executing @Before advice on Membership addSillyMember()");
//    }

//    @Before("execution(public * add*())")
//    public void beforeAddAnyTypeAdvice() {
//        System.out.println("\n====>>> Executing @Before advice on Any type add*()");
//    }
}
