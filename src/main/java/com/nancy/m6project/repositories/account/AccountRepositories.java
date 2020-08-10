package com.nancy.m6project.repositories.account;

import com.nancy.m6project.model.account.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositories extends CrudRepository<Account,Long> {
    Account findUsersByEmail(String email);
    Iterable<Account> findAllByNameContaining(String name);
}
