package mealzaimerproject.com.mealzaimer.controleRemedios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class CadastroRemediosActivity extends AppCompatActivity {
    protected EditText remedio;
    protected ImageButton salvarOne;
    protected  ImageButton cancelarOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_remedios);
        remedio=findViewById(R.id.nomeRemedioAlergico);
        salvarOne=(ImageButton)findViewById(R.id.btnSalvarOne);
        salvarOne.setEnabled(false);
        salvarOne.setVisibility(View.INVISIBLE);
        cancelarOne=(ImageButton)findViewById(R.id.btnCancelarOne);
        //funcão btn cancelar
        cancelarOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicioRemedios.class));
            }
        });
        //btn salvar function
        salvarOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicioRemedioOneActivity.class));
            }
        });

        remedio.addTextChangedListener(nomeRemedio);
    }
    private TextWatcher nomeRemedio=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String remedioName = remedio.getText().toString().trim();
            salvarOne.setEnabled(!remedioName.isEmpty());
            salvarOne.setVisibility(View.VISIBLE);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
