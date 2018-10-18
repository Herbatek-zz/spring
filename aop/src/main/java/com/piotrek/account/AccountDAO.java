package com.piotrek.account;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private ArrayList<Account> list = new ArrayList<>();

    @PostConstruct
    void afterConstructed() {
        list.add(new Account("Piotr", 15));
        list.add(new Account("Grzesiek", 12));
        list.add(new Account("Michał", 12));
    }

    public boolean addAccount(Account account) {
        System.out.println(this.getClass() + ": DOING MY DB WORK: Adding an account");
        return list.add(account);
    }

    public Account getAccountByIndex(int index) {
        System.out.println(this.getClass() + ": DOING MY DB WORK: Returning account by index");
        return list.get(index);
    }

    public List<Account> findAll() {
        System.out.println(this.getClass() + ": DOING MY DB WORK: Returning all accounts");
        return list;
    }

    public void setSth() {
        System.out.println(this.getClass() + ": Fake setter");
    }

    public void getSth() {
        System.out.println(this.getClass() + ": Fake getter");
    }

}