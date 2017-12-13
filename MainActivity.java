package com.example.ammarfalmban.radiobuttonusingonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.radio_button1:
                if(checked)
                    System.out.print(" you choose choice 1");
                Toast.makeText(MainActivity.this, " you choose choice 1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radio_button2:
                if(checked)
                    System.out.print(" you choose choice 2");
                Toast.makeText(MainActivity.this, " you choose choice 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_button3:
                if(checked)
                    System.out.print(" you choose choice 3");
                Toast.makeText(MainActivity.this, " you choose choice 3", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
