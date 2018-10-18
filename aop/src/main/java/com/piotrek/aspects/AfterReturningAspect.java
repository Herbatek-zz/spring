package com.piotrek.aspects;

import com.piotrek.account.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AfterReturningAspect {

    @AfterReturning(pointcut = "com.piotrek.aspects.SharePointcuts.findInDAO()", returning = "result")
    public void DAOFind(JoinPoint joinPoint, List<Account> result) {
        System.out.println("///////// AfterReturning /////////");
        for (Account a : result)
            System.out.println(a.toString());
        System.out.println("//////////////////////////////////");
    }
}
