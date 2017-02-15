package com.zuluft.realmconvertersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zuluft.annotations.RealmTarget;
import com.zuluft.generated.GeneratedClass;

@RealmTarget
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
