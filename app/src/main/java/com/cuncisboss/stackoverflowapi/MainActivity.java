package com.cuncisboss.stackoverflowapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.cuncisboss.stackoverflowapi.adapter.UserAdapter;
import com.cuncisboss.stackoverflowapi.api.ApiClient;
import com.cuncisboss.stackoverflowapi.api.TheStackOverflowApi;
import com.cuncisboss.stackoverflowapi.model.BadgeCounts;
import com.cuncisboss.stackoverflowapi.model.User;
import com.cuncisboss.stackoverflowapi.model.UsersStackOverflow;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    List<User> userList;
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(userList, MainActivity.this);
        recyclerView.setAdapter(adapter);
        loadUsers();
    }

    private void loadUsers() {
        TheStackOverflowApi theStackOverflowApi = new ApiClient().getClient().create(TheStackOverflowApi.class);
        Call<UsersStackOverflow> call = theStackOverflowApi.getUsers("reputation");
        call.enqueue(new Callback<UsersStackOverflow>() {
            @Override
            public void onResponse(Call<UsersStackOverflow> call, Response<UsersStackOverflow> response) {
                if (response.isSuccessful()) {
                    userList.clear();
                    userList.addAll(response.body().getItems());
//                    adapter = new UserAdapter(userList, MainActivity.this);
//                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();

                    List<User> users = response.body().getItems();
                    for (User user: users) {
                        Log.d(TAG, "onResponse: \nUsername: " + user.getDisplayName() + "\n" +
                                "Reputation: " + user.getReputation() + "\n" +
                                "Location: " + user.getLocation() + "\n" +
                                "Golden: " + user.getBadgeCounts().getGold() + "\n" +
                                "Silver: " + user.getBadgeCounts().getSilver() + "\n" +
                                "Bronze: " + user.getBadgeCounts().getBronze() + "\n"
                        );
                    }
                } else {
                    Log.d(TAG, "onResponse: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<UsersStackOverflow> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}
