package drogenidesoftwares.drogenideschool.marks;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import drogenidesoftwares.drogenideschool.R;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class marksAdapter extends RecyclerView.Adapter<marksAdapter.marksHolder>{

    ArrayList<MarksModel> itemList,filterList;
    Context context;

    public marksAdapter(Context context, ArrayList<MarksModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;
    }

    @Override
    public marksHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.marks_single_item, null);
        marksHolder holder = new marksHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(marksHolder holder, final int position) {
        marksHolder myHolder=holder;
        myHolder.examName.setText("Exam"+itemList.get(position).getExam());
        myHolder.remark.setText(itemList.get(position).getRemarks());
        myHolder.examDate.setText(itemList.get(position).getDateOfExam());
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MarksDetailActivity.class);
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

    public class marksHolder extends RecyclerView.ViewHolder{

        public TextView examName, remark, examDate;
        public ImageView Photo;

        public marksHolder(View itemView) {
            super(itemView);
            examName = itemView.findViewById(R.id.adapter_exam_title);
            remark = itemView.findViewById(R.id.adapter_exam_remark);
            examDate =itemView.findViewById(R.id.adapter_exam_date);
        }
    }
}
