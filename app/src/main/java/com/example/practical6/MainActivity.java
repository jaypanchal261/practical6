package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a1,a2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1= findViewById(R.id.user);
        a2= findViewById(R.id.ps);
        b1= findViewById(R.id.login);


        String u= "abc123@xcm.com";
        String p= "xcvb456";

        b1.setEnabled(false);

        a2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                   a1.setError("this is ssample");
            }

            @Override
            public void afterTextChanged(Editable s) {

                b1.setEnabled(false);

                if(a1.getText().toString().equals(u) && a2.getText().toString().equals(p)){
                    b1.setEnabled(true);
                }
//



            }
        });

        a1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

                b1.setEnabled(false);

                if(a1.getText().toString().equals(u) && a2.getText().toString().equals(p)){
                    b1.setEnabled(true);
                }




            }
        });




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(a1.getText().toString().equals(u) && a2.getText().toString().equals(p)) {
                    Toast.makeText(getApplicationContext(), "Log In Successfully", Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(getApplicationContext(), "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                }




            }
        });
    }
}