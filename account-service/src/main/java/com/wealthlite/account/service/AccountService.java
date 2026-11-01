package com.wealthlite.account.service;

import com.wealthlite.account.dto.AccountDto;
import com.wealthlite.account.exception.AccountNotFoundException;
import com.wealthlite.account.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repo;

    public AccountService(AccountRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public AccountDto find(Long id) {
        return repo.findById(id)
                .map(AccountDto::from)
                .orElseThrow(() -> new AccountNotFoundException(id));
    }

    @Transactional(readOnly = true)
    public List<AccountDto> byClient(Long clientId) {
        return repo.findByClientId(clientId).stream()
                .map(AccountDto::from)
                .toList();
    }
}
