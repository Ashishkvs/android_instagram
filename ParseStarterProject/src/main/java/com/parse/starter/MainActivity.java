/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Parse oBject pass Class name as argument and save it to db
/*    ParseObject score=new ParseObject("Score");
    score.put("username","Ashish");
    score.put("score",86);
    score.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {

        if(e==null){
          Log.i("Save in background","Successfull");
        }else{
          Log.i("save in background", "Failed error"+e.toString());
        }
      }
    });*/

//fetch object via class Name
  /*  ParseQuery<ParseObject> query=ParseQuery.getQuery("Score");
    query.getInBackground("THjP1pRkZa", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {

        if(e==null && object !=null){
          object.put("score",200);
          object.saveInBackground();

          Log.i("objectValue",object.getString("username"));
         Log.i("objectValue",Integer.toString(object.getInt("score")));


        }
      }
    });*/

/*  ParseObject tweet=new ParseObject("Tweet");
  tweet.put("username","ashishkvs");
  tweet.put("tweet","hello 1st tweet");
  tweet.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
          if(e==null){
              Log.i("tweet","saved successfully");
          }else{

              Log.i("tweet","failed to save");
          }
      }
  });*/
 /*       ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweet");
        query.getInBackground("dpuWLwcmy8", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(e==null && object !=null){
                    object.put("tweet","tweet updated");
                    object.saveInBackground();

                    Log.i("tweet updated",object.getString("tweet"));
                }else{
                    Log.i("Save in background","Failed"+e.toString());
                }
            }
        });*/

      /*  ParseQuery<ParseObject> query=ParseQuery.getQuery("Score");
        query.whereEqualTo("username","Ashish");  //find username from coulm
        query.setLimit(1);  //no of data to be fetched

        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e==null){
                    Log.i("find in background","Retrived"+objects.size()+"objects");
                }
                if(objects.size()>0){
                    for(ParseObject object:objects){
                        Log.i("Find in background ",Integer.toString(object.getInt("score")));
                    }
                }
            }
        });*/

      //update score who has score more than 100
   /*     ParseQuery<ParseObject> query=ParseQuery.getQuery("Score");
        query.whereGreaterThan("score",200);
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e==null && objects !=null){
                    for(ParseObject object:objects){
                        object.put("score",object.getInt("score")+50);
                        object.saveInBackground();
                    }
                }
            }
        });*/

   //CREATE USER
      /*  ParseUser user=new ParseUser();
        user.setUsername("ashishkvs");
        user.setPassword("009inspired");
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if(e==null){
                    Log.i("Sign up" ,"Successfull");
                }else{
                    Log.i("Sign up","Failed");
                }
            }
        });
*/

      ParseUser.logOut();
      if(ParseUser.getCurrentUser()!=null){
          Log.i("currentUser","User Logged in"+ParseUser.getCurrentUser().getUsername());

      }else{
          Log.i("currentUser","User not logged in");
      }
//LOGIN USER
     /*   ParseUser.logInInBackground("ashishkvs", "abcd", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if(user != null){
                    Log.i("Login","Successfull");
                }else{

                    Log.i("Login","Failed"+e.toString());
                }
            }
        });*/










        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }

}