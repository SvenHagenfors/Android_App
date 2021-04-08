package com.example.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private Button button;
    private String username, password, email;
    private EditText usernameInput, passwordInput, emailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameInput = (EditText) findViewById(R.id.input_username);
        passwordInput = (EditText) findViewById(R.id.input_password);
        emailInput = (EditText) findViewById(R.id.input_email);

        button = findViewById(R.id.submit_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = usernameInput.getText().toString();
                password = passwordInput.getText().toString();
                email = emailInput.getText().toString();
                openPost();
            }
        });
    }
    public void openPost() {
        Intent intent = new Intent(this, PostActivity.class);
        startActivity(intent);
    }

    public void openPost(View view) {
    }
}