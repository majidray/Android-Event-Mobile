package com.android.DataMahasiswaList;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainFragment extends Fragment {
    View view;
    ListView lv;
    ArrayAdapter<String> adapter;
    private ArrayList<String> data;

    String[] angkatan = {"2017", "2018", "2019"};

    public MainFragment() {
        // Required empty public constructor
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);

        lv = (ListView) view.findViewById(R.id.listView);

        data = new ArrayList<>();
        getData();

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, angkatan);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String g_angkatan = data.get(position);
                loadFragment(MahasiswaFragment.newInstance(g_angkatan));
//                Intent sendData = new Intent(getActivity(), MahasiswaActivity.class);
//                sendData.putExtra("angkatan", g_angkatan);
//
//                startActivity(sendData);
            }
        });
        return view;
    }

    private void getData() {
        Collections.addAll(data, angkatan);
    }

    private void loadFragment(Fragment fragment) {
        // create a FragmentManager
        //FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment, "main_fragment");
        transaction.commit(); // save the changes
    }
}