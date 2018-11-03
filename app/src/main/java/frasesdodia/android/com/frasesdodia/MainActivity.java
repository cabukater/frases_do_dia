package frasesdodia.android.com.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases =  {
            "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
            "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
            "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação",
            "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);

        textoNovaFrase.setText( frases[1] );

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();

                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText( frases[numeroAleatorio] );

            }
        });



    }
}
