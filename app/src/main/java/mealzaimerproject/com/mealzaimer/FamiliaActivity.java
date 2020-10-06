package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class FamiliaActivity extends AppCompatActivity {
    protected ImageView imagemum;
    protected ImageView imgdois;
    protected ImageView imgtres;
    protected ImageButton imgquatro;
    protected ImageButton imgcinco;
    protected ImageButton imgseis;
    protected ImageButton imgsete;
    protected ImageButton imgoito;
    protected ImageButton imgnove;
    protected ImageButton imgdez;
    protected  ImageButton cadastrarPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);
        imagemum=(ImageView) findViewById(R.id.irmaoId);
        imagemum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"JOSÉ ABREU DOS SANTOS\n66 Anos", Toast.LENGTH_SHORT).show();

            }
        });
        imgdois=(ImageView) findViewById(R.id.imgDois);
        imgdois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"CARLOS DOS SANTOS\n70 Anos", Toast.LENGTH_SHORT).show();

            }
        });
        imgtres=(ImageView) findViewById(R.id.imgTres);
        imgtres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"MARIA DOS SANTOS", Toast.LENGTH_SHORT).show();

            }
        });
        imgquatro=(ImageButton)findViewById(R.id.imgQuatro);
        imgquatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),"ROMULO DOS SANTOS\n39 anos", Toast.LENGTH_SHORT).show();

            }
        });
        imgcinco=(ImageButton)findViewById(R.id.imgCinco);
        imgcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"KARINA DOS SANTOS", Toast.LENGTH_SHORT).show();

            }
        });
        imgseis=(ImageButton)findViewById(R.id.imgSeis);
        imgseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"MAYCON DOS SANTOS", Toast.LENGTH_SHORT).show();

            }
        });
        imgsete=(ImageButton)findViewById(R.id.imgSete);
        imgsete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"AMORA DOS SANTOS", Toast.LENGTH_SHORT).show();

            }
        });
        imgoito=(ImageButton)findViewById(R.id.imgOito);
        imgoito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"VALERIA DE CAMPOS ALMEIDA", Toast.LENGTH_SHORT).show();

            }
        });
        imgnove=(ImageButton)findViewById(R.id.imgNove);
        imgnove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"CRISTHIANE MENDES", Toast.LENGTH_SHORT).show();

            }
        });
        imgdez=(ImageButton)findViewById(R.id.imgDez);
        imgdez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"ADALBERTO SILVA MARTINS", Toast.LENGTH_SHORT).show();

            }
        });
        cadastrarPessoa=(ImageButton)findViewById(R.id.btnAdicionarPessoa);
        cadastrarPessoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CadastroPessoasActivity.class));
            }
        });






    }
}
