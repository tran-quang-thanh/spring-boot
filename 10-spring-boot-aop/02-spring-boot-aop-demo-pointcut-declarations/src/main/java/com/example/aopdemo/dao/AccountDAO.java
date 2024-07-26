package com.example.aopdemo.dao;

import com.example.aopdemo.Account;

import java.util.List;

public interface AccountDAO {
    void addAccount();
    String getName();
    void setName(String name);
    String getServiceCode();
    void setServiceCode(String serviceCode);
    List<Account> findAccounts();
    List<Account> findAccounts(boolean tripWire);
}
