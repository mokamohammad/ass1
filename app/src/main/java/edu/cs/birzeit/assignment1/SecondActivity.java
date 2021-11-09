package edu.cs.birzeit.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class SecondActivity extends AppCompatActivity {
    Button login;
    Spinner spinner;
    List<String> list;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    EditText name, email, phone, password, date;
    CheckBox check;
//    SharedPreferences preferences=getSharedPreferences("CheckBox",MODE_PRIVATE);
//   String checkbox= preferences.getString("check","");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.email);
        password = findViewById(R.id.password);
        date = findViewById(R.id.date);
        check = findViewById(R.id.check);

        spinner = findViewById(R.id.spinner);
        list = new ArrayList<>();
        list.add("select gender");
        list.add("Male");
        list.add("Female");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position >= 1)
                    Toast.makeText(SecondActivity.this, list.get(position), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);

                //

            }


        });
    }
}
     //  check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (buttonView.isChecked()){
//                    SharedPreferences preferences= getSharedPreferences("checkbox",MODE_PRIVATE);
//                    SharedPreferences.Editor editor= preferences.edit();
//                   // editor.putString("remember",true);
//                    editor.apply();
//                    Toast.makeText(SecondActivity.this,"checked", Toast.LENGTH_SHORT).show();
//
//                }else if(!buttonView.isChecked()){
//                    SharedPreferences preferences= getSharedPreferences("checkbox",MODE_PRIVATE);
//                    SharedPreferences.Editor editor= preferences.edit();
//                   // editor.putString("remember",false);
//                    editor.apply();
//                    Toast.makeText(SecondActivity.this,"unchecked", Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
//
//
//    }
//
//
//    private void setupSharedprefs() {
//        prefs = PreferenceManager.getDefaultSharedPreferences(this);
//        editor = prefs.edit();
//    }
//
//    private void setupViews() {
//        check = findViewById(R.id.check);
//        name = findViewById(R.id.name);
//        email = findViewById(R.id.email);
//        phone = findViewById(R.id.phone);
//        password = findViewById(R.id.password);
//        date = findViewById(R.id.date);
//    }

