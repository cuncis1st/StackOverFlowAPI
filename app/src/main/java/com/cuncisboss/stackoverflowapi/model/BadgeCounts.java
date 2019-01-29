package com.cuncisboss.stackoverflowapi.model;

import com.google.gson.annotations.SerializedName;


public class BadgeCounts{

	@SerializedName("gold")
	private int gold;

	@SerializedName("silver")
	private int silver;

	@SerializedName("bronze")
	private int bronze;

	public int getGold(){
		return gold;
	}

	public int getSilver(){
		return silver;
	}

	public int getBronze(){
		return bronze;
	}
}