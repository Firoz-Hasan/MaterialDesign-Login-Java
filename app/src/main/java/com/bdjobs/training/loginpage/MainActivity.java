package com.bdjobs.training.loginpage;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText userName, password;
    TextInputLayout userIL, passIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userIL = (TextInputLayout) findViewById(R.id.usernameWrapper);
        passIL = (TextInputLayout) findViewById(R.id.passwordWrapper);
        userIL.setHint("Sign in with email");
        passIL.setHint("Password");

    }
}
