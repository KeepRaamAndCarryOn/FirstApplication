package com.example.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView outputText;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Initialize java objects to objects from view
        outputText = (TextView) findViewById(R.id.outputTextBox);

        Intent i = getIntent();
        outputText.setText( ((Intent) i).getDataString());
    }
}
