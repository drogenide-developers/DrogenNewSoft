package drogenidesoftwares.drogenideschool.message;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.homework.HomeworkDetailsActivity;
import drogenidesoftwares.drogenideschool.homework.HomeworkModel;
import drogenidesoftwares.drogenideschool.teachers.TeachersFilter;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class ChatThreadListAdapter extends RecyclerView.Adapter<ChatThreadListAdapter.HomeWorkHolder> {

    ArrayList<ThreadListModel> threadList;
    private Context context;

    public ChatThreadListAdapter(Context context, ArrayList<ThreadListModel> itemList) {
        this.context = context;
        this.threadList= itemList;
    }

    @Override
    public HomeWorkHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.threadlist_adapter, null);
        HomeWorkHolder holder = new HomeWorkHolder(layoutView);
        return holder;
    }
    @Override
    public void onBindViewHolder(HomeWorkHolder holder, final int position) {
        HomeWorkHolder myHolder=holder;
        myHolder.threadtitle.setText(threadList.get(position).getThreadName());
        myHolder.lastsender.setText(threadList.get(position).threadLastSenderName+": "+threadList.get(position).getThreadLastSenderMsg());
        myHolder.time.setText(threadList.get(position).getLastSendMsgtime());

        //myHolder.imageview.setImageBitmap();

        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context,MessagesActivity.class);
                context.startActivity(i);
            }
        });
    }
    @Override
    public int getItemCount() {
        return this.threadList.size();
    }

    public class HomeWorkHolder extends RecyclerView.ViewHolder{

        TextView threadtitle,lastsender,time;
        CircleImageView imageview;
        public HomeWorkHolder(View itemView) {
            super(itemView);
            threadtitle=itemView.findViewById(R.id.txt_thread_title);
            lastsender=itemView.findViewById(R.id.txt_thread_last_sendername);
            time=itemView.findViewById(R.id.txt_last_msg_time);
            imageview=itemView.findViewById(R.id.profile_image_thread);
        }
    }
}
