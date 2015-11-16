package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.parse.ParseUser;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;

public class userActivity extends AppCompatActivity {

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
                Intent intent = new Intent(userActivity.this, ChurchActivity.class);
                startActivity(intent);

            }
        });
    }

}
