package drogenidesoftwares.drogenideschool.library;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import drogenidesoftwares.drogenideschool.R;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.BookHolder>{

    List<LibraryModel> itemList,filterList;
    private Context context;

    public LibraryAdapter(Context context, List<LibraryModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_book, null);
        BookHolder holder = new BookHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(BookHolder holder, final int position) {
        BookHolder myHolder=holder;
        myHolder.bookName.setText(itemList.get(position).getBookName());
        myHolder.bookType.setText(itemList.get(position).getBookType());
        myHolder.bookStatus.setText(itemList.get(position).getStatus());
        myHolder.bookAuthor.setText(itemList.get(position).getAuthor());
        myHolder.bookDescription.setText(itemList.get(position).getDescription());
        myHolder.bookDownload.setText("Download");
        myHolder.bookDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"No file to Download",Toast.LENGTH_LONG).show();
            }
        });
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

    public class BookHolder extends RecyclerView.ViewHolder{

        public TextView bookName, bookType, bookAuthor,bookStatus,bookDescription,bookDownload;
        public ImageView Photo;

        public BookHolder(View itemView) {
            super(itemView);
            bookName = itemView.findViewById(R.id.book_name);
            bookType = itemView.findViewById(R.id.book_type);
            bookAuthor =itemView.findViewById(R.id.book_author);
            bookStatus=itemView.findViewById(R.id.book_status);
            bookDescription=itemView.findViewById(R.id.book_description);
            bookDownload=itemView.findViewById(R.id.book_download);
        }



    }








}
