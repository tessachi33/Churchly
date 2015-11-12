package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import io.github.tessachi33.churchly.R;

public class userActivity extends AppCompatActivity {

    private ArrayList<String> mUser;
    private Button mChurchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mChurchButton = (Button) findViewById(R.id.signupButton);

        mChurchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userActivity.this, churchActivity.class);
                startActivity(intent);
            }
        });
    }

}
