package com.example.cantri.doctoronline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cantri on 29/04/2017.
 */

public class ListDoctorActivity extends AppCompatActivity {
    private List<Doctor> DoctorList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DoctorAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_doctor);
        recyclerView = (RecyclerView) findViewById(R.id.rlDoctor);

        mAdapter = new DoctorAdapter(DoctorList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareDoctorData();
    }

    private void prepareDoctorData() {
        Doctor Doctor = new Doctor("123", "abc");
        DoctorList.add(Doctor);
        Doctor = new Doctor("123", "abc");
        DoctorList.add(Doctor);
        Doctor = new Doctor("123", "abc");
        DoctorList.add(Doctor);
        Doctor = new Doctor("123", "abc");
        DoctorList.add(Doctor);
        Doctor = new Doctor("123", "abc");
        DoctorList.add(Doctor);
        Doctor = new Doctor("123", "abc");
        DoctorList.add(Doctor);
        Doctor = new Doctor("123", "abc");
        DoctorList.add(Doctor);
        mAdapter.notifyDataSetChanged();
    }
}
