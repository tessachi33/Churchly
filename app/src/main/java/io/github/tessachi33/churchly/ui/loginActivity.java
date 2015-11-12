package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseUser;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;

public class loginActivity extends AppCompatActivity {
    @Bind(R.id.loginButton) Button mLoginButton;
//    @Bind(R.id.Username) EditText mUsername;
//    @Bind(R.id.Email) EditText mEmail;
//    @Bind(R.id.Password) EditText mPassword;
//    @Bind(R.id.Zipcode) EditText mZipcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, userActivity.class);
                startActivity(intent);
                ParseUser currentUser = ParseUser.getCurrentUser();
                if (currentUser != null) {
                    // do stuff with the user
                } else {
                    // show the signup or login screen
                }

            }
        });
    }

}
