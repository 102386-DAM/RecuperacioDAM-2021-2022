package com.udl.tidic.recuperaciodam_2021_2022.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class GameViewModel extends ViewModel {

    public MutableLiveData<String> dinersLiveData1;

    public GameViewModel(){
        this.dinersLiveData1 = new MutableLiveData<>();

    }



}
