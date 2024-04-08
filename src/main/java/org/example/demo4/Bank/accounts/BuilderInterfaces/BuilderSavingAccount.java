package org.example.demo4.Bank.accounts.BuilderInterfaces;


import org.example.demo4.Bank.accounts.SavingAccount;

import java.sql.SQLException;


public class BuilderSavingAccount extends BuilderAccount{
    double minimumBalance = 0;
    double interestRate;


    public BuilderSavingAccount(String accountHolderName, Double interestRate) throws SQLException {
        super(accountHolderName);
        this.interestRate = interestRate;
    }



    @Override
    public BuilderSavingAccount setBalance(Double balance) {
        super.balance = balance;
        return this;
    }

    @Override
    public BuilderSavingAccount setNumberAccount(Integer accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public BuilderSavingAccount setMinimumBalance(Double minimumBalance){
        this.minimumBalance = minimumBalance;
        return this;
    }

    @Override
    public SavingAccount build(){
        return new SavingAccount(this, interestRate);
    }


}
