package com.ap.taskmanager;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNumero1, etNumero2;
    Button btnSomar, btnLimpar;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        btnSomar = findViewById(R.id.btnSomar);
        btnLimpar = findViewById(R.id.btnLimpar);
        tvResultado = findViewById(R.id.tvResultado);

        // Função SOMAR
        btnSomar.setOnClickListener(v -> somar());

        // Função LIMPAR
        btnLimpar.setOnClickListener(v -> limpar());
    }

    private void somar() {
        String n1 = etNumero1.getText().toString();
        String n2 = etNumero2.getText().toString();

        if (n1.isEmpty() || n2.isEmpty()) {
            Toast.makeText(this, "Preencha os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);

        double resultado = num1 + num2;

        tvResultado.setText("Resultado: " + resultado);
    }

    private void limpar() {
        etNumero1.setText("");
        etNumero2.setText("");
        tvResultado.setText("Resultado: ");
    }
}