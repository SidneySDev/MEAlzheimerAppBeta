package mealzaimerproject.com.mealzaimer.controleTarefas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class NovaTarefaActivity extends AppCompatActivity {
    protected ImageButton salvar;
    protected ImageButton cancelar;
    protected EditText tarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tarefa);
        salvar=(ImageButton)findViewById(R.id.ed);
        cancelar=(ImageButton)findViewById(R.id.btnCancelar);
        salvar.setEnabled(false);
        salvar.setVisibility(View.GONE);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NovaTarefaOneActivity.class));
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),InicioAtividadesActivity.class));
            }
        });
        tarefa=findViewById(R.id.nomeTarefaTwo);
        tarefa.addTextChangedListener(nomeTarefa);

    }
    private TextWatcher nomeTarefa=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String TarefaName = tarefa.getText().toString().trim();
            salvar.setEnabled(!TarefaName.isEmpty());
            salvar.setVisibility(View.VISIBLE);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
