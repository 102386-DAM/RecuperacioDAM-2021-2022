package com.udl.tidic.recuperaciodam_2021_2022.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.udl.tidic.recuperaciodam_2021_2022.utils.PreferenceProvider;

public class MainViewModel extends ViewModel {

    public MutableLiveData<String> dinersLiveData;

    public MainViewModel(){
        this.dinersLiveData = new MutableLiveData<>("");


    }

    public MutableLiveData<String> getDinersLiveData() {
        return dinersLiveData;
    }

    public void setDinersLiveData(MutableLiveData<String> dinersLiveData) {
        this.dinersLiveData = dinersLiveData;
    }

    public void guardardiners(){

        PreferenceProvider.providePreferences().getInt("money", 0);
        dinersLiveData.setValue("diners" + String.valueOf(PreferenceProvider.providePreferences().getInt("money", 0)));
    }
}



