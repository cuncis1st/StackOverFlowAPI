package com.cuncisboss.stackoverflowapi.api;

import com.cuncisboss.stackoverflowapi.model.UsersStackOverflow;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TheStackOverflowApi {

    @GET("/2.2/users?page=1&pagesize=15&order=desc&site=stackoverflow")
    Call<UsersStackOverflow> getUsers(@Query("sort") String sort);
}
