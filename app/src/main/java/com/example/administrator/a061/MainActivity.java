package com.example.administrator.a061;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.QuickContactBadge;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    ToggleButton        tb;
    QuickContactBadge   qcbEmail, qcbPhone;

    Context             context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        context=this;

        tb=(ToggleButton) findViewById(R.id.toggleButton);

        qcbEmail=(QuickContactBadge) findViewById(R.id.quickContactBadge);
        qcbPhone=(QuickContactBadge) findViewById(R.id.quickContactBadge2);

        //toggleButton listener
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(context, "State: " + isChecked, Toast.LENGTH_LONG).show();
            }
        });

        //
        qcbEmail.assignContactFromEmail("loinfonew@gmail.com", true);

        qcbPhone.assignContactFromPhone("0963657662", true);
    }
}
