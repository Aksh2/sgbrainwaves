package com.example.mahesh.meetings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }


    public void onclicksignup1(View v)
    {
        if (v.getId()==R.id.bsignup1)
        {
            Intent i =new Intent(signup.this,date.class);
            startActivity(i);
        }

    }


}
