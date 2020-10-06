package mealzaimerproject.com.mealzaimer.anotacoesMEAlzheimer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.R;

public class AnotacaoUmActivity extends AppCompatActivity {
    protected ImageButton abrirAnotacao;
    protected TextView textoUm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotacao_um);
        abrirAnotacao=(ImageButton)findViewById(R.id.btnAnotacaoUm);
         abrirAnotacao.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AnotacaoUmSalvaActivity.class));
            }
        });
        abrirAnotacao.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                exibirconfirmacao();
                return true;
            }
        });
    }
    public void exibirconfirmacao(){
        AlertDialog.Builder msgBox= new AlertDialog.Builder(this);
        msgBox.setTitle("Confirmação de exclusão.");
        msgBox.setIcon(R.drawable.iconexcluir);
        msgBox.setMessage("Tem certeza que deseja excluir esta anotação?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(getApplicationContext(),InicioAnotacoesActivity.class));
            }
        });
        msgBox.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast toast = Toast.makeText(getApplicationContext(), "Exclusão cancelada.",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        msgBox.show();
    }
}
