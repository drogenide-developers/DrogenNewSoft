package drogenidesoftwares.drogenideschool.noticeboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

import drogenidesoftwares.drogenideschool.R;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class NoticeBoardAdapter extends RecyclerView.Adapter<NoticeBoardAdapter.NoticeBoardHolder>implements Filterable {

    ArrayList<NoticeBoardModel> itemList,filterList;
    private Context context;
    NoticeBoardFilter filter;

    public NoticeBoardAdapter(Context context, ArrayList<NoticeBoardModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public NoticeBoardHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.noticeboarditem, null);
        NoticeBoardHolder holder = new NoticeBoardHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(NoticeBoardHolder holder, final int position) {
        NoticeBoardHolder myHolder=holder;
        myHolder.noticeDateTv.setText(itemList.get(position).getNoticeDate());
        myHolder.title.setText(itemList.get(position).getNoticeTitle());
        myHolder.noticeDescriptionTv.setText(itemList.get(position).getNoticeDescription());
       // myHolder.Photo.setImageResource(R.mipmap.ic_keyboard_arrow_right_black_36dp);
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"position is"+ itemList.get(position),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetailNoticeActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("Date",itemList.get(position).getNoticeDate());
                bundle.putString("Description", itemList.get(position).getNoticeDescription()); // put image data in Intent
                bundle.putString("NoticeTitle",itemList.get(position).getNoticeTitle());
                intent.putExtras(bundle);
                context.startActivity(intent); // start Intent
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    @Override
    public Filter getFilter() {
        if(filter==null)
        {
            filter=new NoticeBoardFilter((ArrayList<NoticeBoardModel>) filterList,this);
        }
        return filter;
    }
    public class NoticeBoardHolder extends RecyclerView.ViewHolder{

        public TextView noticeDateTv,title;
        public TextView noticeDescriptionTv;

        public NoticeBoardHolder(View itemView) {
            super(itemView);
            noticeDateTv = itemView.findViewById(R.id.notice_date);
            noticeDescriptionTv =itemView.findViewById(R.id.notice_description);
            title=itemView.findViewById(R.id.tv);
        }
    }
}
