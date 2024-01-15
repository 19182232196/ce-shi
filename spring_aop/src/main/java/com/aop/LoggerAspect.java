package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Aspect
public class LoggerAspect {
    @Pointcut("execution(* com.aop.CalculatorPureImpl.*(..))")
    public void pointCut(){}
    @Before(value = "pointCut()")
    public void beforeAdviceMethod(JoinPoint jointPoint) {
        Signature signature = jointPoint.getSignature();
        Object[] args = jointPoint.getArgs();
        System.out.println("before, 方法："+signature.getName()+",参数"+ Arrays.toString(args));
    }
    @After(value = "pointCut()")
    public void afterAdviceMethod(JoinPoint jointPoint){
        Signature signature = jointPoint.getSignature();
        System.out.println("after, 方法："+signature.getName()+",执行完毕");
    }
    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturningAdviceMethod(JoinPoint jointPoint,Object result){
        Signature signature = jointPoint.getSignature();
        System.out.println("return, 方法："+signature.getName()+", 结果："+result);
    }
    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void afterThrowingAdviceMethod(JoinPoint jointPoint,Throwable e){
        Signature signature = jointPoint.getSignature();
        System.out.println("throw, 方法："+signature.getName()+", 结果："+e);
    }
    @Around(value = "pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result=null;
        try {
            System.out.println("circle, Q");
            result = joinPoint.proceed();
            System.out.println("circle, W");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("circle, return E");
        }finally {
            System.out.println("circle, back R");
        }
        return result;
    }
}
