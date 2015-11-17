package io.github.tessachi33.churchly.ui;

import android.app.Application;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.parse.Parse;
import com.parse.ParseObject;

import io.github.tessachi33.churchly.R;
import io.github.tessachi33.churchly.models.Church;
import io.github.tessachi33.churchly.models.User;

public class ChurchApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Church.class);
        ParseObject.registerSubclass(User.class);
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "hz4ABkxiLqsPDHxUYrHqh0DJAkKVuWTXA2xI4Q2V", "RpUcKjAzyx76UBkwbrWyT2SxRiV7oKGfY39We9GO");

    }
}
