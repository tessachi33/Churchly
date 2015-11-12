package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.Parse;

import io.github.tessachi33.churchly.R;

public class signupActivity extends AppCompatActivity {

    private Button mSignupButton;
    private EditText mSignupName;
    private EditText mSignupEmail;
    private EditText mSignupPassword;
    private EditText mSignupLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Parse.initialize(this, "hz4ABkxiLqsPDHxUYrHqh0DJAkKVuWTXA2xI4Q2V", "RpUcKjAzyx76UBkwbrWyT2SxRiV7oKGfY39We9GO");


        mSignupButton = (Button) findViewById(R.id.signupButton);

        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signupActivity.this, userActivity.class);
                startActivity(intent);

                mSignupName = (EditText) findViewById(R.id.signupName);
                mSignupEmail = (EditText) findViewById(R.id.signupEmail);
                mSignupPassword = (EditText) findViewById(R.id.signupPassword);
                mSignupLocation = (EditText) findViewById(R.id.signupLocation);

            }
        });


    }

}
