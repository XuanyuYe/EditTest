package com.example.unittest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button btn;
    public EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btn = findViewById(R.id.btn);
        edit= findViewById(R.id.editText);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnGoto(View v){
        Toast toastCenter = Toast.makeText(getApplicationContext(),edit.getText().toString(),Toast.LENGTH_LONG);
        //setGravity决定Toast显示位置
        toastCenter.setGravity(Gravity.CENTER,0,0);
        //调用show使得toast得以显示
        toastCenter.show();
    }

}

