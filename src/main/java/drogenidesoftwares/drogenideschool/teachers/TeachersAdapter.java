package drogenidesoftwares.drogenideschool.teachers;

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

public class TeachersAdapter extends RecyclerView.Adapter<TeachersAdapter.TeachersHolder>implements Filterable {

    List<TeachersModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public TeachersAdapter(Context context, List<TeachersModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public TeachersHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_teacher, null);
        TeachersHolder holder = new TeachersHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(TeachersHolder holder, final int position) {
        TeachersHolder myHolder=holder;
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

    @Override
    public Filter getFilter() {
        if(filter==null)
        {
            filter=new TeachersFilter((ArrayList<TeachersModel>) filterList,this);
        }

        return filter;
    }

    public class TeachersHolder extends RecyclerView.ViewHolder{

        public TextView teacherName,subjectName,sendMessage;
        public ImageView Photo;

        public TeachersHolder(View itemView) {
            super(itemView);
            teacherName = itemView.findViewById(R.id.teacher_name);
            subjectName = itemView.findViewById(R.id.subject_name);
            sendMessage=itemView.findViewById(R.id.send_msg_t);
        }



    }








}
