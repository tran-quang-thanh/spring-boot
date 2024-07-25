package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

    @Pointcut("execution(* com.example.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    @Pointcut("execution(* com.example.aopdemo.dao.*.get*(..))")
    private void getter() {}

    @Pointcut("execution(* com.example.aopdemo.dao.*.set*(..))")
    private void setter() {}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageWithoutSetterAndGetter() {}

    @Before("forDaoPackageWithoutSetterAndGetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n====>>> Executing @Before advice on addAccount()");
    }

    @Before("forDaoPackageWithoutSetterAndGetter()")
    public void performApiAnalytics() {
        System.out.println("\n====>>> Perform API analytics");
    }
}
