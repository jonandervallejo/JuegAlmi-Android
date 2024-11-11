package com.dam2.juegalmi.ui.fotos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FotosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FotosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("PRUEBA1");
    }

    public LiveData<String> getText() {
        return mText;
    }
}