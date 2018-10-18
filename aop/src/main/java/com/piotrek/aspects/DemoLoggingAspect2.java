package com.piotrek.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DemoLoggingAspect2 {

    @Before("com.piotrek.aspects.SharePointcuts.allInDAONoGetterSetter()")
    public void DAOWithoutGetterAndSetter2() {
        System.out.println("////////////////// AccountDAO log for all methods except getters and setters - order 2");
    }
}
