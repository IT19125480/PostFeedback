package com.example.postfeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    TextView textView3,name,email,multiLine;
    Button button,button2;
    Toast toast;
    String myExtra = "text";

    @Override
    protected void onResume() {
        super.onResume();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UpdateFeedback.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "sending message";
                int duration = Toast.LENGTH_LONG;
                toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();
                getIntent().putExtra("MAIN_EXTRA", myExtra);
                Intent intent1 = new Intent(MainActivity.this,SendMessage.class);
                startActivity(intent1);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView3 = findViewById(R.id.textView3);
        textView3.setText(R.string.Msg2);

        name = findViewById(R.id.name);
        name.setText(R.string.Msg1);

        email = findViewById(R.id.email);
        email.setText(R.string.Msg3);

        multiLine = findViewById(R.id.multiLine);
        multiLine.setText(R.string.Msg4);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        }
}