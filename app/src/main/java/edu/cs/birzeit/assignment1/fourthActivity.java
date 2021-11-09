package edu.cs.birzeit.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class fourthActivity extends AppCompatActivity {
      Button nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        nextpage=findViewById(R.id.nextpage);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(fourthActivity.this , fiveActivity.class);
                startActivity(intent4);
            }
        });

        EditText bmi = findViewById(R.id.bmi);

        // create the get Intent object
        Intent intent22 = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = intent22.getStringExtra("message_key");

        // display the string into textView
        bmi.setText(str);
    }
}