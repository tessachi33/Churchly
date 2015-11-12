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
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;

public class loginActivity extends AppCompatActivity {
    @Bind(R.id.loginButton) Button mLoginButton;
  // @Bind(R.id.Username) EditText mUsername;
    //@Bind(R.id.Email) EditText mEmail;
  //  @Bind(R.id.Password) EditText mPassword;
//    @Bind(R.id.Zipcode) EditText mZipcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);



        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  String Username = mUsername.getText().toString();
                //String Email = mEmail.getText().toString();
             //   String Password = mPassword.getText().toString();

                ParseUser.logInInBackground("Username", "Password", new LogInCallback() {
                    public void done(ParseUser user, ParseException e) {
                        if (user != null) {
                            Intent intent = new Intent(loginActivity.this, userActivity.class);
                            startActivity(intent);
                            Toast.makeText(loginActivity.this,
                                    "Hurray, you logged in!", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(loginActivity.this,
                                    "oops, you haven't logged in!", Toast.LENGTH_LONG).show();
                        }
                    }

                });
            }
        });
    }
}
