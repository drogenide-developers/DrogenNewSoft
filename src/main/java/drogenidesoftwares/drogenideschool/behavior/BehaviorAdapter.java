package drogenidesoftwares.drogenideschool.behavior;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.jar.Attributes;

import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.onlineexam.OnlineExamModel;
import drogenidesoftwares.drogenideschool.teachers.TeachersFilter;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class BehaviorAdapter extends RecyclerView.Adapter<BehaviorAdapter.BehaviorHolder> {

    List<BehaviorModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public BehaviorAdapter(Context context, List<BehaviorModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public BehaviorHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_behavior, null);
        BehaviorHolder holder = new BehaviorHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(BehaviorHolder holder, final int position) {
        BehaviorHolder myHolder=holder;
        myHolder.tvSubject.setText(itemList.get(position).getBehaviorSubject());
        myHolder.ratingbar.setRating(Float.parseFloat(itemList.get(position).getSubjectRating()));

       // myHolder.Photo.setImageResource(R.mipmap.ic_keyboard_arrow_right_black_36dp);
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(context, BehaviorDetailActivity.class);
               intent.putExtra("Remark",itemList.get(position).getSubjectRemark());
               intent.putExtra("Rating",itemList.get(position).getSubjectRating());
               intent.putExtra("Subject",itemList.get(position).getBehaviorSubject());
              context.startActivity(intent); // start Intent


            }
        });
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }



    public class BehaviorHolder extends RecyclerView.ViewHolder{

        public TextView tvSubject;
        RatingBar ratingbar;


        public BehaviorHolder(View itemView) {
            super(itemView);
            tvSubject = itemView.findViewById(R.id.behavior_subject);
            ratingbar=itemView.findViewById(R.id.behavior_rating_bar_adapter);
        }
    }
}
