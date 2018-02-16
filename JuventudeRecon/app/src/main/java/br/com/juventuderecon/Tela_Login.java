package br.com.juventuderecon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class Tela_Login extends AppCompatActivity {

    private EditText email;
    private EditText senha;
    private Button cadastrar;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);



        email = (EditText) findViewById(R.id.recebendoEmail);
        senha = (EditText) findViewById(R.id.recebendoSenha);

        if (email.getText().length() == 0 && senha.getText().length() == 0) {
            email.setError("Email invalido");
            senha.setError("Senha invalida");
        } else if (senha.getText().length() < 5) {
            senha.setError("No mínimo 6 caracteres");
        }


        cadastrar = (Button) findViewById(R.id.btnCadastro);

        cadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Login.this, Tela_Cadastro.class);
                startActivity(intent);
            }
        });

        login = (Button) findViewById(R.id.btnLogin);

       login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Login.this, Tela_Logoon.class);
                startActivity(intent);
            }
        });

    }
}

