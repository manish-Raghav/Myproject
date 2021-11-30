package com.example.roomslink;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Fatchimage extends Fragment {

      RecyclerView recyclerView ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fatchimage, container, false);
         recyclerView = view.findViewById(R.id.frecl);
         recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Call<List<Backdata>> call =Reapi.getInstance().getApidata().getdata();
        call.enqueue(new Callback<List<Backdata>>() {
            @Override
            public void onResponse(Call<List<Backdata>> call, Response<List<Backdata>> response) {

            }

            @Override
            public void onFailure(Call<List<Backdata>> call, Throwable t) {

            }
        });


        return view;
    }
}