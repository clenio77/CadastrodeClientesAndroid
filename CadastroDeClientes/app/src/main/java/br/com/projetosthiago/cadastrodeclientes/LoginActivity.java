package br.com.projetosthiago.cadastrodeclientes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //detecta o Botão nova conta através do R.id.btnNovaConta
        Button btnNovaConta = (Button) findViewById(R.id.btnNovaConta);
        //
        btnNovaConta.setOnClickListener(onClickNovaConta());
    }

    private View.OnClickListener onClickNovaConta(){
        return new Button.OnClickListener(){
            public void onClick(View v){
                //Carrega a Activity que deseja navegar.
                Intent intent = new Intent(getContext(), NovaContaActivity.class);

                startActivity(intent);
            }
        };
    }

    private Context getContext(){
        return this;
    }
}
