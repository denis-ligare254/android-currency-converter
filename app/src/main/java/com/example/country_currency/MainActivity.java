package com.example.country_currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mainbtn(View view){
//        first initialization<declaring views>
        EditText first = findViewById(R.id.country);
        EditText second =findViewById(R.id.currency);
        TextView third = findViewById(R.id.view);

//        getting the values from the views
        String one = first.getText().toString();
        int two= Integer.parseInt(second.getText().toString());


//        the logic
        String ke_country = "kenya";
        String ug_country = "uganda";
        String tz_country ="tanzania";
        int ug1 =300;
        int tz =200;
        int ksh =100;

// kenyan shillings

        if(one.equals(ke_country)){

           int answer1 = 100 * two ;
            third.setText(String.valueOf(answer1));

        }
        
//              uganda shillings
        else if(one.equals(ug_country)){

            int answer2 = 300 * two;
            third.setText(String.valueOf(answer2));
        }
//                tanzania shillings
        else if(one.equals(tz_country)){
            int answer3 = 200 * two;

            third.setText(String.valueOf(answer3));
        }else {
            third.setText("invalid country");

        }



    }

}