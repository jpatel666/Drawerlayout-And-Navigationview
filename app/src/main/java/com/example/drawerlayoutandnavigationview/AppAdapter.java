package com.example.drawerlayoutandnavigationview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.MyClass> {

    Activity activity;
    int[] userimg;
    String[] username;

    public AppAdapter(Activity activity, int[] userimg, String[] username) {
        this.activity = activity;
        this.userimg = userimg;
        this.username = username;
    }

    @NonNull
    @Override
    public AppAdapter.MyClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.chat_app_layout,parent,false);
        MyClass myClass = new MyClass(view);
        return myClass;
    }

    @Override
    public void onBindViewHolder(@NonNull AppAdapter.MyClass holder, int position) {

        holder.ivUserimg.setImageResource(userimg[position]);
        holder.tvUsername.setText(username[position]);


        holder.Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, username[position], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return userimg.length;
    }

    public class MyClass extends RecyclerView.ViewHolder {

        LinearLayout Click;

        ImageView ivUserimg;

        TextView tvUsername;
        public MyClass(@NonNull View itemView) {
            super(itemView);

            Click = itemView.findViewById(R.id.Click);
            ivUserimg = itemView.findViewById(R.id.ivUserimg);
            tvUsername = itemView.findViewById(R.id.tvUsername);
        }
    }
}
