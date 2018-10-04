package com.example.evan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class HelloWorld extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
}

public void openActivity2() {


    Intent intent = new Intent(packageContext this,Activity2.class);
    startActivity(intent);
}
