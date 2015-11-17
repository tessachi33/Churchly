package io.github.tessachi33.churchly.ui;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;
import io.github.tessachi33.churchly.models.Church;



public class SingleChurchActivity extends AppCompatActivity {

    private Church mChurch;
   // private ParseObject Church;
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
        String churchName = intent.getStringExtra("churchName");
        ParseQuery<Church> query =  ParseQuery.getQuery(Church.class);
        query.whereEqualTo("name", churchName);
        query.getFirstInBackground(new GetCallback() {
            @Override
            public void done(ParseObject object, ParseException e) {
            }

            @Override
            public void done(Object o, Throwable throwable) {
                Church church = (Church) o;
                String mName = church.getName();
                String mAddress = church.getAddress();
                String mPhone = church.getPhone();
                String mWebsite = church.getWebsite();
                String mImage = church.getImage();
                String mReview = church.getReview();

                mChurchName.setText(mName);
                mChurchAddress.setText(mAddress);
                mChurchPhone.setText(mPhone);
                mChurchWebsite.setText(mWebsite);
                mChurchImage.setText(mImage);
                mChurchReview.setText(mReview);
            }
        });



        mUserButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingleChurchActivity.this, UserActivity.class);
                startActivity(intent);

            }
        });
    }

}