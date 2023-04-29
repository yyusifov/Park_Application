package com.example.parkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parkapplication.model.User_Information;
import com.example.parkapplication.util.User_Information_View_Model;


public class Registration_activity extends AppCompatActivity {
    private EditText userName;
    private EditText passWord;
    private Button registerButton;
    public static int USER_ID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        userName = findViewById(R.id.addUsername_id);

        passWord = findViewById(R.id.addPassword_id);

        registerButton = findViewById(R.id.registerButton_id);

        registerButton.setOnClickListener(v -> {
            if(!(userName.getText().toString().isEmpty() || passWord.getText().toString().isEmpty())){
                Intent intent = new Intent(Registration_activity.this, Login_activity.class);
                User_Information user_information = new User_Information();
                user_information.setUserName(userName.getText().toString());
                user_information.setUserPassword(passWord.getText().toString());
                User_Information_View_Model.insert(user_information);
                SharedViewModel sharedViewModel = new ViewModelProvider(this).get(SharedViewModel.class);
                sharedViewModel.setUpdatedUser(user_information);
                setResult(15987, intent);
                finish();
            }else{
                Toast.makeText(Registration_activity.this, "Username or Password cannot be empty!", Toast.LENGTH_LONG).show();
            }
        });
    }
}