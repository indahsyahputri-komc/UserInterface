package com.example.layout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.layout.LoginAction;
import com.example.layout.R;

public class Login extends AppCompatActivity {

    String var_nim,var_nama;
    EditText nim, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Login Form");
        setContentView(R.layout.activity_login);

        nim = (EditText) findViewById(R.id.nim_editText);
        nama = (EditText) findViewById(R.id.nama_editText);

        Button reset = (Button) findViewById(R.id.buttonReset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nim.setText("");
                nama.setText("");
            }
        });

        Button submit = (Button) findViewById(R.id.buttonIn);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var_nim = nim.getText().toString();
                var_nama = nama.getText().toString();
                Intent i = null;
                i = new Intent(Login.this, LoginAction.class);
                Bundle b = new Bundle();
                b.putString("parse_nim", var_nim);
                b.putString("parse_nama", var_nama);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}