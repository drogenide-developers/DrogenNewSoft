package drogenidesoftwares.drogenideschool.syllabus;

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

/**
 * Created by Vicky on 16-Dec-17.
 */

public class SyllabusAdapter extends RecyclerView.Adapter<SyllabusAdapter.SyllabusHolder> {

    List<SyllabusModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public SyllabusAdapter(Context context, List<SyllabusModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public SyllabusHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_syllabus, null);
        SyllabusHolder holder = new SyllabusHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(SyllabusHolder holder, final int position) {
        SyllabusHolder myHolder=holder;
        myHolder.SyllabusTitle.setText(itemList.get(position).getSyllabusTitle());
        myHolder.syllabusType.setText(itemList.get(position).getSyllabusType());
        myHolder.syllabusSubject.setText(itemList.get(position).getSyllabusSubject());
        myHolder.syllabusUploadedBy.setText(itemList.get(position).getSyllabusUploadedBy());
        myHolder.syllabusDate.setText(itemList.get(position).getSyllabusDate());
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



    public class SyllabusHolder extends RecyclerView.ViewHolder{

        public TextView SyllabusTitle, syllabusSubject, syllabusType, syllabusUploadedBy,syllabusDate,SyllabusDownload;
        public ImageView Photo;

        public SyllabusHolder(View itemView) {
            super(itemView);
            SyllabusTitle = itemView.findViewById(R.id.syllabus_title);
            syllabusSubject = itemView.findViewById(R.id.syllabus_subject);
            syllabusType =itemView.findViewById(R.id.syllabus_type);
            syllabusUploadedBy =itemView.findViewById(R.id.syllabus_uploaded_by);
            syllabusDate=itemView.findViewById(R.id.syllabus_date);
            SyllabusDownload=itemView.findViewById(R.id.syllabus_download);
        }



    }








}
