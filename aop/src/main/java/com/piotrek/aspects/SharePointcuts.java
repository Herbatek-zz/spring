package com.piotrek.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SharePointcuts {

    @Pointcut("execution(* com.piotrek.account.AccountDAO.find*(..))")
    protected void findInDAO(){}

    @Pointcut("execution(* com.piotrek.account.AccountDAO.*(..))")
    protected void allMethodsInDAO(){}

    @Pointcut("execution(* com.piotrek.account.Account.*(..))")
    protected void allMethodsInEntity(){}

    @Pointcut("execution(* com.piotrek.*.*.set*(..))")
    protected void allMySetters(){}

    @Pointcut("execution(* com.piotrek.*.*.get*(..))")
    protected void allMyGetters(){}

    @Pointcut("allMethodsInDAO() && !(allMyGetters() || allMySetters())")
    protected void allInDAONoGetterSetter() {}
}
