package mealzaimerproject.com.mealzaimer.controleTarefas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.R;

public class NovaTarefaOneActivity extends AppCompatActivity {
    protected ImageButton novatarefaone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tarefa_one);
        Toast toast = Toast.makeText(getApplicationContext(), "Lista Atualizada.",Toast.LENGTH_SHORT);
        toast.show();
        novatarefaone=(ImageButton) findViewById(R.id.btnCadastrarNovaTarefaTwo);
        novatarefaone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CadastrarNovaTarefaTwoActivity.class));
            }
        });
    }
}
