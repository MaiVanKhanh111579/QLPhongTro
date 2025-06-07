package com.example.qlphongtro.taikhoandangtin_content.taikhoan.qltaichinh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.qlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThongTinSoDuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dangtin_thongtinsodu, container,false);
        BottomNavigationView bottomNav = requireActivity().findViewById(R.id.bottom_nav_view_5items);
        ImageButton btn_thongtinsodu_backStack = view.findViewById(R.id.btn_thongtinsodu_backStack);
        btn_thongtinsodu_backStack.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.popBackStack();
            bottomNav.setVisibility(View.VISIBLE);
        });
        return view;
    }
}
