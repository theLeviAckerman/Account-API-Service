package com.cherry.accounts.controller;

import com.cherry.accounts.dto.AccountDto;
import com.cherry.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/createAccount")
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto){
         AccountDto accountCreated=  accountService.createAccount(accountDto);

        return  new ResponseEntity<>(accountCreated, HttpStatus.OK);
    }

    @GetMapping("/getAccountByEmail/{emailId}")
    public  ResponseEntity<AccountDto> getAccountByEmail(@PathVariable String emailId){
            AccountDto accountDetails =   accountService.getAccountByEmail(emailId);
        return  new ResponseEntity<>(accountDetails, HttpStatus.OK);

    }

    @GetMapping("/getAccountById/{id}")
    public  ResponseEntity<AccountDto> getAccountById(@PathVariable Integer id){

        return  accountService.getAccountDetailsById(id);
    }

}
