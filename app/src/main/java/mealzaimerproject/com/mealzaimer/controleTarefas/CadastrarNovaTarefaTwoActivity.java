package mealzaimerproject.com.mealzaimer.controleTarefas;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;
import mealzaimerproject.com.mealzaimer.controleTarefas.NovaTarefaTwoActivity;

public class CadastrarNovaTarefaTwoActivity extends AppCompatActivity {
    protected ImageButton btnSalvarTarefaTwo;
    protected ImageButton btnCancelarTwo;
    protected EditText novatarefa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cadastrar_nova_tarefa_two);
        btnSalvarTarefaTwo = (ImageButton) findViewById(R.id.btnSalvarTwo);
        btnSalvarTarefaTwo.setVisibility(View.INVISIBLE);
        btnSalvarTarefaTwo.setEnabled(false);
        btnCancelarTwo = (ImageButton) findViewById(R.id.btnCancelarTwo);
        btnSalvarTarefaTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NovaTarefaTwoActivity.class));
            }
        });
        novatarefa=findViewById(R.id.nomeTarefaTwo);
        novatarefa.addTextChangedListener(nomeTarefa);

    }
    private TextWatcher nomeTarefa=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String TarefaName = novatarefa.getText().toString().trim();
            btnSalvarTarefaTwo.setEnabled(!TarefaName.isEmpty());
            btnSalvarTarefaTwo.setVisibility(View.VISIBLE);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
