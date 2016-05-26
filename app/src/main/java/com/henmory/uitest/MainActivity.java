package com.henmory.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    Button btn_comit;
    Button btn_comit1;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int flag = 5;
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
                break;
            case 4:
                setContentView(R.layout.radio_button_and_check_box);
                break;
            case 5:
                setContentView(R.layout.uui_progress);
            default:
                break;
        }
//        rg = (RadioGroup) findViewById(R.id.radio_group);
//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                rb = (RadioButton) findViewById(checkedId);
//                System.out.println(rb.getText());
//            }
//        });
//        btn_comit = (Button) findViewById(R.id.btn_commit);
//        btn_comit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for (int i = 0; i < rg.getChildCount(); i++){
//                    rb = (RadioButton) rg.getChildAt(i);
//                    if (rb.isChecked()){
//                        System.out.println(rb.getText());
//                    }
//                }
//            }
//        });
//
//        cb1 = (CheckBox) findViewById(R.id.cb1);
//        cb2 = (CheckBox) findViewById(R.id.cb2);
//        cb3 = (CheckBox) findViewById(R.id.cb3);
//        btn_comit1 = (Button) findViewById(R.id.btn_commit1);
//        btn_comit1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (cb1.isChecked()){
//                    System.out.println(cb1.getText());
//                }if (cb2.isChecked()){
//                    System.out.println(cb2.getText());
//                }if (cb3.isChecked()){
//                    System.out.println(cb3.getText());
//                }
//            }
//        });
    }
}
