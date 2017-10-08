package com.bdjobs.training.loginpage;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userName, password;
    TextInputLayout userIL, passIL;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userIL = (TextInputLayout) findViewById(R.id.usernameWrapper);
        passIL = (TextInputLayout) findViewById(R.id.passwordWrapper);
        userIL.setHint("Sign in with email");
        passIL.setHint("Password");
        t1 = (TextView) findViewById(R.id.textView);
        t1.setText(Html.fromHtml("Don't have an account? <B>Sign up!<B/>"));


    }
}
