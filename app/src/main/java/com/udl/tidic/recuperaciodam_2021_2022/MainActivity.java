package com.udl.tidic.recuperaciodam_2021_2022;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udl.tidic.recuperaciodam_2021_2022.databinding.ActivityMainBinding;
import com.udl.tidic.recuperaciodam_2021_2022.utils.PreferenceProvider;
import com.udl.tidic.recuperaciodam_2021_2022.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    protected ActivityMainBinding activityMainBinding;
    protected MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PreferenceProvider.init(this);

        // @Jordi: Bind the xml with the activity (ActivityLevelsBinding is auto generated).
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        // Set the Content of the xml to the view
        setContentView(activityMainBinding.getRoot());

        // Set the viewModel
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        setUp();
    }


    public void setUp() {
        activityMainBinding.setViewModel(mainViewModel);
        activityMainBinding.setLifecycleOwner(this);

    }

    public void goToGameBoard(View view){
        startActivity( new Intent(this, GameActivity.class));
    }
}