package com.example.cantri.doctoronline;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cantri on 29/04/2017.
 */

class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.MyViewHolder> {
    List<Doctor> doctorList;

    public DoctorAdapter(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.doctor_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Doctor doctor = doctorList.get(position);
        holder.doctor_name.setText(doctor.getUser());
        holder.doctor_specialty.setText(doctor.getSpecialty());
    }


    @Override
    public int getItemCount() {
        return doctorList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView doctor_name, doctor_specialty;

        public MyViewHolder(View itemView) {
            super(itemView);
            doctor_name = (TextView) itemView.findViewById(R.id.doctor_name);
            doctor_specialty = (TextView) itemView.findViewById(R.id.doctor_specialty);
        }
    }
}
