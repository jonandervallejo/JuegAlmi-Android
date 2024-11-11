package com.dam2.juegalmi.ui.historia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoriaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HistoriaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is historia fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}