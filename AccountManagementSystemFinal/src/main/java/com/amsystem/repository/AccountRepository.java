package com.amsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amsystem.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}
