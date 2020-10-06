package mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze.ordemDoze;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mealzaimerproject.com.mealzaimer.R;

public class GameOrdemStartActivity extends AppCompatActivity {
    String texto;
    TextView selecionarImagem;
    ImageButton b_new;
    ImageButton btnBola,btnCoracao,btnTrofeu;
    Button button1,button2,button3,
            button4,button5,button6,
            button7,button8,button9,
            button10,button11,button12;
    List<Integer> buttons;
    int curLevel,curGuess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_ordem_start);
        //set text default
        texto=("❤");

        b_new=(ImageButton)findViewById(R.id.b_new);
        btnBola=(ImageButton)findViewById(R.id.btnBola);
        btnCoracao=(ImageButton)findViewById(R.id.btnCoracao);
        btnTrofeu=(ImageButton)findViewById(R.id.btnTrofeu);
            button1=findViewById(R.id.button1);
            button2=findViewById(R.id.button2);
            button3=findViewById(R.id.button3);
            button4=findViewById(R.id.button4);
            button5=findViewById(R.id.button5);
            button6=findViewById(R.id.button6);
            button7=findViewById(R.id.button7);
            button8=findViewById(R.id.button8);
            button9=findViewById(R.id.button9);
            button10=findViewById(R.id.button10);
            button11=findViewById(R.id.button11);
            button12=findViewById(R.id.button12);
            selecionarImagem=findViewById(R.id.selecaoID);
                button1.setTag(1);
                button2.setTag(2);
                button3.setTag(3);
                button4.setTag(4);
                button5.setTag(5);
                button6.setTag(6);
                button7.setTag(7);
                button8.setTag(8);
                button9.setTag(9);
                button10.setTag(10);
                button11.setTag(11);
                button12.setTag(12);
                disableButtons();
        buttons=new ArrayList<>();
        buttons.add(1);
        buttons.add(2);
        buttons.add(3);
        buttons.add(4);
        buttons.add(5);
        buttons.add(6);
        buttons.add(7);
        buttons.add(8);
        buttons.add(9);
        buttons.add(10);
        buttons.add(11);
        buttons.add(12);

        b_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_new.setVisibility(View.INVISIBLE);
                btnBola.setVisibility(View.INVISIBLE);
                btnCoracao.setVisibility(View.INVISIBLE);
                btnTrofeu.setVisibility(View.INVISIBLE);
                selecionarImagem.setVisibility(View.INVISIBLE);
                curGuess=0;
                curLevel=1;
                generateButtons(curLevel);
            }
        });
        btnBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto=("⚽");
            }
        });
        btnCoracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto=("❤");
            }
        });
        btnTrofeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto=("\uD83C\uDFC6");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);
                }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button)v).setText(texto);

            }
        });
    }

    private void buttonLogic(View v){
        List<Integer> tempList=new ArrayList<>();
        for (int i=0;i<curLevel;i++){
            tempList.add(buttons.get(i));

        }
        if (tempList.contains(v.getTag())){
            curGuess++;
            checkWin();

        }else{
            finish();
            Intent intent = new Intent(this, GameOrdemStartScreenLoserActivity.class);
            startActivity(intent);
            }
        }

    private void checkWin(){
        if(curGuess==curLevel){
            disableButtons();
            if(curLevel==12){
                startActivity(new Intent(getApplicationContext(),GameOrdemStartWinActivity.class));
                b_new.setVisibility(View.VISIBLE);
                btnBola.setVisibility(View.VISIBLE);
                btnCoracao.setVisibility(View.VISIBLE);
                btnTrofeu.setVisibility(View.VISIBLE);


            }else{

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        curGuess=0;
                        curLevel++;
                        generateButtons(curLevel);

                    }
                },1000);
            }
        }
    }

    private void generateButtons(int number){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");

        Collections.shuffle(buttons);

        for (int i=0;i<number;i++){
            showButton(buttons.get(i));
        }

        Toast.makeText(this, "NIVEL: "+(number), Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                button10.setText("");
                button11.setText("");
                button12.setText("");
                enableButtons();
            }
        },1000);


    }
    private void showButton(int number){
        switch (number){
            case 1:
                button1.setText(texto);

                break;
            case 2:
                button2.setText(texto);


                break;
            case 3:
                button3.setText(texto);

                break;
            case 4:
                button4.setText(texto);

                break;
            case 5:
                button5.setText(texto);

                break;
            case 6:
                button6.setText(texto);

                break;
            case 7:
                button7.setText(texto);

                break;
            case 8:
                button8.setText(texto);

                break;
            case 9:
                button9.setText(texto);

                break;
            case 10:
                button10.setText(texto);
                break;
            case 11:
                button11.setText(texto);

                break;
            case 12:
                button12.setText(texto);

                break;
        }
    }
    private void enableButtons(){

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);

    }
    private void disableButtons(){
        button1.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);

    }
}
