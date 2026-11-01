package com.wealthlite.account.controller;

import com.wealthlite.account.dto.AccountDto;
import com.wealthlite.account.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public AccountDto get(@PathVariable Long id){
        return service.find(id);
    }

    @GetMapping
    public List<AccountDto> byClient(@RequestParam Long clientId){
        return service.byClient(clientId);
    }
}
