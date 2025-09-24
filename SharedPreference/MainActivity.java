package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,mobileno,email,pass,passnew;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.edit1);
        mobileno=findViewById(R.id.edit2);
        email=findViewById(R.id.edit3);
        pass=findViewById(R.id.edit4);
        passnew=findViewById(R.id.edit5);
        button=findViewById(R.id.button);

        sharedPreferences = getSharedPreferences("User details",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernames=username.getText().toString().trim();
                String mobile=mobileno.getText().toString().trim();
                String emails=email.getText().toString().trim();
                String passs=pass.getText().toString().trim();
                String passnews=passnew.getText().toString().trim();

                if (usernames.isEmpty()){
                    username.setError("username is empty");
                    username.requestFocus();
                    return;
                }
                if (mobile.isEmpty()){
                    mobileno.setError("mobile number is empty");
                    mobileno.requestFocus();
                    return;
                }
                if (emails.isEmpty()){
                    email.setError("input email");
                    email.requestFocus();
                    return;
                }
                if (passs.isEmpty()){
                    pass.setError("enter password");
                    pass.requestFocus();
                    return;
                }
                if (passnews.isEmpty()){
                    passnew.setError("confirm password");
                    passnew.requestFocus();
                    return;

                }
                if (passs.length() < 6) {
                    pass.setError("length should be 6 character");
                    pass.requestFocus();
                    return;
            }
                if (!passs.equals(passnews)) {
                    passnew.setError("password not matched");
                    passnew.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this,"registration successfull",Toast.LENGTH_SHORT).show();
                editor.putString("keyusernames",usernames);
                editor.putString("keymobile",mobile);
                editor.putString("keyemail",emails);
                editor.putString("keypassnews",passnews);
                editor.apply();
            }

        }));
    }
}




