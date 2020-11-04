package com.example.listandgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ListviewAdapter extends BaseAdapter {
    private Context context;
    private String[] tensp;
    private int[] hinhsp;
    private String [] phiship;
    private String [] giatien;
    private String[] rbar;

    public ListviewAdapter(Context context, String[] tensp, int[] hinhsp,String[] phiship,String[] giatien,String[] rbar) {
        this.context = context;
        this.tensp = tensp;
        this.hinhsp = hinhsp;
        this.phiship= phiship;
        this.giatien=giatien;
        this.rbar=rbar;
    }

    @Override
    public int getCount() {
        return tensp.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(R.layout.row,null);
        TextView textView = (TextView)view.findViewById(R.id.textView);
        ImageView imageView =(ImageView)view.findViewById(R.id.imageView);
        TextView phi = (TextView)view.findViewById(R.id.ship);
        TextView gia = (TextView)view.findViewById(R.id.gia);
        RatingBar ratingBar=(RatingBar)view.findViewById(R.id.ratingBar);

        textView.setText(tensp[i]);
        imageView.setImageResource(hinhsp[i]);
        phi.setText(phiship[i]);
        gia.setText(giatien[i]);
        ratingBar.setIsIndicator(false);
        return view;
    }
}
