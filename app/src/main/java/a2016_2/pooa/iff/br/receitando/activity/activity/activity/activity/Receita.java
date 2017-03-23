package a2016_2.pooa.iff.br.receitando.activity.activity.activity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import a2016_2.pooa.iff.br.receitando.R;

public class Receita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);
    }

    public void chamaTelaCadastrar_Receita(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(Receita.this, Cadastrar_Receita.class);
        startActivity(intent);
    }

    public void chamaTelaBusca(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(Receita.this, Buscar.class);
        startActivity(intent);
    }







}
