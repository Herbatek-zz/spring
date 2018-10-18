package com.piotrek;

import com.piotrek.account.Account;
import com.piotrek.account.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Account account = context.getBean("account",Account.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);


        System.out.println("$$$$$$$$$$ IN APP START $$$$$$$$$$");
        accountDAO.setSth();
        accountDAO.getSth();
        accountDAO.getAccountByIndex(1);
        accountDAO.findAll();
        accountDAO.addAccount(account);

        account.getLevel();
        account.getName();
        account.setLevel(12);
        account.setName("Piotrek");
        System.out.println("$$$$$$$$$$ IN APP END $$$$$$$$$$");

        context.close();
    }
}
