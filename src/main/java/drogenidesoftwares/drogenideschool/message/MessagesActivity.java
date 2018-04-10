package drogenidesoftwares.drogenideschool.message;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;

public class MessagesActivity extends AppCompatActivity {
    MessageListAdapter msgAdapter;
    RecyclerView relMessageList;
    ArrayList<MessageListModel> messageList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        relMessageList=findViewById(R.id.relative_messageList);
        relMessageList.setHasFixedSize(true);
        relMessageList.addItemDecoration(new ItemOffSetDecoration(1));

        MessageListModel m=new MessageListModel();
        m.setMessageId("1");
        m.setMsg("Hi");
        m.setMsgDate("01-03-2018");
        m.setMsgTime("10.00 AM");
        m.setSenderName("Sachin");

        MessageListModel m1=new MessageListModel();
        m1.setMessageId("2");
        m1.setMsg("Hi..");
        m1.setMsgDate("01-03-2018");
        m1.setMsgTime("10.01 AM");
        m1.setSenderName("Satish");

        MessageListModel m2=new MessageListModel();
        m2.setMessageId("3");
        m2.setMsg("I have issue in my mobile..");
        m2.setMsgDate("01-03-2018");
        m2.setMsgTime("10.03 AM");
        m2.setSenderName("Sachin");

        MessageListModel m3=new MessageListModel();
        m3.setMessageId("4");
        m3.setMsg("Okay We solve that, come tomorrow at shop...");
        m3.setMsgDate("04-04-2018");
        m3.setMsgTime("10.00 AM");
        m3.setSenderName("Satish");

        messageList.add(m);
        messageList.add(m1);
        messageList.add(m2);
        messageList.add(m3);

        msgAdapter=new MessageListAdapter(this,messageList);
        relMessageList.setLayoutManager(new LinearLayoutManager(this));
        relMessageList.setAdapter(msgAdapter);
    }
}
