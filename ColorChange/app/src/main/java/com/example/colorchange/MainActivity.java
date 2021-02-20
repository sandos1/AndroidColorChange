package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ConstraintLayout constraint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button)findViewById(R.id.button);
        constraint =(ConstraintLayout)findViewById(R.id.root);
        int[] color = {getResources().getColor(R.color.purple_200),getResources().getColor(R.color.purple_500)
                        ,getResources().getColor(R.color.teal_200),getResources().getColor(R.color.teal_700)};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tempInt = new Random().nextInt(color.length);
                //Log.d("TAG",  String.valueOf(random));
                //int tempInt = random.nextInt(color.length);
                int constant = color[tempInt];

                constraint.setBackgroundColor(constant);
                button.setBackgroundColor(constant);

                //getWindow().getDecorView().setBackgroundColor(getResources().getColor(color[));



            }
        });

    }
}