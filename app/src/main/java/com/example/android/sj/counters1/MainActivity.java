package com.example.android.sj.counters1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numA=0;
    int numB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void printForA(int num){
        TextView score = (TextView) findViewById(R.id.team_a_score);
        score.setText(""+num);
    }

    public void buttonPlus3A(View view){
        numA=numA+3;
        printForA(numA);
    }

    public void buttonPlus2A(View view){
        numA=numA+2;
        printForA(numA);

    }

    public void buttonFreeThrowA(View view){
        numA=numA+1;
        printForA(numA);
    }


    public void printForB(int num){
        TextView score = (TextView) findViewById(R.id.team_b_score);
        score.setText("" + num);
    }

    public void buttonPlus3B(View view){
        numB=numB+3;
        printForB(numB);
    }

    public void buttonPlus2B(View view){
        numB=numB+2;
        printForB(numB);
    }

    public void buttonFreeThrowB(View view){
        numB=numB+1;
        printForB(numB);
    }

    public void reset(View v){
        numA=0;
        numB=0;
        printForA(numA);
        printForB(numB);
    }
}
