package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

public class CALC extends AppCompatActivity {

     Button boton;
     Button suma;
     EditText textedit;
     EditText textedit2;
     TextView textenseñar;





     //para el boton 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        textedit =findViewById(R.id.textedit);
        textedit2 =findViewById(R.id.textedit2);
        boton = findViewById(R.id.boton);
        suma = findViewById(R.id.suma);
        textenseñar = findViewById(R.id.textenseñar);


        boton.setOnClickListener(new View.OnClickListener() {
        @Override

        public void onClick(View v) {


            //aqui poner lo que queremos que haga//
            Toast.makeText(getApplicationContext(), "Hola buenos diad" , Toast.LENGTH_LONG).show();


        }



    });

        suma.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                String Numero1 = textedit.getText().toString();
                String Numero2 = textedit2.getText().toString();
                int numeroa = Integer.parseInt(Numero1);
                int numerob = Integer.parseInt(Numero2);

                int res = numeroa+numerob;
                textenseñar.setText(res);

                Toast.makeText(getApplicationContext(), res , Toast.LENGTH_LONG).show();
//



            }
        });
}
}
