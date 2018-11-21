package com.example.pacy.cse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String sub[] = {"MAA301", "CSB301", "CSB302", "CSB304", "IBC501", "IBC502", "IBC503", "ITD355", "IBC531", "CSB332", "CSB333", "CSB334", "ELA331"};
    private int points[] = {10, 9, 8, 7, 6, 5, 0, 0};
    private String creidts[] = {"s", "a", "b", "c", "d", "e", "u", "r"};
    private String name[] = {"sumith"};
    int count = 0;
    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, editText12, editText13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.ed1);
        editText2 = findViewById(R.id.ed2);
        editText3 = findViewById(R.id.ed3);
        editText4 = findViewById(R.id.ed4);
        editText5 = findViewById(R.id.ed5);
        editText6 = findViewById(R.id.ed6);
        editText7 = findViewById(R.id.ed7);
        editText8 = findViewById(R.id.ed8);
        editText9 = findViewById(R.id.ed9);
        editText10 = findViewById(R.id.ed10);
        editText11 = findViewById(R.id.ed11);
        editText12 = findViewById(R.id.ed12);
        editText13 = findViewById(R.id.ed13);
        Button btn_submit = findViewById(R.id.button);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing();
            }
        });
    }

    public void processing() {
        String st1 = editText1.getText().toString();
        String st2 = editText2.getText().toString();
        String st3 = editText3.getText().toString();
        String st4 = editText4.getText().toString();
        String st5 = editText5.getText().toString();
        String st6 = editText6.getText().toString();
        String st7 = editText7.getText().toString();
        String st8 = editText8.getText().toString();
        String st9 = editText9.getText().toString();
        String st10 = editText10.getText().toString();
        String st11 = editText11.getText().toString();
        String st12 = editText12.getText().toString();
        String st13 = editText13.getText().toString();
        for (int i = 0; i < 8; i++) {
            if (st1.equals(creidts[i])) {
                count = count + points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st2.equals(creidts[i])) {
                count = count + points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st3.equals(creidts[i])) {
                count = count + points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st4.equals(creidts[i])) {
                count = count + points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st5.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st6.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st7.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st8.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st9.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st10.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st11.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st12.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }
            if (st13.equals(creidts[i])){
                count=count+points[i];
                // the credits can be added at the end of previous line as per the subjects
            }


        }
    }
}
