package com.example.j.listviewy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Button btn1;
    ListView lv;
    TextView tv2;
    TextView tv4;
    TextView tv6;
    TextView tv8;
    String st1;
    String st2;
    int x,y,t;
    int i,j;
    String sum,sum1;
    boolean bo;
    String arr1[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv = (ListView) findViewById(R.id.lv);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv8 = (TextView) findViewById(R.id.tv8);


        Intent g = getIntent();

        st1 = g.getStringExtra("key1");
        st2 = g.getStringExtra("key2");
        bo = g.getBooleanExtra("key3", bo);

        finish();


        x = Integer.parseInt(st1);
        y = Integer.parseInt(st2);


        if (bo == true) {
            for (i = 0; i < 20; i++) {

                x = x + y;

                sum = Integer.toString(x);

                arr1[i] = sum;

            }
            lv.setOnItemClickListener((AdapterView.OnItemClickListener) this);
            lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr1);

            lv.setAdapter(adp);
        }
        else if (bo==false) {
            for (i = 0; i < 20; i++) {

                x = x * y;

                sum = Integer.toString(x);

                arr1[i] = sum;

            }
            lv.setOnItemClickListener((AdapterView.OnItemClickListener) this);
            lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr1);

            lv.setAdapter(adp);

        }

    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        tv2.setText(x);

        tv4.setText(y);

        tv6.setText(i+1);

        for (j=0;j<1;j++) {

            sum1=sum1+x;

        }

        tv8.setText(sum1);
    }
    public void yair1(View view) {


        Intent t = new Intent(this, MainActivity.class);

        startActivity(t);

    }
}
