package com.example.qlphongtro.taikhoandangtin.bottomnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.example.qlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainDangTinFragment extends Fragment {
    private NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_dangtin, container, false);
        navController = NavHostFragment.findNavController(this);

        // Đặt điểm bắt đầu cho chế độ đăng tin
        navController.navigate(R.id.navigation_tongquan);

        return view;
    }
}