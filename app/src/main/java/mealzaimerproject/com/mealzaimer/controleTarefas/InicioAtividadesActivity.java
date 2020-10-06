package mealzaimerproject.com.mealzaimer.controleTarefas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.R;

public class InicioAtividadesActivity extends AppCompatActivity {
    protected ImageButton novatarefa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_atividades);
        Toast toast = Toast.makeText(getApplicationContext(), "A lista esta vazia.",Toast.LENGTH_SHORT);
        toast.show();
        novatarefa=(ImageButton)findViewById(R.id.btnNovaTarefa);
        novatarefa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),NovaTarefaActivity.class));
        }
    });
    }
}
