package com.example.javademo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.javademo1.model.User;

public class activity2 extends AppCompatActivity {
    static final String TAG=activity2.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        initViews();
    }

    void initViews(){
        TextView text_id=findViewById(R.id.text_id);

        User user=getIntent().getParcelableExtra("user");

        Log.d(TAG,user.toString());
        text_id.setText(user.toString());


    }

}