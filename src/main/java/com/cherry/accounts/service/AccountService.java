package com.cherry.accounts.service;

import com.cherry.accounts.dto.AccountDto;
import com.cherry.accounts.enitity.Account;
import com.cherry.accounts.mapper.AccountMapper;
import com.cherry.accounts.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AccountService {

    @Autowired
    AccountRepo accountRepo;



    public AccountDto createAccount(AccountDto accountDto) {

       Account savedAccount = accountRepo.save(AccountMapper.INSTANCE.mapAccountDtoToAccount(accountDto));

        return AccountMapper.INSTANCE.mapAccountToAccountDto(savedAccount);
    }

    public AccountDto getAccountByEmail(String emailId) {

        Account fetchedAccount =  accountRepo.findByEmail(emailId);
        return  AccountMapper.INSTANCE.mapAccountToAccountDto(fetchedAccount);


    }

    public ResponseEntity<AccountDto>  getAccountDetailsById(Integer id) {
        Optional<Account> fetchedAccount =  accountRepo.findById(id);
        return fetchedAccount.map(account -> new ResponseEntity<>(AccountMapper.INSTANCE.mapAccountToAccountDto(account), HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }
}

