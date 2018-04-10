package drogenidesoftwares.drogenideschool.schedule;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import drogenidesoftwares.drogenideschool.R;

/**
 * Created by Vicky on 29-Mar-18.
 */

public class ExamScheduleAdapter extends RecyclerView.Adapter<ExamScheduleAdapter.examScheduleHolder> {
    List<examScheduleModel> itemList,filterList;
    private Context context;

    public ExamScheduleAdapter(Context context, List<examScheduleModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public examScheduleHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.exam_single_item, null);
        examScheduleHolder holder = new examScheduleHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(examScheduleHolder holder, final int position) {
        examScheduleHolder myHolder=holder;
        myHolder.examName.setText(itemList.get(position).getExamTitle());
        myHolder.examDetail.setText(itemList.get(position).getExamDetail());
        myHolder.examDate.setText(itemList.get(position).getExamDate());
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ExamDetailActivity.class);
                //intent.putExtra("ID",itemList.get(p0osition).getID());
                //intent.putExtra("image", Attributes.Name.get(position)); // put image data in Intent
                context.startActivity(intent); // start Intent

            }
        });

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public class examScheduleHolder extends RecyclerView.ViewHolder{

        public TextView examName, examDetail, examDate;
        public CardView marksCard;
        public ImageView Photo;

        public examScheduleHolder(View itemView) {
            super(itemView);
            examName = itemView.findViewById(R.id.exam_title);
            examDetail = itemView.findViewById(R.id.detail);
            examDate =itemView.findViewById(R.id.tf_marks_date);
            marksCard=itemView.findViewById(R.id.marks_carview);


        }



    }
}
