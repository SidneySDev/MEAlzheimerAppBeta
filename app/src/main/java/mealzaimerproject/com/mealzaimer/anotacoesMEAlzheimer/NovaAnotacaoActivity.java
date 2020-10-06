package mealzaimerproject.com.mealzaimer.anotacoesMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class NovaAnotacaoActivity extends AppCompatActivity {
    protected ImageButton salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_anotacao);
    salvar=(ImageButton)findViewById(R.id.btnNovaAnotacao);
    salvar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),AnotacaoUmActivity.class));
        }
    });
    }
}
