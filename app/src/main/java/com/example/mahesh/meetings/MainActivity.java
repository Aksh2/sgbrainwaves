package com.example.mahesh.meetings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onclicksignup(View v)
    {
        if (v.getId()==R.id.bsignup)
        {
            Intent i =new Intent(MainActivity.this,signup.class);
            startActivity(i);
        }

    }

}
