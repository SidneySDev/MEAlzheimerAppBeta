package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.controleRemedios.ListaAlergicosActivity;
import mealzaimerproject.com.mealzaimer.controleRemedios.MenuInicioRemediosTwoActivity;

public class CadastroRemedioAlergicoActivity extends AppCompatActivity {
  protected ImageButton novoAlergico;
  protected ImageButton cancelar;
  protected EditText nomeRemedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_remedio_alergico);
        novoAlergico=(ImageButton)findViewById(R.id.btnSalvarAlergico);
        novoAlergico.setVisibility(View.INVISIBLE);
        novoAlergico.setEnabled(false);
        cancelar=(ImageButton)findViewById(R.id.btnCancelarAlergico);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicioRemediosTwoActivity.class));
            }
        });
        novoAlergico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ListaAlergicosActivity.class));
            }
        });
        nomeRemedio=findViewById(R.id.nomeRemedioAlergico);
        nomeRemedio.addTextChangedListener(controleRemedio);
    }
    private TextWatcher controleRemedio=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String nome = nomeRemedio.getText().toString().trim();
            novoAlergico.setEnabled(!nome.isEmpty());
            novoAlergico.setVisibility(View.VISIBLE);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
