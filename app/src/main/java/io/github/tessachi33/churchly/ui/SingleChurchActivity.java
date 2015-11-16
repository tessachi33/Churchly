package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.parse.ParseObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;
import io.github.tessachi33.churchly.models.Church;



public class SingleChurchActivity extends AppCompatActivity {

    private Church mChurch;
    private String mAddress;
    @Bind(R.id.userButton)
    Button mUserButton;
    @Bind (R.id.churchName) TextView mChurchName;
    @Bind (R.id.churchAddress) TextView mChurchAddress;
    @Bind (R.id.churchPhone) TextView mChurchPhone;
    @Bind (R.id.churchWebsite) TextView mChurchWebsite;
    @Bind (R.id.churchImage) TextView mChurchImage;
    @Bind (R.id.churchReview) TextView mChurchReview;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_church);
        ButterKnife.bind(this);




        Intent intent = getIntent();
        final String churchName = intent.getStringExtra("churchName");
//        findChurchByName

        Church.findChurchByName(churchName, SingleChurchActivity.this, new Runnable() {
            @Override
            public void run() {


                mChurch = Church.getChurch();
                //setThisStuff(mChurch);
                mAddress = mChurch.getString("address");

            }

        });


        mUserButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingleChurchActivity.this, userActivity.class);
                startActivity(intent);

            }
        });
    }

//    public void setThisStuff(Church thisChurch){
//        mAddress = thisChurch.getString("address");
//        mChurchAddress.setText(mAddress);
//
//    }
}