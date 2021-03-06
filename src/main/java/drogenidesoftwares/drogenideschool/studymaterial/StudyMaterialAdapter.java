package drogenidesoftwares.drogenideschool.studymaterial;

import android.content.Context;
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
import drogenidesoftwares.drogenideschool.teachers.TeachersFilter;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class StudyMaterialAdapter extends RecyclerView.Adapter<StudyMaterialAdapter.StudyMaterialHolder> {

    ArrayList<StudyMaterialModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public StudyMaterialAdapter(Context context, ArrayList<StudyMaterialModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public StudyMaterialHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_study_material, null);
        StudyMaterialHolder holder = new StudyMaterialHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(StudyMaterialHolder holder, final int position) {
        StudyMaterialHolder myHolder=holder;
        myHolder.studyMaterialTitle.setText(itemList.get(position).getStudyMaterialTitle());
        myHolder.studyMaterialDate.setText(itemList.get(position).getStudyMaterialDate());
        myHolder.studyMaterialDescription.setText(itemList.get(position).getStudyMaterialDscription());
        myHolder.studyMaterialSubject.setText(itemList.get(position).getStudyMaterialSubject());
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
        myHolder.download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Book not available yet..!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }



    public class StudyMaterialHolder extends RecyclerView.ViewHolder{

        public TextView studyMaterialTitle, studyMaterialSubject,studyMaterialDescription,studyMaterialDate,download;
        public ImageView Photo;

        public StudyMaterialHolder(View itemView) {
            super(itemView);

            studyMaterialTitle = itemView.findViewById(R.id.study_material_title);
            studyMaterialSubject =itemView.findViewById(R.id.study_material_subject);
            studyMaterialDescription=itemView.findViewById(R.id.study_material_description);
            studyMaterialDate=itemView.findViewById(R.id.study_material_date);
            download=itemView.findViewById(R.id.study_material_download);
        }



    }








}
