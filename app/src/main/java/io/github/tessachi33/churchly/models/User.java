package io.github.tessachi33.churchly.models;

import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

/**
 * Created by Tessa on 11/11/15.
 */

@ParseClassName("_User")

public class User extends ParseObject {

    public static List<User> mUser;


    public User(){
        super();
    }

    public String getUsername() {
        return getString("username");
    }

    public String getPassword() {
        return getString("password");
    }

    public String getZipcode() {
        return getString("Zipcode");
    }

    public String getEmail() {
        return getString("email");
    }

    public static List<User> getUser() {
        return mUser;
    }

   // ParseQuery query = ParseUser.getQeury();
}
