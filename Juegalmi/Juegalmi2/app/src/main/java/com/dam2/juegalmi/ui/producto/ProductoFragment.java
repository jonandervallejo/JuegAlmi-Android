package com.dam2.juegalmi.ui.producto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.dam2.juegalmi.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ProductoFragment extends Fragment {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflar el layout
        View root = inflater.inflate(R.layout.fragment_producto, container, false);

        // Inicializar el TabLayout y ViewPager2
        tabLayout = root.findViewById(R.id.idTab);
        viewPager = root.findViewById(R.id.viewPager);

        // Establecer el adaptador para el ViewPager2
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // Sincronizar el TabLayout con el ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Videojuegos");
                    break;
                case 1:
                    tab.setText("Consolas");
                    break;
                case 2:
                    tab.setText("Smartphones");
                    break;
            }
        }).attach();

        return root;
    }

    // Adaptador para ViewPager2
    private static class ViewPagerAdapter extends FragmentStateAdapter {
        public ViewPagerAdapter(Fragment fragment) {
            super(fragment);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            // Retorna el fragment correspondiente según la posición
            switch (position) {
                case 0:
                    return new VideojuegoFragment(); // Fragmento de Videojuegos
                case 1:
                    return new ConsolaFragment(); // Fragmento de Consolas
                case 2:
                    return new SmartphoneFragment(); // Fragmento de Smartphones
                default:
                    return new VideojuegoFragment();
            }
        }

        @Override
        public int getItemCount() {
            return 3; // 3 pestañas: Videojuegos, Consolas, Smartphones
        }
    }
}
