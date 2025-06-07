package com.example.qlphongtro.taikhoandangtin_content.taikhoan.qlthongtin;

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
import androidx.navigation.fragment.NavHostFragment;

import com.example.qlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TaiKhoan_BaoMatFragment extends Fragment {
    private NavController bottomNavigationView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_taikhoan_baomat_dangtin, container, false);
        BottomNavigationView bottomNav = requireActivity().findViewById(R.id.bottom_nav_view_5items);
        ImageButton btn_taikhoan_baomat_backStack = view.findViewById(R.id.btn_taikhoan_baomat_backStack);
        btn_taikhoan_baomat_backStack.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.popBackStack();
            bottomNav.setVisibility(View.VISIBLE);
        });
        return view;
    }
}
