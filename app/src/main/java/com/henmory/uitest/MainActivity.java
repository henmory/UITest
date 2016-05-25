package com.henmory.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int flag = 3;
        switch (flag) {
            case 0:
                setContentView(R.layout.activity_main);
                break;
            case 1:
                setContentView(R.layout.ui_editview);
                break;
            case 2:
                setContentView(R.layout.ui_btn);
                break;
            case 3:
                setContentView(R.layout.login);

        }
    }
}
