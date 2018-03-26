package drogenidesoftwares.drogenideschool.homework;

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

public class HomeworkAdapter extends RecyclerView.Adapter<HomeworkAdapter.HomeWorkHolder> {

    List<HomeworkModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public HomeworkAdapter(Context context, List<HomeworkModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public HomeWorkHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_homework, null);
        HomeWorkHolder holder = new HomeWorkHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(HomeWorkHolder holder, final int position) {
        HomeWorkHolder myHolder=holder;
        myHolder.homeWorkTitle.setText(itemList.get(position).getHomeWorkTitle());
        myHolder.homeWorkDescription.setText(itemList.get(position).getHomeWorkDescription());
        myHolder.homeWorkDate.setText(itemList.get(position).getHomeWorkDate());
        myHolder.homeWorkSubject.setText(itemList.get(position).getHomeworkSubject());
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



    public class HomeWorkHolder extends RecyclerView.ViewHolder{

        public TextView homeWorkTitle, homeWorkDescription, homeWorkSubject,homeWorkDate;
        public ImageView Photo;

        public HomeWorkHolder(View itemView) {
            super(itemView);
            homeWorkTitle = itemView.findViewById(R.id.tf_homework_title);
            homeWorkDescription = itemView.findViewById(R.id.homework_description);
            homeWorkSubject =itemView.findViewById(R.id.subject_homework);
            homeWorkDate=itemView.findViewById(R.id.tf_delivery_date);
        }



    }








}
