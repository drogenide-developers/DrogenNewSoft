package drogenidesoftwares.drogenideschool.behavior;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

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
        myHolder.behaviorStudentName.setText(itemList.get(position).getBehaviorStudentName());
        myHolder.behaviorClass.setText(itemList.get(position).getBehaviorClass());
        myHolder.behaviorSection.setText(itemList.get(position).getBehaviorSection());
        myHolder.behaviorCreatedBy.setText(itemList.get(position).getBehaviorCreatedBy());
        myHolder.behaviorDate.setText(itemList.get(position).getBehaviorDate());
        myHolder.behaviorReason.setText(itemList.get(position).getBehaviorReason());
        myHolder.behaviorOption.setText(itemList.get(position).getBehaviorOption());
        myHolder.behaviorPriority.setText(itemList.get(position).getBehaviorPriority());

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



    public class BehaviorHolder extends RecyclerView.ViewHolder{

        public TextView behaviorDate,behaviorClass,behaviorSection,behaviorReason,behaviorStudentName,behaviorPriority,behaviorOption,behaviorCreatedBy;
        public ImageView Photo;

        public BehaviorHolder(View itemView) {
            super(itemView);
            behaviorStudentName = itemView.findViewById(R.id.student_name_bahavior);
            behaviorClass = itemView.findViewById(R.id.behaviour_student_class);
            behaviorSection =itemView.findViewById(R.id.behavior_section);
            behaviorReason=itemView.findViewById(R.id.behavior_reason);
            behaviorPriority=itemView.findViewById(R.id.behavior_priority);
            behaviorDate=itemView.findViewById(R.id.behavior_date);
            behaviorOption=itemView.findViewById(R.id.behavior_option);
            behaviorCreatedBy=itemView.findViewById(R.id.created_by);
        }



    }








}
