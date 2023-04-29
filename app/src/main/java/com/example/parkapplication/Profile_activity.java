package com.example.parkapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.parkapplication.model.User_Information;
import com.example.parkapplication.util.User_Information_View_Model;




public class Profile_activity extends Fragment {
    public EditText userName;
    public EditText password_user;
    public Button saveButton;
    public TextView initialUserName;
    private SharedViewModel sharedViewModel;
    public Profile_activity() {
    }
    public static Profile_activity newInstance() {
        Profile_activity fragment = new Profile_activity();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharedViewModel = new ViewModelProvider(this.requireActivity()).get(SharedViewModel.class);
//        Log.d("My name is 2", sharedViewModel.getUpdatedUser().getValue().getUserName());
//        if(sharedViewModel.getUpdatedUser().getValue().getUserName() != null){
//            initialUserName.setText(sharedViewModel.getUpdatedUser().getValue().getUserName());
//        }
        saveButton.setOnClickListener(v -> {
            User_Information user_information = new User_Information();
            if(!password_user.getText().toString().isEmpty()){
                user_information.setUserPassword(password_user.getText().toString());
                Toast.makeText(this.requireContext(), "Changes were saved!", Toast.LENGTH_LONG).show();
            }
            if(!userName.getText().toString().isEmpty()){
                user_information.setUserName(userName.getText().toString());
                Toast.makeText(this.requireContext(), "Changes were saved!", Toast.LENGTH_LONG).show();
            }
            initialUserName.setText(user_information.getUserName());
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_activity, container, false);
        userName = view.findViewById(R.id.username_id_change);
        initialUserName = view.findViewById(R.id.bigusername);
        password_user = view.findViewById(R.id.password_id_change);
        saveButton = view.findViewById(R.id.Save_chnages_button);
        return view;
    }
}