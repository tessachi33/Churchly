package io.github.tessachi33.churchly.models;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Tessa on 11/11/15.
 */

@ParseClassName("_User")

public class User extends ParseObject {

    public User(){
        super();
    }

    public String getUsername() {
        return getString("username");
    }

    public String getPassword() {
        return getString("pasword");
    }

    public String getZipcode() {
        return getString("Zipcode");
    }

    public String getEmail() {
        return getString("email");
    }

}
