package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends Activity
    {
        EditText editTextUserName,editTextPassword,editTextConfirmPassword;
        Button btnCreateAccount;

        LoginDataBaseAdapter loginDataBaseAdapter;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign_up);


            loginDataBaseAdapter=new LoginDataBaseAdapter(this);
            loginDataBaseAdapter=loginDataBaseAdapter.open();

            editTextUserName=(EditText)findViewById(R.id.editTextUserName);
            editTextPassword=(EditText)findViewById(R.id.editTextPassword);
            editTextConfirmPassword=(EditText)findViewById(R.id.editTextConfirmPassword);

            btnCreateAccount=(Button)findViewById(R.id.buttonCreateAccount);
            btnCreateAccount.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    String userName=editTextUserName.getText().toString();
                    String password=editTextPassword.getText().toString();
                    String confirmPassword=editTextConfirmPassword.getText().toString();


                    if(userName.equals("")||password.equals("")||confirmPassword.equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "All fields are required", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if(!password.equals(confirmPassword))
                    {
                        Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                        return;
                    }
                    else
                    {

                        loginDataBaseAdapter.insertEntry(userName, password);
                        Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
                    }

                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            });
        }
        @Override
        protected void onDestroy() {

            super.onDestroy();

            loginDataBaseAdapter.close();
        }
    }


