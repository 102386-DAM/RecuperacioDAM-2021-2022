package com.udl.tidic.recuperaciodam_2021_2022;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.udl.tidic.recuperaciodam_2021_2022.databinding.ActivityGameBinding;
import com.udl.tidic.recuperaciodam_2021_2022.databinding.ActivityMainBinding;
import com.udl.tidic.recuperaciodam_2021_2022.utils.PreferenceProvider;
import com.udl.tidic.recuperaciodam_2021_2022.viewmodel.GameViewModel;
import com.udl.tidic.recuperaciodam_2021_2022.viewmodel.MainViewModel;

import org.w3c.dom.Text;

public class GameActivity extends AppCompatActivity {

    protected ActivityGameBinding activityGameBinding;
    protected GameViewModel gameViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        activityGameBinding = ActivityGameBinding.inflate(getLayoutInflater());

        // Set the Content of the xml to the view
        setContentView(activityGameBinding.getRoot());

        // Set the viewModel
        gameViewModel = new ViewModelProvider(this).get(GameViewModel.class);

        setUp();

    }

    public void setUp() {
        activityGameBinding.setGameViewModel(gameViewModel);
        activityGameBinding.setLifecycleOwner(this);
    }
}
