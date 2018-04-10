package drogenidesoftwares.drogenideschool.behavior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;

public class BehaviorActivity extends AppCompatActivity {

    RecyclerView rView;
    BehaviorAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList behaviorList=new ArrayList();
    BehaviorModel behaviorModel,behaviorModel1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);
        rView = (RecyclerView) findViewById(R.id.behavior_recycler);
        getSupportActionBar().setTitle("Stars");
        behaviorModel=new BehaviorModel();
        behaviorModel.setBehaviorSubject("Subject :"+" Mathematics");
        behaviorModel.setSubjectRating("4.5");
        behaviorModel.setSubjectRemark("Very good in math problem solving");
        behaviorList.add(behaviorModel);

        behaviorModel1=new BehaviorModel();
        behaviorModel1.setBehaviorSubject("Subject :"+" English");
        behaviorModel1.setSubjectRating("4");
        behaviorModel1.setSubjectRemark("Very good in english grammer, words.");
        behaviorList.add(behaviorModel1);

        rcAdapter=new BehaviorAdapter(getApplicationContext(),behaviorList);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rView.setAdapter(rcAdapter);
    }
}
