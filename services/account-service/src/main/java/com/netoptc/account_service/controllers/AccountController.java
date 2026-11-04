package com.netoptc.account_service.controllers;


import com.netoptc.account_service.api.AccountsApi;
import com.netoptc.account_service.api.model.Account;
import com.netoptc.account_service.api.model.OpenAccountRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("accounts")
public class AccountController implements AccountsApi {


    @Override
    public ResponseEntity<Account> getAccount(Long accountId) {
        return null;
    }

    @Override
    public ResponseEntity<Account> openAccount(OpenAccountRequest openAccountRequest) {
        return null;
    }
}
