package drogenidesoftwares.drogenideschool.onlineexam;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.homework.HomeworkModel;
import drogenidesoftwares.drogenideschool.teachers.TeachersFilter;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class OnlineExamAdapter extends RecyclerView.Adapter<OnlineExamAdapter.OnlineExamHolder> {

    List<OnlineExamModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public OnlineExamAdapter(Context context, List<OnlineExamModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public OnlineExamHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_online_exam, null);
        OnlineExamHolder holder = new OnlineExamHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(OnlineExamHolder holder, final int position) {
        OnlineExamHolder myHolder=holder;
        myHolder.onlineTitle.setText(itemList.get(position).getOnlineExamTitle());
        myHolder.onlineEndDate.setText(itemList.get(position).getOnlineExamEndDate());
        myHolder.onlineStartDate.setText(itemList.get(position).getOnlineExamStartDate());
        myHolder.onlineSubject.setText(itemList.get(position).getOnlineExamSubject());
        myHolder.onlineResult.setText(itemList.get(position).getOnlineExamResult());
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



    public class OnlineExamHolder extends RecyclerView.ViewHolder{

        public TextView onlineTitle, onlineStartDate, onlineEndDate,onlineSubject,onlineResult;
        public ImageView Photo;

        public OnlineExamHolder(View itemView) {
            super(itemView);
            onlineTitle = itemView.findViewById(R.id.online_title);
            onlineStartDate = itemView.findViewById(R.id.online_start_date);
            onlineEndDate =itemView.findViewById(R.id.online_end_date);
            onlineSubject=itemView.findViewById(R.id.online_subject);
            onlineResult=itemView.findViewById(R.id.online_result);
        }



    }








}
