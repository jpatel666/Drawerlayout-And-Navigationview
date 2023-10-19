package com.example.drawerlayoutandnavigationview.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawerlayoutandnavigationview.AppAdapter;
import com.example.drawerlayoutandnavigationview.R;


public class ChatFragment extends Fragment {

    RecyclerView recyclerView;

    int[] userimg = {R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli,R.drawable.kohli};

    String[] username = {"Jimmy","Chirag","Jaydeep","Yash","Rupin","Tushar","Ashish","Heet","Dishant","Sandeep","Akshay","Raj","Khilan","Rutvik","Kevin"};


    /*
    New---Fragment---Fragment(Blank)
                                                               //
    All Comments And Method etc... All Remove But Only onCreateView(LayOut..) Method As It Is

                             //
    Fragment In Context:-getActivity()
    */
    @Override        //
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
                                                                              //
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

                                                    //
        AppAdapter appAdapter = new AppAdapter(getActivity(),userimg,username);     //Fragment In Context:-getActivity()

        recyclerView.setAdapter(appAdapter);

        return view;

    }
}