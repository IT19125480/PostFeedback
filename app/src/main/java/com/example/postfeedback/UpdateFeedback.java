package com.example.postfeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UpdateFeedback extends AppCompatActivity {

    Button button3,button4;
    String takeExtra;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context1 = getApplicationContext();
                CharSequence text1 = "Details saved successfully!";
                int duration1 = Toast.LENGTH_LONG;
                Toast toast1 = Toast.makeText(context1, text1, duration1);
                toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast1.show();
                Intent intent2 = new Intent(UpdateFeedback.this,SendMessage.class);
                startActivity(intent2);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context2 = getApplicationContext();
                CharSequence text2 = "Delete message";
                int duration2 = Toast.LENGTH_LONG;
                Toast toast2 = Toast.makeText(context2, text2, duration2);
                toast2.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast2.show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_feedback);

        Intent myIntent = getIntent();
        takeExtra = myIntent.getStringExtra("MAIN_EXTRA");

        button3.findViewById(R.id.button3);
        button4.findViewById(R.id.button4);


    }
}