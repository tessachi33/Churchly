package io.github.tessachi33.churchly.models;

/**
 * Created by Tessa on 10/28/15.
 */
import android.app.ListActivity;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.List;

import io.github.tessachi33.churchly.ui.MainActivity;

@ParseClassName("Church")


public class Church extends ParseObject {

    public static List<Church> mChurch;

    public Church(){
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

}
