package com.ankit.sugarormdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ankit.sugarormdemo.DB.request;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        request.findById(request.class,1);
//        request.save(new request("testRequest"));
        Log.d("requestSize",request.listAll(request.class).size()+"");
        Log.d("requestData",((request)request.listAll(request.class).toArray()[0]).getTestString());
    }
}
