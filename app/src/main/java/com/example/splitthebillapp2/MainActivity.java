package com.example.splitthebillapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OnCreate isnt needed, GUI below.

        Button button = (Button)findViewById(R.id.btnPayment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, billSplitPage.class));
            }
        });

    } // end of onCreate
} //end of Main Activity
//Corey Bartlett
//SPC ID 2374833
