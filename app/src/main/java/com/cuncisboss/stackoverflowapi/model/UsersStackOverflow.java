package com.cuncisboss.stackoverflowapi.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class UsersStackOverflow {

	@SerializedName("quota_max")
	private int quotaMax;

	@SerializedName("quota_remaining")
	private int quotaRemaining;

	@SerializedName("has_more")
	private boolean hasMore;

	@SerializedName("items")
	private List<User> items;

	public int getQuotaMax(){
		return quotaMax;
	}

	public int getQuotaRemaining(){
		return quotaRemaining;
	}

	public boolean isHasMore(){
		return hasMore;
	}

	public List<User> getItems(){
		return items;
	}
}