package edu.cs.birzeit.assignment1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class fiveActivity extends AppCompatActivity {
    ListView listview;
    String[] fitnesstype={
            "Walk More","Do Chores"," Split Up Your Exercises","Choose Efficient Exercises",
            "Consume Fats Properly","Get Plenty of Protein","Eat Properly Portioned and Balanced Meals",
            "Drink Enough Water"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        listview= findViewById(R.id.listview);
        ArrayAdapter adapter= new ArrayAdapter<String>(
                this,
                R.layout.activity_five,
                fitnesstype
        );
        listview.setAdapter(adapter);

//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(fiveActivity.this,
//                        "The good news is that you really don't have to do some complicated exercises in order to stay in shape. Walking doesn't require any special time to execute, which makes it easy to fit into your busy schedule.\n" +
//                                "\n" +
//                                "Pick a spot on the parking lot that is furthest away from where you are going, or park a couple of blocks away to walk more.\n" +
//                                "Replace taking the elevator/escalator with taking the stairs.\n" +
//                                "Take public transport instead of driving yourself. This way, you will have to walk to the station."+adapter.getItem(position),
//                        Toast.LENGTH_LONG).show();
//            }
//        });
    }
}