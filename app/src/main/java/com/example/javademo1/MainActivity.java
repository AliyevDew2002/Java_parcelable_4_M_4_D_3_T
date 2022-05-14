package com.example.javademo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javademo1.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            User user=new User("Shaxzod",20);
            @Override
            public void onClick(View v) {
             intent1(user);
            }
        });
    }

    void intent1(User user){
        Intent intent=new Intent(this,activity2.class);

        intent.putExtra("user",user);

        startActivity(intent);
    }


}