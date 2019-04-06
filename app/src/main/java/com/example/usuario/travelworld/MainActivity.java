package com.example.usuario.travelworld;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editextContrasenia;
    private Button buttonCrear;
    private Button buttonIniciar;

    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth=FirebaseAuth.getInstance();

        editextContrasenia=findViewById(R.id.etPass);
        editTextEmail=findViewById(R.id.email);
        buttonCrear=findViewById(R.id.btnCrearCuenta);
        buttonIniciar=findViewById(R.id.btnLogin);

        progressDialog=new ProgressDialog(this);

    }
}
