package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.github.tessachi33.churchly.R;

public class signupActivity extends AppCompatActivity {

    private Button mSignupButton;
    private EditText mSignupName;
    private EditText mSignupEmail;
    private EditText mSignupLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mSignupButton = (Button) findViewById(R.id.signupButton);

        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signupActivity.this, userActivity.class);
                startActivity(intent);
            }
        });


    }

}
