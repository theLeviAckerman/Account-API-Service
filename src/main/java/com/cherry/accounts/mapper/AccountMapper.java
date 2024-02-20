package com.cherry.accounts.mapper;

import com.cherry.accounts.dto.AccountDto;
import com.cherry.accounts.enitity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account mapAccountDtoToAccount(AccountDto accountDto);
    AccountDto mapAccountToAccountDto(Account account);
}
