package io.github.tessachi33.churchly.ui;


import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;

import com.parse.Parse;

import io.github.tessachi33.churchly.R;

public class MainActivity extends AppCompatActivity {

    private Button mLoginButton;
    private Button mSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "hz4ABkxiLqsPDHxUYrHqh0DJAkKVuWTXA2xI4Q2V", "RpUcKjAzyx76UBkwbrWyT2SxRiV7oKGfY39We9GO");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginButton = (Button) findViewById(R.id.loginButton);
        mSignupButton = (Button) findViewById(R.id.signupButton);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });

        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignupActivity2.class);
                startActivity(intent);
            }
        });
    }
}


