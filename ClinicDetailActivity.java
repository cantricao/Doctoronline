package com.example.cantri.doctoronline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by cantri on 27/04/2017.
 */

public class ClinicDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clinic_detail);
        final Intent intent = getIntent();
        Clinic clinic = intent.getParcelableExtra("detail");
        if (clinic == null)
            return;
        TextView name = (TextView) findViewById(R.id.clinic_name_detail);
        name.setText(clinic.getName());
        Button listDoctor = (Button) findViewById(R.id.list_doctor);
        listDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), ListDoctorActivity.class);
                startActivity(intent1);
            }
        });
    }
}
