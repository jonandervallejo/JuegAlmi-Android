package com.dam2.juegalmi.ui.producto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.dam2.juegalmi.R;

public class ConsolaFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflar el layout específico para Consolas
        return inflater.inflate(R.layout.fragment_consola, container, false);
    }
}