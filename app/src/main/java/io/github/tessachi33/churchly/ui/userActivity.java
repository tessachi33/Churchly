package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseUser;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;

public class UserActivity extends AppCompatActivity {


    @Bind(R.id.logoutButton) Button mLogoutButton;
  @Bind(R.id.churchButton) Button mChurchButton;
//    @Bind(R.id.Username) EditText mUsername;
    @Bind(R.id.user) TextView mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);


        String username = ParseUser.getCurrentUser().getUsername();
        mUser.setText(username);

        mChurchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, ChurchActivity.class);
                startActivity(intent);

            }
        });

        mLogoutButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ParseUser.logOut();
                ParseUser currentUser = ParseUser.getCurrentUser();
                Toast.makeText(UserActivity.this, "Hurray, you logged out!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(UserActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

}
