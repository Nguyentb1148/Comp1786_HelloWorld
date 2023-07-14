package com.example.comp1786_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the GUI
        TextView helloWorld=(TextView) findViewById(R.id.helloWorldText);

        int num =0;
        Random random=new Random();
        num=random.nextInt(100);
        num++;

        //Output the result
        helloWorld.setTextSize(40);
        helloWorld.setTextColor(Color.BLACK);
        helloWorld.setText("Hello Men !\n");
        helloWorld.append("Your num is: "+num);

        if (num<50){
            helloWorld.setTextColor(Color.RED);
            helloWorld.append("\n Sorry you failed");
        } else if (num<70) {
            helloWorld.setTextColor(Color.BLUE);
            helloWorld.append("\n Well done you passed");
        } else {
            helloWorld.setTextColor(Color.GREEN);
            helloWorld.append("\n Brilliant, you got a distinction");
        }
    }
}