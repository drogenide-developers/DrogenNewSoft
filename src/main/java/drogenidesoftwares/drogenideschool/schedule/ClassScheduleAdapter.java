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

public class ClassScheduleAdapter extends RecyclerView.Adapter<ClassScheduleAdapter.ClassScheduleHolder> {
    List<ClassScheduleModel> itemList,filterList;
    private Context context;

    public ClassScheduleAdapter(Context context, List<ClassScheduleModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public ClassScheduleHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.class_schedule_single, null);
        ClassScheduleHolder holder = new ClassScheduleHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ClassScheduleHolder holder, final int position) {
        ClassScheduleHolder myHolder=holder;
        myHolder.classDay.setText(itemList.get(position).getDay());

        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ClassDetailActivity.class);
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

    public class ClassScheduleHolder extends RecyclerView.ViewHolder{

        public TextView classDay;


        public ClassScheduleHolder(View itemView) {
            super(itemView);
            classDay = itemView.findViewById(R.id.tv_class_schedule);


        }



    }
}
