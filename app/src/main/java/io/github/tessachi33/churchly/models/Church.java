package io.github.tessachi33.churchly.models;

/**
 * Created by Tessa on 10/28/15.
 */
import android.app.ListActivity;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.text.ParseException;
import java.util.List;

import io.github.tessachi33.churchly.ui.MainActivity;

@ParseClassName("Church")


public class Church extends ParseObject {

    public static List<Church> mChurch;

    public Church() {
        super();
    }

    public String getName() {
        return getString("name");
    }

    public String getImage() {
        return getString("image");
    }

    public String getAddress() {
        return getString("address");
    }

    public String getPhone() {
        return getString("phone");
    }

    public String getReview() {
        return getString("review");
    }

    public String getWebsite() {
        return getString("website");
    }


    public static List<Church> getChurch() {
        return mChurch;
    }

    public List getChurches() {
        ParseQuery<Church> query = ParseQuery.getQuery("Church");
        query.findInBackground(new FindCallback<Church>() {
            @Override
            public void done(List<Church> objects, com.parse.ParseException e) {
                if (e == null) {
                    Log.d("Church", "Retrieved " + getChurches());
                } else {
                    Log.d("Church", "Error: " + e.getMessage());

                }
            }
        });

        return getChurches();
    }
}

//        query.whereEqualTo(getName(), "name");
//        query.whereEqualTo(getImage(), "image");
//        query.whereEqualTo(getAddress(), "address");
//        query.whereEqualTo(getPhone(), "phone");
//        query.whereEqualTo(getReview(), "review");
//        query.whereEqualTo(getWebsite(), "website");
