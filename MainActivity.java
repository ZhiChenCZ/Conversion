package com.example.android.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private double retrieveInput(View view){
        try{
            EditText input = (EditText) findViewById(R.id.user_input);
            String readStringValue = input.getText().toString();
            int readValue = Integer.parseInt(readStringValue);
            return readValue;
        } catch (NumberFormatException e){
            return 0;
        }
    }

    private String meterToFeet() {
        double reading = retrieveInput(findViewById(R.id.user_input));
        double result = reading * 3.28084;
        String insert = String.valueOf(result);
        return insert;
    }

    public void showResult(View view){
        String resultString = meterToFeet();
        Toast toast = Toast.makeText(this, resultString, Toast.LENGTH_SHORT);
        toast.show();
    }
}
