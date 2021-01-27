package com.matheusgoes23.appsorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText numero;
    private TextView textoNumero;
    private TextView textoResultado;
    private int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.numero);

        textoNumero = findViewById(R.id.textoNumero);    //Guardando o texto que diz a quantidade de possibilidades
    }

    public void selecionarBotao(View v) {
        try {
            x = Integer.parseInt(numero.getText().toString());    //Guardando a quantidade de possibilidades
            textoNumero.setText("Clique Em Jogar Para Gerar Um Número de 0 à " + x);    //Mostrando na tela a quantidade de possibilidades
            int y = new Random().nextInt(x + 1); //Gerando número aleatório de 0 à x digitado pelo usuario
            textoResultado = findViewById(R.id.textoResultado);
            textoResultado.setText("O Número Sorteado foi: " + y);
            textoResultado.setTextColor(Color.parseColor("#5A5858"));
        } catch (Exception e) {
            textoResultado = findViewById(R.id.textoResultado);
            textoResultado.setText("Erro!");
            textoResultado.setTextColor(Color.RED);
        }
    }
}