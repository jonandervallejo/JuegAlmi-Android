package com.dam2.juegalmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;



public class RegisterFragment extends Fragment {

    public RegisterFragment() {
        // Requerido constructor vacío
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar el layout para este fragmento
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        // Referencias a los campos de texto y botón
        EditText emailEditText = view.findViewById(R.id.email);
        EditText nombreEditText = view.findViewById(R.id.nombre);
        EditText apellido1EditText = view.findViewById(R.id.apellido1);
        EditText apellido2EditText = view.findViewById(R.id.apellido2);
        EditText contrasenaEditText = view.findViewById(R.id.contrasena);
        Button registerButton = view.findViewById(R.id.btnRegister);

        // Acción cuando el usuario haga clic en "Registrarse"
        registerButton.setOnClickListener(v -> {
            // Captura los valores de los campos
            String email = emailEditText.getText().toString();
            String nombre = nombreEditText.getText().toString();
            String apellido1 = apellido1EditText.getText().toString();
            String apellido2 = apellido2EditText.getText().toString();
            String contraseña = contrasenaEditText.getText().toString();

            // Aquí puedes añadir la lógica para manejar el registro (validación, enviar datos a un servidor, etc.)

            // Puedes mostrar un mensaje o hacer algo con los datos ingresados
            // Por ejemplo, si deseas mostrar los datos en el log:
            System.out.println("Registrado con correo: " + email + ", nombre: " + nombre + ", apellidos: " + apellido1 + " " + apellido2);
        });

        return view;
    }
}
