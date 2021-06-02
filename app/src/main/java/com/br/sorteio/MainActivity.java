package com.br.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNum(View view){
        TextView texto = findViewById(R.id.txtResultado);

        int num = new Random().nextInt(11);

        texto.setText("O número sorteado foi: " + num);
    }

    public void sortearCem(View view){
        TextView texto = findViewById(R.id.txtResultado);

        int num = new Random().nextInt(101);

        texto.setText("O número sorteado foi: " + num);
    }

    public void sortearMil(View view){
        TextView texto = findViewById(R.id.txtResultado);

        int num = new Random().nextInt(1001);

        texto.setText("O número sorteado foi: " + num);
    }

    public void sortearDezMil(View view){
        TextView texto = findViewById(R.id.txtResultado);

        int num = new Random().nextInt(10001);

        texto.setText("O número sorteado foi: " + num);
    }
}

