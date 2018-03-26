package drogenidesoftwares.drogenideschool.attendance;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.teachers.TeachersFilter;
import drogenidesoftwares.drogenideschool.teachers.TeachersModel;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.AttendanceHolder> {

    List<TeachersModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public AttendanceAdapter(Context context, List<TeachersModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public AttendanceHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_teacher, null);
        AttendanceHolder holder = new AttendanceHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(AttendanceHolder holder, final int position) {
        AttendanceHolder myHolder=holder;
        myHolder.teacherName.setText(itemList.get(position).getTeacherName());
        myHolder.subjectName.setText(itemList.get(position).getSubjectName());
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


    public class AttendanceHolder extends RecyclerView.ViewHolder{

        public TextView teacherName,subjectName,sendMessage;
        public ImageView Photo;

        public AttendanceHolder(View itemView) {
            super(itemView);
            teacherName = itemView.findViewById(R.id.teacher_name);
            subjectName = itemView.findViewById(R.id.subject_name);
            sendMessage=itemView.findViewById(R.id.send_msg_t);
        }



    }








}
