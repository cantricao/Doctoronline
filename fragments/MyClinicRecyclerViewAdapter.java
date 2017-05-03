package com.example.cantri.doctoronline.fragments;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cantri.doctoronline.Clinic;
import com.example.cantri.doctoronline.ClinicDetailActivity;
import com.example.cantri.doctoronline.R;
import com.example.cantri.doctoronline.fragments.ClinicFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a  and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyClinicRecyclerViewAdapter extends RecyclerView.Adapter<MyClinicRecyclerViewAdapter.ViewHolder> {

    private final List<Clinic> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyClinicRecyclerViewAdapter(List<Clinic> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_clinic, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.clinic_key.setText(mValues.get(position).getKey());
        holder.clinic_name.setText(mValues.get(position).getName());
        holder.clinic_specialty.setText(mValues.get(position).getSpecialty());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected
                    Intent intent = new Intent(v.getContext(), ClinicDetailActivity.class);
                    intent.putExtra("detail", holder.mItem);
                    v.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public Clinic mItem;
        TextView clinic_name, clinic_specialty, clinic_key;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            clinic_name = (TextView) itemView.findViewById(R.id.clinic_name);
            clinic_key = (TextView) itemView.findViewById(R.id.clinic_key);
            clinic_specialty = (TextView) itemView.findViewById(R.id.clinic_specialty);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + clinic_key.getText() + "'" + clinic_name.getText() + "'" + clinic_specialty.getText() + "'";
        }
    }
}
