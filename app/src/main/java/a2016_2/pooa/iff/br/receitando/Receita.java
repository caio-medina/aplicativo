package a2016_2.pooa.iff.br.receitando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Receita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);

        Button button_cadastrar = (Button) findViewById(R.id.button_cadastrar);

        button_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.activity_cadastrar__receita);
            }
        });

        Button button_buscar = (Button) findViewById(R.id.button_buscar);

        button_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.activity_buscar);
            }
        });


    }
}
