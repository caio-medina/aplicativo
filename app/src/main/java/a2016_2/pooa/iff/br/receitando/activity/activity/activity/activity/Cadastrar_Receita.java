package a2016_2.pooa.iff.br.receitando.activity.activity.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import a2016_2.pooa.iff.br.receitando.R;

public class Cadastrar_Receita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__receita);



        Button button_voltar = (Button) findViewById(R.id.bt_voltar);

        button_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.activity_receita);
            }

    });
}}
