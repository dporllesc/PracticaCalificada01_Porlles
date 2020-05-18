package com.desarrollo.practicacalificada01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FraseActivity extends AppCompatActivity {

    TextView cantidad1, cantidad2, resultado1, resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase);

        cantidad1 = (TextView) findViewById(R.id.txtCantidad1);
        cantidad2 = (TextView) findViewById(R.id.txtCantidad2);
        resultado1 = (TextView) findViewById(R.id.txtResultado1);
        resultado2 = (TextView) findViewById(R.id.txtResultado2);

        Bundle miBundle = this.getIntent().getExtras();
        if (miBundle !=null){
            resultado1.setVisibility(View.INVISIBLE);
            resultado2.setVisibility(View.INVISIBLE);
            String frase1 = miBundle.getString("frase1");
            String frase2 = miBundle.getString("frase2");
            int contador1 = 0;
            int contador2 = 0;

            for (int i=0; i<frase1.length(); i++){
                if((frase1.charAt(i)=='i') || (frase1.charAt(i)=='u')){
                    contador1++;
                }
            }
            for (int i=0; i<frase2.length(); i++){
                if((frase2.charAt(i)=='i') || (frase2.charAt(i)=='u')){
                    contador2++;
                }
            }

            if(frase1.equals(frase2)){
                cantidad1.setText(""+contador1);
                cantidad2.setText(""+contador2);
                resultado1.setVisibility(View.VISIBLE);
            }
            else {
                cantidad1.setText(""+contador1);
                cantidad2.setText(""+contador2);
                resultado2.setVisibility(View.VISIBLE);

            }

        }


    }
}
