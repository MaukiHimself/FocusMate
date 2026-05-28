package com.salieai.app.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.salieai.app.core.session.SessionManager;
import com.salieai.app.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String name = SessionManager.getDisplayName(requireContext());
        binding.tvGreeting.setText("Hi, " + name + " 👋");
        binding.tvMotivation.setText("Small steps today = big wins tomorrow.");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

