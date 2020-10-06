package mealzaimerproject.com.mealzaimer.sobreMimMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.security.ProtectionDomain;

import mealzaimerproject.com.mealzaimer.R;

public class EuActivity extends AppCompatActivity {
    protected ImageButton cadastroInformacoes;
    protected ImageButton editInformacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eu);
        Toast toast = Toast.makeText(getApplicationContext(), "Adicione Novas Informações.",Toast.LENGTH_SHORT);
        toast.show();

        editInformacoes=(ImageButton)findViewById(R.id.btnEdit);
        editInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EditSobreMimActivity.class));
            }
        });
    }
}
