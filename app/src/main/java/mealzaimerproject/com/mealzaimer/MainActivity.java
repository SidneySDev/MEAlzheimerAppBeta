package mealzaimerproject.com.mealzaimer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    protected ImageButton botaoContinuar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoContinuar=(ImageButton) findViewById(R.id.btnContinuar);
        //metodo de chamada do Menu Incical
        botaoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MenuInicialActivity.class));
                finish();

            }
        });



    }
}
