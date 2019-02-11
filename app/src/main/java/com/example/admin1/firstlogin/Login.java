package com.example.admin1.firstlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_login);
    }

    public void signUp(View view){
        Intent startNewActivity = new Intent (this, signUpActivity.class);
        startActivity(startNewActivity);
    }

    public void learnMore(View view){
        Intent startNewActivity = new Intent (this, LearnMore.class);
        startActivity(startNewActivity);
    }

}
