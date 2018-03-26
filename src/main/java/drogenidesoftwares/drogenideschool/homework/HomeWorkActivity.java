package drogenidesoftwares.drogenideschool.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.teachers.TeachersAdapter;

public class HomeWorkActivity extends AppCompatActivity {

    RecyclerView rView;
    HomeworkAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work);

        rView = (RecyclerView) findViewById(R.id.recycler_home_work);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(linearLayoutManager);
        rView.setAdapter(rcAdapter);
    }
}
