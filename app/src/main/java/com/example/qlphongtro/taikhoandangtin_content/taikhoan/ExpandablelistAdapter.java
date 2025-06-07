package com.example.qlphongtro.taikhoandangtin_content.taikhoan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qlphongtro.R;

import java.util.List;
import java.util.Map;

public class ExpandablelistAdapter extends BaseExpandableListAdapter {

    private List<GroupExpandablelistview> mgroupexpandablelist;
    private Map<GroupExpandablelistview, List<ItemExpandablelistview>> mitemexpandablelist;

    public ExpandablelistAdapter(List<GroupExpandablelistview> mgroupexpandablelist, Map<GroupExpandablelistview, List<ItemExpandablelistview>> mitemexpandablelist) {
        this.mgroupexpandablelist = mgroupexpandablelist;
        this.mitemexpandablelist = mitemexpandablelist;
    }
    @Override
    public int getGroupCount() {
        if (mgroupexpandablelist != null) {
            return mgroupexpandablelist.size();
        }
        return 0;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        if (mgroupexpandablelist != null && mitemexpandablelist != null) {
            return mitemexpandablelist.get(mgroupexpandablelist.get(groupPosition)).size();
        }
        return 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mgroupexpandablelist.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mitemexpandablelist.get(mgroupexpandablelist.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        GroupExpandablelistview groupExpandablelistview = mgroupexpandablelist.get(groupPosition);
        return groupExpandablelistview.getId();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        ItemExpandablelistview itemExpandablelistview = mitemexpandablelist.get(mgroupexpandablelist.get(groupPosition)).get(childPosition);
        return itemExpandablelistview.getId();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View
            convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_expandablelistview_taikhoan_group, parent, false);
        }
        ImageView icon = convertView.findViewById(R.id.img_ic_layoutexpandablelistview_taikhoan_group);
        ImageView arrowdown = convertView.findViewById(R.id.img_ic_layoutexpandablelistview_taikhoan_group_arrowdown);
        arrowdown.setRotation(isExpanded ? 180 : 0);
        TextView txt_layoutexpandablelistview_taikhoan_group = convertView.findViewById(R.id.txt_layoutexpandablelistview_taikhoan_group);
        GroupExpandablelistview groupExpandablelistview = mgroupexpandablelist.get(groupPosition);
        txt_layoutexpandablelistview_taikhoan_group.setText(groupExpandablelistview.getName());
        switch (groupExpandablelistview.getId()) {
            case 1:
                icon.setImageResource(R.drawable.ic_listcheck_black);
                break;
            case 2:
                icon.setImageResource(R.drawable.ic_people_black);
                break;
            case 3:
                icon.setImageResource(R.drawable.ic_chart2_black);
                break;
            case 4:
                icon.setImageResource(R.drawable.ic_setting2_black);
                break;
        }
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View
            convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_expandablelistview_taikhoan_item, parent, false);
        }
        TextView txt_layoutexpandablelistview_taikhoan_item = convertView.findViewById(R.id.txt_layoutexpandablelistview_taikhoan_item);
        ItemExpandablelistview itemExpandablelistview = mitemexpandablelist.get(mgroupexpandablelist.get(groupPosition)).get(childPosition);
        txt_layoutexpandablelistview_taikhoan_item.setText(itemExpandablelistview.getName());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

