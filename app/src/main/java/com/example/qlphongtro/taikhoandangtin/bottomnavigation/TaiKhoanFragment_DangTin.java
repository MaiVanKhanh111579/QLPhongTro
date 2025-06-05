package com.example.qlphongtro.taikhoandangtin.bottomnavigation;

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

public class TaiKhoanFragment_DangTin extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taikhoan_dangtin, container, false);

        LinearLayout llayout_taikhoan_dangtin_chuyendoitaikhoan = view.findViewById(R.id.llayout_taikhoan_dangtin_chuyendoitaikhoan);
        llayout_taikhoan_dangtin_chuyendoitaikhoan.setOnClickListener(v -> {
            ((MainActivity) getActivity()).switchToTimKiemMode();
        });

        return view;
    }
}