package com.example.hl.android_practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bt2 = (Button)findViewById(R.id.button2) ;
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String user= intent.getStringExtra("登录名");
                String password = intent.getStringExtra("密码");

                if (user.toString().equals("abc")&&password.toString().equals("123")){
                    intent.putExtra("result","登录成功");
                }
                else{
                    intent.putExtra("result","用户名或密码错误");
                }
                setResult(0,intent);
                finish();
            }
        });
    }
}
