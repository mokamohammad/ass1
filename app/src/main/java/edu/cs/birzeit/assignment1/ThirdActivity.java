package edu.cs.birzeit.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
     Button calculate;
     Button next;
     EditText kg,cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
         calculate=findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(ThirdActivity.this , fourthActivity.class);
                startActivity(intent3);
            }
        });
        next=findViewById(R.id.Next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(ThirdActivity.this , fiveActivity.class);
                startActivity(intent4);
            }
        });
    }
//    public void btnOnclickcalculate(View view){
//
//        cm = findViewById(R.id.cm);
//        kg = findViewById(R.id.kg);
//
//        String h=cm.getText().toString();
//        String w=kg.getText().toString();
//        if(h != null && !"".equals(h)
//                && w !=null&& !"".equals(w)){
//            double height =Double.parseDouble(h)/100;
//            double weight =Double.parseDouble(w);
//            double BMI =weight/(height*height);
//
//
//        }
    public void buttonClicked(View v){
        EditText editTextW= findViewById(R.id.kg);
        EditText editTextH= findViewById(R.id.cm);
        Button calculate= findViewById(R.id.calculate);

        ;
       // double BMI= findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        EditText r= findViewById(R.id.bmi);
     //   double height=Double.parseDouble(editTextH.getText().toString());
      //  double weight=Double.parseDouble(editTextW.getText().toString());
        if(editTextW.getText().toString().equals("")
                && editTextH.getText().toString().equals("")) {
            Toast.makeText(ThirdActivity.this, "you must enter some details", Toast.LENGTH_SHORT).show();
        }else
                editTextH.getText().toString();
                editTextW.getText().toString();
                double h=Double.valueOf(editTextH.getText().toString());
                double w=Double.valueOf(editTextW.getText().toString());
                double bmi ;
                bmi=w/(h*h);
                r.setText(String.valueOf(bmi));



                String msg = r.getText().toString();

                Intent intent22 = new Intent(getApplicationContext(), fourthActivity.class);
                intent22.putExtra("Result", msg);
                        startActivity(intent22);
            }

    });}
}