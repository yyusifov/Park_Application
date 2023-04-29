package com.example.parkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.parkapplication.util.User_Information_View_Model;
import com.google.android.material.snackbar.Snackbar;

import java.util.concurrent.atomic.AtomicBoolean;


public class Login_activity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button Login;
    private TextView moveToRegisterActivity;
    User_Information_View_Model user_information_view_model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user_information_view_model = new ViewModelProvider.AndroidViewModelFactory(Login_activity.this.getApplication()).
                create(User_Information_View_Model.class);
        moveToRegisterActivity = findViewById(R.id.moveToRegister);
        username = findViewById(R.id.addUserName_ID);
        password = findViewById(R.id.addPassword_ID);
        Login = findViewById(R.id.login_BUTTON_id);
        moveToRegisterActivity = findViewById(R.id.moveToRegister);
        moveToRegisterActivity.setOnClickListener(v -> {
            Intent intent = new Intent(Login_activity.this, Registration_activity.class);
            startActivity(intent);
        });
        Login.setOnClickListener(v -> {
            if(!(username.getText().toString().isEmpty() || password.getText().toString().isEmpty())) {
                checkUserInformation(username.getText().toString(), password.getText().toString());
            }
            else{
                Snackbar.make(Login, "Username or Password cannot be empty", Snackbar.LENGTH_LONG).show();
            }
        });
    }
    private void checkUserInformation(String username, String password){
        AtomicBoolean az = new AtomicBoolean(true);
        user_information_view_model.getAllUserInformation().observe(Login_activity.this, user_information -> {
            for(int i = 0; i < user_information_view_model.getAllUserInformation().getValue().size(); i++){
                if(user_information_view_model.getAllUserInformation().getValue().get(i).getUserName() != null ||
                        user_information_view_model.getAllUserInformation().getValue().get(i).getUserPassword() != null){
                if(user_information_view_model.getAllUserInformation().getValue().get(i).getUserName().equals(username) ||
                        user_information_view_model.getAllUserInformation().getValue().get(i).getUserPassword().equals(username)){
                    SharedViewModel sharedViewModel = new ViewModelProvider(this).get(SharedViewModel.class);
                    sharedViewModel.setUpdatedUser(user_information_view_model.getAllUserInformation().getValue().get(i));
                    Intent intent = new Intent(Login_activity.this, MapsActivity.class);
                    startActivity(intent);
                    az.set(false);
                }
            }
        }});

        if(az.get()) {
            Snackbar.make(Login, "Login or Password is wrong", Snackbar.LENGTH_LONG).show();
        }
    }
}