package com.example.calificacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.calificacion.R;




public class MainActivity extends AppCompatActivity {

    private TextView txtNombre,txtMatricula,txtMensaje;
    private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre= (TextView)findViewById(R.id.txtNombre);
        txtMatricula= (TextView)findViewById(R.id.txtMatricula);
        txtMensaje= (TextView)findViewById(R.id.txtMensaje);

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
             txtMensaje.setText("La matricula de "+ txtNombre.getText().toString()+ " "+ "con el numero "+ txtMatricula.getText().toString()+
                     " a sido enviada");
            }
        });
    }
}

