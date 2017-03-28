package com.mobileappscompany.training.fragmentcom;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements F1.F1Interface, F2.F2Interface {
    F1 f1;
    F2 f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //f1 = new F1();
        f2 = new F2();

        FragmentManager fm = getSupportFragmentManager();

        f1 = (F1) fm.findFragmentById(R.id.forF1);
        if(f1 == null || !f1.isInLayout()){
            f1 = new F1();
        }


        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.forF1, f1);
        ft.add(R.id.forF2, f2);

        ft.commit();

    }


    public void send22(String s){
        f2.setMyEt(s);
    }

    public void send21(String s){
        f1.setMyEt(s);
    }


    @Override
    public void iSend22(String s) {
        f2.setMyEt(s);
    }
}
