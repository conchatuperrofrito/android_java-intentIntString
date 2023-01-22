package com.example.objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    int et22,et33;
    String eu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);

        et2=(EditText)findViewById(R.id.et2);


    }
    public void graficar(View v){
        et33=Integer.parseInt(et2.getText().toString());
        et22=100+et33;
        eu =""+et22;

        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("valor1",et1.getText().toString());
        i.putExtra("valor2",eu);
        startActivity(i);
    }
}