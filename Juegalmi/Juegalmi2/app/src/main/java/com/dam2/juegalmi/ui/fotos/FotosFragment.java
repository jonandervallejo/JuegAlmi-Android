package com.dam2.juegalmi.ui.fotos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dam2.juegalmi.R;
import com.dam2.juegalmi.databinding.FragmentFotosBinding;

import java.util.Arrays;
import java.util.List;

public class FotosFragment extends Fragment {

    private FragmentFotosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FotosViewModel fotosViewModel =
                new ViewModelProvider(this).get(FotosViewModel.class);

        binding = FragmentFotosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        // Lista de IDs de recursos de imágenes en drawable
        List<Integer> imageResIds = Arrays.asList(
                R.drawable.imagen1,
                R.drawable.imagen2,
                R.drawable.imagen3,
                R.drawable.imagen4,
                R.drawable.imagen5,
                R.drawable.imagen6,
                R.drawable.imagen7

        );

        // Configuración del RecyclerView
        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        FotosAdapter adapter = new FotosAdapter(getContext(), imageResIds);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
