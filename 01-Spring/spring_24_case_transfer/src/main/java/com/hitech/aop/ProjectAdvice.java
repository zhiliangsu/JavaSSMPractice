package com.hitech.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* com.hitech.service.*Service.*(..))")
    private void servicePt() {
    }

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();// 获取执行签名信息
        String className = signature.getDeclaringTypeName();// 通过签名获取执行操作名称(接口名)
        String methodName = signature.getName();// 通过签名获取执行操作名称(方法名)

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("业务层接口方法" + className + "." + methodName + "万次执行的时间为---->" +
                (end - start) + "ms");
    }
}
