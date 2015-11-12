package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.Parse;
import com.parse.ParseUser;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;

public class signupActivity extends AppCompatActivity {

    @Bind(R.id.signupButton) Button mSignupButton;
    @Bind(R.id.Username) EditText mUsername;
    @Bind(R.id.Email) EditText mEmail;
    @Bind(R.id.Password) EditText mPassword;
    @Bind(R.id.Zipcode) EditText mZipcode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Parse.initialize(this, "hz4ABkxiLqsPDHxUYrHqh0DJAkKVuWTXA2xI4Q2V", "RpUcKjAzyx76UBkwbrWyT2SxRiV7oKGfY39We9GO");
        ButterKnife.bind(this);


        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signupActivity.this, userActivity.class);
                startActivity(intent);

                String Username = mUsername.getText().toString();
                String Email = mEmail.getText().toString();
                String Password = mPassword.getText().toString();
                String Zipcode = mZipcode.getText().toString();

                ParseUser user = new ParseUser();
                user.setUsername(Username);
                user.setEmail(Email);
                user.setPassword(Password);
                user.put("Zipcode", Zipcode);


            }
        });


    }

}
