package com.piotrek.aspects;

import com.piotrek.account.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class AllMethodExceptSetAndGetInAccountDaoOrder3 {

    @Before("com.piotrek.aspects.SharePointcuts.allInDAONoGetterSetter()")
    public void DAOWithoutGetterAndSetter(JoinPoint joinPoint) {
        System.out.println("////////////////// AccountDAO log before for all methods except getters and setters - order 3 - START");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method name: " + methodSignature.getMethod());
        System.out.println("Method return: " + methodSignature.getReturnType());

        Object[] args = joinPoint.getArgs();

        for( Object a : args) {
            System.out.println(a.toString());
            if(a instanceof Account)
                System.out.println("AAAAAAA " + ((Account) a).getLevel());
        }
        System.out.println("////////////////// AccountDAO log for all methods except getters and setters - order 1 - END");
    }
}
