package com.cherry.accounts.repo;

import com.cherry.accounts.enitity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

    Account findByEmail(String emailId);

}
