package com.example.cantri.doctoronline;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MakeRequestActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText inputUser, inputDescription, inputPhotoUrl, inputTime;
    private TextInputLayout inputLayoutUser, inputLayoutDescription, inputLayoutPhotoUrl, inputLayoutTime;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_request);

        inputLayoutUser = (TextInputLayout) findViewById(R.id.input_layout_user);
        inputLayoutDescription = (TextInputLayout) findViewById(R.id.input_layout_description);
        inputLayoutPhotoUrl = (TextInputLayout) findViewById(R.id.input_layout_photoUrl);
        inputLayoutTime = (TextInputLayout) findViewById(R.id.input_layout_time);
        inputUser = (EditText) findViewById(R.id.input_user);
        inputDescription = (EditText) findViewById(R.id.input_description);
        inputPhotoUrl = (EditText) findViewById(R.id.input_photoUrl);
        inputTime = (EditText) findViewById(R.id.input_time);
        btnSignUp = (Button) findViewById(R.id.btn_signup);

        inputUser.addTextChangedListener(new MyTextWatcher(inputUser));
        inputDescription.addTextChangedListener(new MyTextWatcher(inputDescription));
        inputPhotoUrl.addTextChangedListener(new MyTextWatcher(inputPhotoUrl));
        inputTime.addTextChangedListener(new MyTextWatcher(inputTime));
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitForm();
            }

            private void submitForm() {
                if (!validateUser()) {
                    return;
                }

                if (!validateDescription()) {
                    return;
                }

                if (!validatePhotoUrl()) {
                    return;
                }
                if (!validateTime()) {
                    return;
                }

                Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean validateTime() {
        if (inputTime.getText().toString().trim().isEmpty()) {
            inputLayoutTime.setError("Empty");
            requestFocus(inputTime);
            return false;
        } else {
            inputLayoutTime.setErrorEnabled(false);
        }

        return true;
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private boolean validatePhotoUrl() {
        if (inputPhotoUrl.getText().toString().trim().isEmpty()) {
            inputLayoutPhotoUrl.setError("Empty");
            requestFocus(inputPhotoUrl);
            return false;
        } else {
            inputLayoutPhotoUrl.setErrorEnabled(false);
        }

        return true;
    }

    private boolean validateDescription() {
        if (inputDescription.getText().toString().trim().isEmpty()) {
            inputLayoutDescription.setError("Empty");
            requestFocus(inputDescription);
            return false;
        } else {
            inputLayoutDescription.setErrorEnabled(false);
        }

        return true;
    }

    private boolean validateUser() {
        if (inputUser.getText().toString().trim().isEmpty()) {
            inputLayoutUser.setError("Empty");
            requestFocus(inputUser);
            return false;
        } else {
            inputLayoutUser.setErrorEnabled(false);
        }

        return true;
    }


    private class MyTextWatcher implements TextWatcher {
        private View view;

        public MyTextWatcher(EditText view) {
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.input_user:
                    validateUser();
                    break;
                case R.id.input_description:
                    validateDescription();
                    break;
                case R.id.input_time:
                    validateTime();
                case R.id.input_photoUrl:
                    validatePhotoUrl();
                    break;
            }
        }
    }
}
