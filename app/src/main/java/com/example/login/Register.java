package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    private Button btregister;
    private EditText Name, Age, Username, Password;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btregister=(Button) findViewById(R.id.btnregister);
        btregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Register.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    private void setupUIViews() {
        Name = (EditText) findViewById(R.id.Name);
        Age = (EditText) findViewById(R.id.price);
        Username = (EditText) findViewById((R.id.UserName));
        Password = (EditText) findViewById(R.id.Password);
    }
    private Boolean validate() {
        Boolean result = false;

        String name = Name.getText().toString();
        String age = Age.getText().toString();
        String username = Username.getText().toString();
        String password = Password.getText().toString();

        if(name.isEmpty() && age.isEmpty() && username.isEmpty() && password.isEmpty()){
            Toast.makeText(this,"Please enter all the details",Toast.LENGTH_SHORT).show();
        }
        else{
            result = true;
        }
     return result;
    }

    }
