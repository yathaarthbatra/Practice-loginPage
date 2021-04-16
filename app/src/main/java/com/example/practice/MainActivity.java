package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){
        //Log.i("Info", "Button pressed");

        EditText editText1=findViewById(R.id.editText1);
        EditText editText2=findViewById(R.id.editText2);

        Log.i("Name:",editText1.getText().toString());
        Log.i("Password:",editText2.getText().toString());

        Toast.makeText(this, "Login as "+editText1.getText().toString(), Toast.LENGTH_SHORT).show();

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
