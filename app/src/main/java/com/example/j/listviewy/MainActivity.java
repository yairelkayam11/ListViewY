package com.example.j.listviewy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioButton rb1;
    RadioButton rb2;
    EditText et1;
    EditText et2;
    String st1;
    String st2;
    TextView tv;
    boolean bo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv = (TextView) findViewById(R.id.tv);


        if (rb1.isChecked()) {


            tv.setText("סדרה חשבונית");
            et1.setHint("איבר ראשון :");
            et2.setHint("הפרש :");

            bo = true;

            st1 = et1.getText().toString();
            st2 = et2.getText().toString();

            Intent t = new Intent(this, Main2Activity.class);

            t.putExtra("key1", st1);
            t.putExtra("key2", st2);
            t.putExtra("key3",bo);

            startActivity(t);
        }

        else if (rb2.isChecked()) {

            tv.setText("סדרה הנדסית");
            et1.setHint("איבר ראשון :");
            et2.setHint("מכפיל :");

            bo = false;

            st1 = et1.getText().toString();
            st2 = et2.getText().toString();

            Intent t = new Intent(this, Main2Activity.class);

            t.putExtra("key1", st1);
            t.putExtra("key2", st2);
            t.putExtra("key",bo);

            startActivity(t);
        }

    }

    public void yair1(View view) {

        Intent t = new Intent(this, Main2Activity.class);

        startActivity(t);
    }
}
