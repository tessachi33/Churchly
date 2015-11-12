package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;

public class churchActivity extends AppCompatActivity {


    @Bind(R.id.userButton) Button mUserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church);
        ButterKnife.bind(this);

        mUserButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(churchActivity.this, userActivity.class);
                startActivity(intent);

            }
        });

    }

}
