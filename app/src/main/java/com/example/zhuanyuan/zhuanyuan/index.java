package com.example.zhuanyuan.zhuanyuan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("今天天气真热，火辣辣的");
        tv_hello.setTextColor(Color.RED);
        tv_hello.setTextSize(30);
    }
}
