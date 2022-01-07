package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        //Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PRLPQbMOFqcoxsUU97Zg6erCgs6VdlVq7VKuzYZi")
                .clientKey("oYMzjKx5k9KChMB1icwJqXUBrGoEzr6NHQWa9Coo")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
