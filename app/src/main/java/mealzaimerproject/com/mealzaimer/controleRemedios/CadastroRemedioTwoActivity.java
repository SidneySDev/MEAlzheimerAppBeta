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

public class CadastroRemedioTwoActivity extends AppCompatActivity {
    protected EditText remedio;
    protected ImageButton salvar;
    protected  ImageButton cancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_remedio_two);
        remedio=findViewById(R.id.nomeRemedioAlergico);
        salvar=(ImageButton)findViewById(R.id.btnSalvarTwo);
        salvar.setEnabled(false);
        salvar.setVisibility(View.INVISIBLE);
        cancelar=(ImageButton)findViewById(R.id.btnCancelarTwo);
        //function button cancelar
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicioRemedioOneActivity.class));
            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicioRemediosTwoActivity.class));
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
            String nomeRemedio = remedio.getText().toString().trim();
            salvar.setEnabled(!nomeRemedio.isEmpty());
            salvar.setVisibility(View.VISIBLE);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
