package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);


        Button b = (Button)findViewById(R.id.button1);
        final TextView tv = (TextView)findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String result = "";
                if(cb1.isChecked() == true) result += " "+ cb1.getText().toString();
                if(cb2.isChecked() == true) result += " "+ cb2.getText().toString();
                if(cb3.isChecked() == true) result += " "+ cb3.getText().toString();
                if(cb4.isChecked() == true) result += " "+ cb4.getText().toString();
                tv.setText("복용 완료:" + result);

            }
        });

    }
}


