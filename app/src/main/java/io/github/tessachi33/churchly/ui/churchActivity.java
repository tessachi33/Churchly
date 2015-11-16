package io.github.tessachi33.churchly.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.parse.ParseObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.tessachi33.churchly.R;
import io.github.tessachi33.churchly.models.Church;

public class ChurchActivity extends AppCompatActivity {


    @Bind(R.id.userButton) Button mUserButton;
    @Bind (R.id.churchView) ListView mListView;
    private List<Church> mChurches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church);
        ButterKnife.bind(this);

        Church.getChurches(ChurchActivity.this, new Runnable() {
            @Override
            public void run() {

                mChurches = Church.getAllChurches();
                List<String> Churches = new ArrayList<String>();
                for (ParseObject thisChurch : mChurches){
                    String churchName = thisChurch.getString("name");
                    Churches.add(churchName);

                }
                setThatList(Churches, mListView);

                makeListClickable(mListView);


            }

        });



                mUserButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ChurchActivity.this, userActivity.class);
                        startActivity(intent);

                    }
                });

    }


    public void setThatList(List<String> stringList, ListView listView) {
      ArrayAdapter arrayAdapter = new ArrayAdapter<>(
                ChurchActivity.this,
                android.R.layout.simple_list_item_1,
                stringList);
        listView.setAdapter(arrayAdapter);
    }

    public void makeListClickable(ListView listView) {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                final String churchName = (String) arg0.getItemAtPosition(position);
                Intent intent = new Intent(ChurchActivity.this, SingleChurchActivity.class);
                intent.putExtra("churchName", churchName);
                startActivity(intent);


            }
        });
    }

}
