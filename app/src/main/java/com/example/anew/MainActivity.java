package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText Email;
    EditText Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.button);
        Email=(EditText) findViewById(R.id.email);
        Password = (EditText)findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1 = Email.getText().toString();
                String password1 = Password.getText().toString();
                System.out.println(name1+" " + password1);
                Toast.makeText(MainActivity.this,name1,Toast.LENGTH_LONG).show();
            }
        });

    }
}
