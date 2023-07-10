package com.hitech.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.hitech.dao.BookDao.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.hitech.dao.BookDao.select())")
    private void pt2() {
    }

    // @Before("MyAdvice.pt()") //不建议
    @Before("pt2()")
    public void before() {
        System.out.println("before advice ...");
    }

    @After("pt2()")
    public void after() {
        System.out.println("after advice ...");
    }

    @Around("pt2()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        Object ret = pjp.proceed();
        // int ret = (int) pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
        // return ret + 566;
    }

    @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    @AfterThrowing("pt2()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
