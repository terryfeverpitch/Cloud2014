package com.cloud2014.assignment.client.service;

import java.util.ArrayList;

import com.cloud2014.assignment.shared.AccountDTO;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("account")
public interface AccountService extends RemoteService {
	int verify(String username, String password) throws IllegalArgumentException;
	int register(String username, String password, String sd, String n, String a,
			String d, String e);
	int updateAccount(AccountDTO account);
	int blockOrFreeAccount(String username, boolean available);
	int deleteAccount(String username);
	AccountDTO getAccount(String username);
	ArrayList<AccountDTO> getAccountList();
}
