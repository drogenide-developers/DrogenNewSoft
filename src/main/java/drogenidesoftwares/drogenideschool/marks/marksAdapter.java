package drogenidesoftwares.drogenideschool.marks;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.library.MarksModel;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class marksAdapter extends RecyclerView.Adapter<marksAdapter.marksHolder>{

    List<MarksModel> itemList,filterList;
    private Context context;

    public marksAdapter(Context context, List<MarksModel> itemList) {
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
        myHolder.paperName.setText(itemList.get(position).getBookName());
        myHolder.sememsterName.setText(itemList.get(position).getBookType());
        myHolder.marksObtain.setText(itemList.get(position).getAuthor());
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

    public class marksHolder extends RecyclerView.ViewHolder{

        public TextView paperName, sememsterName, marksObtain;
        public ImageView Photo;

        public marksHolder(View itemView) {
            super(itemView);
            paperName = itemView.findViewById(R.id.test_name);
            sememsterName = itemView.findViewById(R.id.semester);
            marksObtain =itemView.findViewById(R.id.marks);

        }



    }








}
