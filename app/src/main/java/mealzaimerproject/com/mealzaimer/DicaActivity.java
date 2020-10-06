package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DicaActivity extends AppCompatActivity {
    protected Button proximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica);
        proximo=(Button)findViewById(R.id.proximaDica);
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaDoisActivity.class));
            }
        });
    }
}
