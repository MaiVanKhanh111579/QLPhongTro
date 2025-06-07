package com.example.qlphongtro.taikhoantimkiem.bottomnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.qlphongtro.R;

public class LuuTinFragment extends Fragment {
    private ImageView ivEmptySaved;
    private TextView tvEmptyTitle, tvEmptyDesc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_luutin, container, false);

        ivEmptySaved   = view.findViewById(R.id.iv_empty_saved);
        tvEmptyTitle   = view.findViewById(R.id.tv_empty_saved_title);
        tvEmptyDesc    = view.findViewById(R.id.tv_empty_saved_desc);

        // Ví dụ: nếu bạn có list dữ liệu, check size để show/hide các view này
        // if (savedList.isEmpty()) { … } else { … }

        return view;
    }
}
