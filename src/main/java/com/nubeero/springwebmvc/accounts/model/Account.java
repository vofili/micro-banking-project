package com.nubeero.springwebmvc.accounts.model;

public record Account(Long id,String accountNumber,String accountName,AccountType accountType,Double accountBalance) {
}
