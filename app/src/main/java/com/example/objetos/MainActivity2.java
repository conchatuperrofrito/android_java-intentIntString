package com.example.objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int valor1;
    String string1;

    TextView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        v1=(TextView) findViewById(R.id.text1);

        Bundle bundle =getIntent().getExtras();
        string1=bundle.getString("valor1");
        valor1=Integer.parseInt(bundle.getString("valor2"));

        v1.setText(""+string1+"-----"+valor1);
    }
}