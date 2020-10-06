package mealzaimerproject.com.mealzaimer.controleRemedios;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.R;

public class MenuInicioRemedioOneActivity extends AppCompatActivity {
    protected ImageButton novoRemedioTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio_remedio_one);
        Toast toast = Toast.makeText(getApplicationContext(), "Lista de Remédios Atualizada..",Toast.LENGTH_SHORT);
        toast.show();
        novoRemedioTwo=(ImageButton)findViewById(R.id.btnAddRemedioTwo);
        novoRemedioTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CadastroRemedioTwoActivity.class));
            }
        });
    }
}
