package com.dam2.juegalmi.ui.historia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.dam2.juegalmi.R;
import com.dam2.juegalmi.databinding.FragmentHistoriaBinding;

public class HistoriaFragment extends Fragment {

    private FragmentHistoriaBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HistoriaViewModel historiaViewModel =
                new ViewModelProvider(this).get(HistoriaViewModel.class);

        binding = FragmentHistoriaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Configuración de los TextViews
        binding.textHistoria1.setText(getString(R.string.historia_texto1));
        binding.textHistoria2.setText(getString(R.string.historia_texto2));
        binding.textHistoria3.setText(getString(R.string.historia_texto3));

        // Configuración de los ImageViews
        binding.imagenHistoria1.setImageResource(R.drawable.tiendahistoria);
        binding.imagenHistoria2.setImageResource(R.drawable.tiendahistoria2);
        binding.imagenHistoria3.setImageResource(R.drawable.tiendahistoria3);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
