package io.github.tessachi33.churchly.models;

/**
 * Created by Tessa on 10/28/15.
 */
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.io.File;
import java.text.ParseException;
import java.util.List;

import io.github.tessachi33.churchly.ui.MainActivity;

@ParseClassName("Church")


public class Church extends ParseObject {

    public static List<Church> mChurches;
//
//    private static Church mChurch;
//
//    public static Church getChurch() {
//        return mChurch;
//    }

    public Church() {
        super();
    }

    public String getName() { return getString("name"); }

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


    public static List<Church> getAllChurches() {
        return mChurches;
    }

    public static void getChurches(final Activity context, final Runnable runnable) {
        ParseQuery<Church> query = ParseQuery.getQuery(Church.class);
        query.findInBackground(new FindCallback<Church>() {
            @Override
            public void done(List<Church> Churches, com.parse.ParseException e) {
                if (e == null) {
                    mChurches = Churches;
                    context.runOnUiThread(runnable);
                } else {
                    Log.d("Church", "Error: " + e.getMessage());

                }
            }
        });

    }

}


