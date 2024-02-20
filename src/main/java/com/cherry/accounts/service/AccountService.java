package com.cherry.accounts.service;

import com.cherry.accounts.dto.AccountDto;
import com.cherry.accounts.enitity.Account;
import com.cherry.accounts.mapper.AccountMapper;
import com.cherry.accounts.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {

    @Autowired
    AccountRepo accountRepo;



    public AccountDto createAccount(AccountDto accountDto) {

       Account savedAccount = accountRepo.save(AccountMapper.INSTANCE.mapAccountDtoToAccount(accountDto));

        return AccountMapper.INSTANCE.mapAccountToAccountDto(savedAccount);
    }
}

