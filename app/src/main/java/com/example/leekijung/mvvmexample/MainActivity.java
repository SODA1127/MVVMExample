package com.example.leekijung.mvvmexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.leekijung.mvvmexample.databinding.ActivityMainBinding;
import com.example.leekijung.mvvmexample.model.User;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }

    public void onButtonClick(View view) {
        User user = new User(binding.idInput.getText().toString(), binding.pwInput.getText().toString());
        //Toast.makeText(getApplicationContext(), "ID : ", Toast.LENGTH_SHORT);
        binding.idTv.setText(user.getId());
        binding.pwTv.setText(user.getPw());
    }
}
