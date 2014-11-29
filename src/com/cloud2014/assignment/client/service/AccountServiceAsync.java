package com.cloud2014.assignment.client.service;

import java.util.ArrayList;

import com.cloud2014.assignment.shared.AccountDTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AccountServiceAsync {
	void verify(String username, String password,
			AsyncCallback<Integer> callback);
	void register(String username, String password, String sd, String n,
			String a, String d, String e, AsyncCallback<Integer> callback);
	void updateAccount(AccountDTO account, AsyncCallback<Integer> callback);
	void blockOrFreeAccount(String username, boolean available,
			AsyncCallback<Integer> callback);
	void deleteAccount(String username, AsyncCallback<Integer> callback);
    void getAccount(String username, AsyncCallback<AccountDTO> callback);
	void getAccountList(AsyncCallback<ArrayList<AccountDTO>> callback);
}
