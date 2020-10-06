package mealzaimerproject.com.mealzaimer.controleTarefas;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.MenuInicialActivity;
import mealzaimerproject.com.mealzaimer.R;

public class NovaTarefaTwoActivity extends AppCompatActivity {
    protected ConstraintLayout LayoutUm;
    protected ConstraintLayout LayoutDois;
    protected ImageButton botaoUm;
    protected ImageButton botaodois;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),MenuInicialActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tarefa_two);
        Toast toast = Toast.makeText(getApplicationContext(), "Lista Atualizada.",Toast.LENGTH_SHORT);
        toast.show();
        LayoutUm=(ConstraintLayout) findViewById(R.id.Lum);
        LayoutUm.setVisibility(View.VISIBLE);
        LayoutDois=(ConstraintLayout) findViewById(R.id.Ldois);
        LayoutDois.setVisibility(View.VISIBLE);
        botaoUm=(ImageButton)findViewById(R.id.btnExcluirUm);
        botaodois=(ImageButton)findViewById(R.id.btnExcluirDois);
        botaoUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutUm.setVisibility(View.INVISIBLE);
                Toast toast = Toast.makeText(getApplicationContext(), "Tarefa Excluida\n   Lista vazia",Toast.LENGTH_SHORT);
                toast.show();
            }

        });
        botaodois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutDois.setVisibility(View.INVISIBLE);
                Toast toast = Toast.makeText(getApplicationContext(), "Tarefa Excluida.",Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}
