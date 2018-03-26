package drogenidesoftwares.drogenideschool.noticeboard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

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
        myHolder.noticeDescriptionTv.setText(itemList.get(position).getNoticeDescription());
       // myHolder.Photo.setImageResource(R.mipmap.ic_keyboard_arrow_right_black_36dp);
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(v.getContext(),"position is"+ itemList.get(position),Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(context, BusinessCategoryActivity.class);
//                intent.putExtra("ID",itemList.get(position).getID());
                //intent.putExtra("image", Attributes.Name.get(position)); // put image data in Intent
//                context.startActivity(intent); // start Intent


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

        public TextView noticeDateTv;
        public TextView noticeDescriptionTv;

        public NoticeBoardHolder(View itemView) {
            super(itemView);
            noticeDateTv = itemView.findViewById(R.id.notice_date);
            noticeDescriptionTv =itemView.findViewById(R.id.notice_description);
        }



    }








}
