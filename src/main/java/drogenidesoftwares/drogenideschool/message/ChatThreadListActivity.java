package drogenidesoftwares.drogenideschool.message;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.homework.HomeworkAdapter;
import drogenidesoftwares.drogenideschool.homework.HomeworkModel;

/**
 * Created by pc1 on 3/28/2018.
 */

public class ChatThreadListActivity extends AppCompatActivity {

    RecyclerView rView;
    ChatThreadListAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList<ThreadListModel> threadlist=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thread_list_activity);

        rView = (RecyclerView) findViewById(R.id.recycler_threadList);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));

        ThreadListModel m=new ThreadListModel();
        m.setLastSendMsgtime("10:55 PM");
        m.setThreadLastSenderMsg("Hi");
        m.setThreadLastSenderName("Satish");
        m.setThreadName("User");

        ThreadListModel m1=new ThreadListModel();
        m1.setLastSendMsgtime("10:57 PM");
        m1.setThreadLastSenderMsg("Good Morning");
        m1.setThreadLastSenderName("Sachin");
        m1.setThreadName("Office");

        threadlist.add(m);
        threadlist.add(m1);
        rcAdapter=new ChatThreadListAdapter(this,threadlist);
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setAdapter(rcAdapter);

    }
}
