package mealzaimerproject.com.mealzaimer.sobreMimMEAlzheimer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.PerfilPreenchidoActivity;
import mealzaimerproject.com.mealzaimer.R;

public class EditSobreMimActivity extends AppCompatActivity {
    private  ImageButton salvar;
    private ImageButton  cancelar;

    private ImageButton imagem;
    private final int GALETIA_IMAGENS=1;
    private final int PERMISSÃO_REQUEST=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_sobre_mim);

        if(ContextCompat.checkSelfPermission(this,Manifest.permission.READ_EXTERNAL_STORAGE)
                !=PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.READ_EXTERNAL_STORAGE)){

            }else{
                ActivityCompat.requestPermissions(this,new String[]
                        {Manifest.permission.READ_EXTERNAL_STORAGE},PERMISSÃO_REQUEST);
            }
        }

        imagem=(ImageButton)findViewById(R.id.btnAdicionarImagem);
        imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent,1);
            }
        });
        salvar=(ImageButton)findViewById(R.id.btnSalvarPerfil);
        cancelar=(ImageButton)findViewById(R.id.btnCancelarPerfil);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PerfilPreenchidoActivity.class));
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK && requestCode == GALETIA_IMAGENS){
            Uri selectedImage=data.getData();
            String[]filePatch={MediaStore.Images.Media.DATA};
            Cursor c = getContentResolver().query(selectedImage,filePatch,null,null,null);
            c.moveToFirst();
            int columnIndex=c.getColumnIndex(filePatch[0]);
            String picturePath=c.getString(columnIndex);
            c.close();
            Bitmap imagemGaleria=BitmapFactory.decodeFile(picturePath);
            imagem.setImageBitmap(imagemGaleria);
        }
    }

}
