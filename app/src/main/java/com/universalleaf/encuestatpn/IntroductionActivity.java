package com.universalleaf.encuestatpn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class IntroductionActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);



    }


    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, PollstartActivity.class);
        startActivity(i);
    }
}
