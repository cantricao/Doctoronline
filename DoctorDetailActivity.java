package com.example.cantri.doctoronline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by cantri on 29/04/2017.
 */

public class DoctorDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_detail);
        final Intent intent = getIntent();
        Doctor doctor = intent.getParcelableExtra("detail");
        if (doctor != null) {
            TextView name = (TextView) findViewById(R.id.doctor_name_detail);
            name.setText(doctor.getUser());
            Button request = (Button) findViewById(R.id.request);
            request.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent1 = new Intent(getApplicationContext(), MakeRequestActivity.class);
                    startActivity(intent1);
                }
            });
        }
    }
}