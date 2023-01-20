package com.example.listenershomework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    Button BTN_Red;
    Button BTN_Blue;
    EditText ET_Input;
    TextView TV_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTN_Red = findViewById(R.id.BTN_Red);
        BTN_Blue = findViewById(R.id.BTN_Blue);
        ET_Input = findViewById(R.id.ET_Input);
        TV_Result = findViewById(R.id.TV_Result);


        View.OnClickListener lis = new View.OnClickListener() {
            public void onClick(View v){
                TV_Result.setTextColor(Color.BLUE);
            }
        };
    }

    //class OnClickListener{ }

    void changeText(TextView TV, String text){
        TV.setText(text);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if(editable.toString() == "null") return;

    }
}