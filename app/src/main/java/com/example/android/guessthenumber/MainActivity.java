package com.example.android.guessthenumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void CreateRand(View view)
    {
        Random r= new Random();
        randomNumber=r.nextInt(20-1)+1;
        //Toast.makeText(this,""+randomNumber,Toast.LENGTH_LONG).show();
    }

    public void Check(View view)
    {
//        Toast.makeText(this,""+randomNumber,Toast.LENGTH_LONG).show();
        int curNum;
        EditText Number= (EditText)findViewById(R.id.Number);
        curNum = Integer.parseInt(Number.getText().toString());
        //Toast.makeText(this,""+curNum,Toast.LENGTH_LONG).show();
        if(curNum<randomNumber)
            Toast.makeText(this,"Increase the Number",Toast.LENGTH_LONG).show();
        else if(curNum>randomNumber)
            Toast.makeText(this,"Decrease the Numeber",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Bullzai!!! You did it",Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
