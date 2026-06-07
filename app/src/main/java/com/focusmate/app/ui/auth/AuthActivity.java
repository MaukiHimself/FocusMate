package com.focusmate.app.ui.auth;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.focusmate.app.core.session.SessionManager;
import com.focusmate.app.databinding.ActivityAuthBinding;
import com.focusmate.app.ui.main.MainActivity;

public class AuthActivity extends AppCompatActivity {
    private ActivityAuthBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (SessionManager.isLoggedIn(this)) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
            return;
        }

        binding = ActivityAuthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(v -> {
            String name = binding.etName.getText() == null ? "" : binding.etName.getText().toString().trim();
            if (!name.isEmpty()) SessionManager.setDisplayName(this, name);
            SessionManager.setLoggedIn(this, true);
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        binding.btnSignup.setOnClickListener(v -> {
            // v1 scaffold: signup behaves like login (mock)
            String name = binding.etName.getText() == null ? "" : binding.etName.getText().toString().trim();
            if (!name.isEmpty()) SessionManager.setDisplayName(this, name);
            SessionManager.setLoggedIn(this, true);
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        binding.tvForgot.setOnClickListener(v -> {
            // v1 scaffold: no-op. Firebase reset will be added when Firebase is enabled.
            binding.tvHint.setText("Password reset will be enabled after Firebase setup.");
        });
    }
}

