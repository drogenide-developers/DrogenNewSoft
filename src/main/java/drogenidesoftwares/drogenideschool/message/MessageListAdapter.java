package drogenidesoftwares.drogenideschool.message;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import de.hdodenhof.circleimageview.CircleImageView;
import drogenidesoftwares.drogenideschool.R;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.MessageHolder> {

    ArrayList<MessageListModel> messageList;
    private Context context;

    public MessageListAdapter(Context context, ArrayList<MessageListModel> itemList) {
        this.context = context;
        this.messageList= itemList;
    }

    @Override
    public MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_msg_adapter, null);
        MessageHolder holder = new MessageHolder(layoutView);
        return holder;
    }
    @Override
    public void onBindViewHolder(MessageHolder holder, final int position) {
        MessageHolder myHolder=holder;
        // This content is for displaying message date current or before
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String todayDate = df.format(c);
        if (position>0) {
            if (messageList.get(position).getMsgDate().equals(messageList.get(position-1).getMsgDate()))
            {
                myHolder.messageDate.setVisibility(View.GONE);
            }
            else
            {
                if (todayDate.equals(messageList.get(position).getMsgDate()))
                {
                    myHolder.messageDate.setText("Today");
                }
                else
                {
                    myHolder.messageDate.setText(messageList.get(position).getMsgDate());
                }
            }
        }
        else
        {
            if (todayDate.equals(messageList.get(position).getMsgDate()))
            {
                myHolder.messageDate.setText("Today");
            }
            else
            {
                myHolder.messageDate.setText(messageList.get(position).getMsgDate());
            }
        }

        // to change message orientation sender and receiver
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity= Gravity.RIGHT;
        params.setMargins(0, 0, 20, 0);
        String senderName="Satish"; // change this to your user name
        if (messageList.get(position).getSenderName().equals(senderName))
        {
            myHolder.linearMsgOuter.setLayoutParams(params);
        }
        myHolder.msgText.setText(messageList.get(position).getMsg());
        myHolder.msgTime.setText(messageList.get(position).getMsgTime());
    }
    @Override
    public int getItemCount() {
        return this.messageList.size();
    }

    public class MessageHolder extends RecyclerView.ViewHolder{

        TextView messageDate,msgText,msgTime;
        LinearLayout linearMsgOuter;

        public MessageHolder(View itemView) {
            super(itemView);
            messageDate=itemView.findViewById(R.id.message_date);
            msgText=itemView.findViewById(R.id.txt_msg);
            msgTime=itemView.findViewById(R.id.txt_msgTime);
            linearMsgOuter=itemView.findViewById(R.id.linear_msg_outer);

        }
    }
}
