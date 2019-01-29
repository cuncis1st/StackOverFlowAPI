package com.cuncisboss.stackoverflowapi.model;


import com.google.gson.annotations.SerializedName;


public class User {

	@SerializedName("reputation_change_quarter")
	private int reputationChangeQuarter;

	@SerializedName("link")
	private String link;

	@SerializedName("last_modified_date")
	private int lastModifiedDate;

	@SerializedName("last_access_date")
	private int lastAccessDate;

	@SerializedName("reputation")
	private int reputation;

	@SerializedName("badge_counts")
	private BadgeCounts badgeCounts;

	@SerializedName("creation_date")
	private int creationDate;

	@SerializedName("display_name")
	private String displayName;

	@SerializedName("reputation_change_year")
	private int reputationChangeYear;

	@SerializedName("accept_rate")
	private int acceptRate;

	@SerializedName("is_employee")
	private boolean isEmployee;

	@SerializedName("profile_image")
	private String profileImage;

	@SerializedName("account_id")
	private int accountId;

	@SerializedName("user_type")
	private String userType;

	@SerializedName("website_url")
	private String websiteUrl;

	@SerializedName("reputation_change_week")
	private int reputationChangeWeek;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("reputation_change_day")
	private int reputationChangeDay;

	@SerializedName("location")
	private String location;

	@SerializedName("reputation_change_month")
	private int reputationChangeMonth;

	public int getReputationChangeQuarter(){
		return reputationChangeQuarter;
	}

	public String getLink(){
		return link;
	}

	public int getLastModifiedDate(){
		return lastModifiedDate;
	}

	public int getLastAccessDate(){
		return lastAccessDate;
	}

	public int getReputation(){
		return reputation;
	}

	public BadgeCounts getBadgeCounts(){
		return badgeCounts;
	}

	public int getCreationDate(){
		return creationDate;
	}

	public String getDisplayName(){
		return displayName;
	}

	public int getReputationChangeYear(){
		return reputationChangeYear;
	}

	public int getAcceptRate(){
		return acceptRate;
	}

	public boolean isIsEmployee(){
		return isEmployee;
	}

	public String getProfileImage(){
		return profileImage;
	}

	public int getAccountId(){
		return accountId;
	}

	public String getUserType(){
		return userType;
	}

	public String getWebsiteUrl(){
		return websiteUrl;
	}

	public int getReputationChangeWeek(){
		return reputationChangeWeek;
	}

	public int getUserId(){
		return userId;
	}

	public int getReputationChangeDay(){
		return reputationChangeDay;
	}

	public String getLocation(){
		return location;
	}

	public int getReputationChangeMonth(){
		return reputationChangeMonth;
	}
}