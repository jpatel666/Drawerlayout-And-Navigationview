package com.example.drawerlayoutandnavigationview.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawerlayoutandnavigationview.R;


public class ChatFragment extends Fragment {

    /*
    New---Fragment---Fragment(Blank)
                                                               //
    All Comments And Method etc... All Remove But Only onCreateView(LayOut..) Method As It Is

    Fragment In Context:-getActivity()
    */
    @Override        //
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_chat, container, false);



    }
}