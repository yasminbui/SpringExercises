package com.amsystem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amsystem.model.Account;

public class AccountStub {
	private static Map<Long, Account> accounts = new HashMap<Long, Account>();
	private static Long idIndex = 3L;

	//populate initial accounts
	static {
		Account a = new Account(1L, "Babagak", "Savings", 44.12, 138.44, 2018);
		accounts.put(1L, a);
		Account b = new Account(2L, "Grom-Gil-Gorm", "Checking", 43.12, 137.44, 2018);
		accounts.put(2L, b);
		Account c = new Account(3L, "Sir Leemington", "Current", 25.03, 77.39, 2018);
		accounts.put(3L, c);
	}

	public static List<Account> list() {
		return new ArrayList<Account>(accounts.values());
	}

	public static Account create(Account account) {
		idIndex += idIndex;
		account.setId(idIndex);
		accounts.put(idIndex, account);
		return account;
	}

	public static Account get(Long id) {
		return accounts.get(id);
	}

	public static Account update(Long id, Account account) {
		accounts.put(id, account);
		return account;
	}

	public static Account delete(Long id) {
		return accounts.remove(id);
	}
}
