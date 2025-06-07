package com.example.qlphongtro.taikhoandangtin.bottomnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.qlphongtro.MainActivity;
import com.example.qlphongtro.R;
import com.example.qlphongtro.taikhoandangtin_content.taikhoan.ExpandablelistAdapter;
import com.example.qlphongtro.taikhoandangtin_content.taikhoan.GroupExpandablelistview;
import com.example.qlphongtro.taikhoandangtin_content.taikhoan.ItemExpandablelistview;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaiKhoanFragment_DangTin extends Fragment {
    private ExpandableListView expandableListView;
    private List<GroupExpandablelistview> mgroupExpandablelistview;
    private Map<GroupExpandablelistview, List<ItemExpandablelistview>> mitemExpandablelistview;
    private ExpandablelistAdapter expandablelistAdapter;
    private BottomNavigationView bottomNavigationView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taikhoan_dangtin, container, false);
        LinearLayout llayout_taikhoan_dangtin_chuyendoitaikhoan = view.findViewById(R.id.llayout_taikhoan_dangtin_chuyendoitaikhoan);
        llayout_taikhoan_dangtin_chuyendoitaikhoan.setOnClickListener(v -> {
            // Gọi phương thức trong MainActivity để chuyển về Bottom Navigation 3 items
            ((MainActivity) requireActivity()).switchTo3ItemsNavigation();
        });
        BottomNavigationView bottomNav = requireActivity().findViewById(R.id.bottom_nav_view_5items);
        expandableListView = view.findViewById(R.id.expandablelistview_taikhoan);
        mitemExpandablelistview = getMitemExpandablelistview();
        mgroupExpandablelistview = new ArrayList<>(mitemExpandablelistview.keySet());

        expandableListView.setGroupIndicator(null);
        expandablelistAdapter = new ExpandablelistAdapter(mgroupExpandablelistview,mitemExpandablelistview);
        expandableListView.setAdapter(expandablelistAdapter);
        expandableListView.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            ItemExpandablelistview item = mitemExpandablelistview.get(mgroupExpandablelistview.get(groupPosition)).get(childPosition);
            //--TIỆN ÍCH--\\
            if (item.getName().equals("Quản lý thông tin")) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_taikhoan_dangtin_to_navigation_qlthongtin_dangtin);
                bottomNav.setVisibility(View.GONE);
            } else if (item.getName().equals("Bảo mật")) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_taikhoan_dangtin_to_navigation_qltaikhoan_baomat_dangtin);
                bottomNav.setVisibility(View.GONE);
            }   else if (item.getName().equals("Đăng xuất")) {
                Toast.makeText(getContext(), "Điều hướng đang cập nhật", Toast.LENGTH_SHORT).show();

            }
            //--QUẢN LÝ TIN ĐĂNG--\\
            else if (item.getName().equals("Đăng mới")) {
                Toast.makeText(getContext(), "Điều hướng đang cập nhật", Toast.LENGTH_SHORT).show();

            } else if (item.getName().equals("Danh sách tin")) {
                Toast.makeText(getContext(), "Điều hướng đang cập nhật", Toast.LENGTH_SHORT).show();

            } else if (item.getName().equals("Tin nháp")) {
                Toast.makeText(getContext(), "Điều hướng đang cập nhật", Toast.LENGTH_SHORT).show();
            }
            //--QUẢN LÝ TÀI CHÍNH--\\
            else if (item.getName().equals("Thông tin số dư")) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_taikhoan_dangtin_to_navigation_qltaichinh_thongtinsodu);
                bottomNav.setVisibility(View.GONE);
            } else if (item.getName().equals("Lịch sử giao dịch")) {
                Toast.makeText(getContext(), "Điều hướng đang cập nhật", Toast.LENGTH_SHORT).show();
            } else if (item.getName().equals("Nhóm khuyến mãi")) {
                Toast.makeText(getContext(), "Điều hướng đang cập nhật", Toast.LENGTH_SHORT).show();

            }
            return true;
        });
        return view;
    }
    private Map<GroupExpandablelistview, List<ItemExpandablelistview>> getMitemExpandablelistview(){
        Map<GroupExpandablelistview, List<ItemExpandablelistview>> MitemExpandablelistview = new LinkedHashMap<>();

        GroupExpandablelistview groupExpandablelistview1 = new GroupExpandablelistview(1, "Quản lý tin đăng");
        //GroupExpandablelistview groupExpandablelistview2 = new GroupExpandablelistview(2, "Quản lý khách hàng");
        GroupExpandablelistview groupExpandablelistview3 = new GroupExpandablelistview(3, "Quản lý tài chính");
        GroupExpandablelistview groupExpandablelistview4 = new GroupExpandablelistview(4, "Tiện ích");

        List<ItemExpandablelistview> itemExpandablelistviewList1 = new ArrayList<>();
        itemExpandablelistviewList1.add(new ItemExpandablelistview(1, "Đăng mới"));
        itemExpandablelistviewList1.add(new ItemExpandablelistview(2, "Danh sách tin"));
        itemExpandablelistviewList1.add(new ItemExpandablelistview(3, "Tin nháp"));

//        List<ItemExpandablelistview> itemExpandablelistviewList2 = new ArrayList<>();
//        itemExpandablelistviewList2.add(new ItemExpandablelistview(1, "Đăng mới"));
//        itemExpandablelistviewList2.add(new ItemExpandablelistview(2, "Danh sách tin"));
//        itemExpandablelistviewList2.add(new ItemExpandablelistview(3, "Tin nháp"));

        List<ItemExpandablelistview> itemExpandablelistviewList3 = new ArrayList<>();
        itemExpandablelistviewList3.add(new ItemExpandablelistview(1, "Thông tin số dư"));
        itemExpandablelistviewList3.add(new ItemExpandablelistview(2, "Lịch sử giao dịch"));
        itemExpandablelistviewList3.add(new ItemExpandablelistview(3, "Nhóm khuyến mãi"));

        List<ItemExpandablelistview> itemExpandablelistviewList4 = new ArrayList<>();
        itemExpandablelistviewList4.add(new ItemExpandablelistview(1, "Quản lý thông tin"));
        itemExpandablelistviewList4.add(new ItemExpandablelistview(2, "Bảo mật"));
        itemExpandablelistviewList4.add(new ItemExpandablelistview(3, "Đăng xuất"));

        MitemExpandablelistview.put(groupExpandablelistview1, itemExpandablelistviewList1);
        //MitemExpandablelistview.put(groupExpandablelistview2, null);
        MitemExpandablelistview.put(groupExpandablelistview3, itemExpandablelistviewList3);
        MitemExpandablelistview.put(groupExpandablelistview4, itemExpandablelistviewList4);


        return MitemExpandablelistview;
    }
}