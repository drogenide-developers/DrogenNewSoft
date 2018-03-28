package drogenidesoftwares.drogenideschool.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.teachers.TeachersAdapter;

public class HomeWorkActivity extends AppCompatActivity {

    RecyclerView rView;
    HomeworkAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList<HomeworkModel> homeworklist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work);

        rView = (RecyclerView) findViewById(R.id.recycler_home_work);
       /* rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));*/
       HomeworkModel hm=new HomeworkModel();
       hm.setHomeWorkDate("1/1/2018");
       hm.setHomeWorkDescription("Maths homework for today");
       hm.setHomeworkSubject("Maths");
       hm.setHomeWorkTitle("Problem Solving");
       homeworklist.add(hm);
       rcAdapter=new HomeworkAdapter(this,homeworklist);

        rView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rView.setAdapter(rcAdapter);
    }
}
