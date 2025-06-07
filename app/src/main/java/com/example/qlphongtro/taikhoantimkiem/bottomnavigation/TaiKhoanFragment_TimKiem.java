package com.example.qlphongtro.taikhoantimkiem.bottomnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.qlphongtro.MainActivity;
import com.example.qlphongtro.R;

public class TaiKhoanFragment_TimKiem extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taikhoan_timkiem, container, false);

        LinearLayout llayout_taikhoan_chuyendoitaikhoan = view.findViewById(R.id.llayout_taikhoan_chuyendoitaikhoan);
        llayout_taikhoan_chuyendoitaikhoan.setOnClickListener(v -> {
            // Gọi phương thức trong MainActivity để chuyển về Bottom Navigation 3 items
            ((MainActivity) requireActivity()).switchTo5ItemsNavigation();
        });

        return view;
    }
}