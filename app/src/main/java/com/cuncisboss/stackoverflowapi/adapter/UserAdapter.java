package com.cuncisboss.stackoverflowapi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cuncisboss.stackoverflowapi.R;
import com.cuncisboss.stackoverflowapi.model.BadgeCounts;
import com.cuncisboss.stackoverflowapi.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    List<User> users;
    Context context;

    public UserAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int i) {
        holder.tvUsername.setText(users.get(i).getDisplayName());
        holder.tvReputation.setText(String.valueOf(users.get(i).getReputation()));
        holder.tvLocation.setText(users.get(i).getLocation());

        holder.goldenBadge.setText("goldenBadge : ");
        holder.goldenValue.setText(String.valueOf(users.get(i).getBadgeCounts().getGold()));
        holder.silverBadge.setText("silverBadge : ");
        holder.silverValue.setText(String.valueOf(users.get(i).getBadgeCounts().getSilver()));
        holder.bronzeBadge.setText("bronzeBadge : ");
        holder.bronzeValue.setText(String.valueOf(users.get(i).getBadgeCounts().getBronze()));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        TextView tvUsername, tvReputation, tvLocation;
        TextView goldenBadge, goldenValue;
        TextView silverBadge, silverValue;
        TextView bronzeBadge, bronzeValue;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.tv_userName);
            tvReputation = itemView.findViewById(R.id.tv_userReputation);
            tvLocation = itemView.findViewById(R.id.tv_userLocation);
            goldenBadge = itemView.findViewById(R.id.goldenBadge);
            goldenValue = itemView.findViewById(R.id.goldenValue);
            silverBadge = itemView.findViewById(R.id.silverBadge);
            silverValue = itemView.findViewById(R.id.silverValue);
            bronzeBadge = itemView.findViewById(R.id.bronzeBadge);
            bronzeValue = itemView.findViewById(R.id.bronzeValue);
        }
    }
}
