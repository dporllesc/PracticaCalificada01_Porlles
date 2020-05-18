package com.desarrollo.practicacalificada01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText campof1;
    EditText campof2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campof1 = (EditText) findViewById(R.id.txtFrase1);
        campof2 = (EditText) findViewById(R.id.txtFrase2);
    }

    public void accion(View view) {
        Intent miIntent = new Intent(MainActivity.this, FraseActivity.class);
        String frase1 = campof1.getText().toString();
        String frase2 = campof2.getText().toString();
        Bundle miBundle = new Bundle();
        miBundle.putString("frase1",campof1.getText().toString());
        miBundle.putString("frase2",campof2.getText().toString());
        miIntent.putExtras(miBundle);
        startActivity(miIntent);
    }
}
