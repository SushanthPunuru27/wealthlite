package com.wealthlite.account.dto;

import com.wealthlite.account.model.Account;

import java.math.BigDecimal;

public record AccountDto(Long id, Long clientId, String accountNumber,
                         String type, String currency, BigDecimal balance) {

    public static AccountDto from(Account a) {
        return  new AccountDto(a.getId(), a.getClientId(), a.getAccountNumber(),
                a.getType(), a.getCurrency(), a.getBalance());
    }
}
