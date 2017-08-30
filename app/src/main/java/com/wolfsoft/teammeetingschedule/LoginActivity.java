package com.wolfsoft.teammeetingschedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Carl_johnson on 8/30/2017.
 */

public class LoginActivity extends AppCompatActivity
{
    Button btnLogin , btnRegister ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegister = (Button) findViewById(R.id.btnRegister);

    }

    public void login(View v)
    {
        Intent i =  new Intent(getApplicationContext() , Home.class);
        startActivity(i);
    }

    public void register(View v)
    {
        Intent i =  new Intent(getApplicationContext() , RegisterActivity.class);
        startActivity(i);
    }


}
