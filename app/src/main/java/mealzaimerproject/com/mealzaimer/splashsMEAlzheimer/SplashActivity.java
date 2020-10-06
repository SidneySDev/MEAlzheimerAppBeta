package mealzaimerproject.com.mealzaimer.splashsMEAlzheimer;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import mealzaimerproject.com.mealzaimer.MainActivity;
import mealzaimerproject.com.mealzaimer.MenuInicialActivity;
import mealzaimerproject.com.mealzaimer.R;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //colocando pra abrir em full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //metodo que define o tempo da slapsh
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            //abrir a mmain activyty
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },2000);
    }
}
