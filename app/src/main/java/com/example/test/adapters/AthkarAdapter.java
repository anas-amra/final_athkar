package com.example.test.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.R;
import com.example.test.models.Athkar;

import java.util.ArrayList;

public class AthkarAdapter extends BaseAdapter {
    Context context;
    ArrayList<Athkar> athkarArrayList = new ArrayList<>();
    LayoutInflater inflater;

    public AthkarAdapter(Context context, ArrayList<Athkar> athkarArrayList) {
        this.context = context;
        this.athkarArrayList = athkarArrayList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return athkarArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return athkarArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return athkarArrayList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root = inflater.inflate(R.layout.athkar_card_design,null);
        ImageView ahtkar_img = root.findViewById(R.id.iv_icon);
        TextView card_title = root.findViewById(R.id.tv_cardtitle);

        // link itmes with data
        ahtkar_img.setImageResource(athkarArrayList.get(i).getImage());
        card_title.setText(athkarArrayList.get(i).getCard_title());

        return root;
    }
}
