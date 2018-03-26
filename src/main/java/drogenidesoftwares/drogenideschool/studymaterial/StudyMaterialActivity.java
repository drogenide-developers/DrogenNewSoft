package drogenidesoftwares.drogenideschool.studymaterial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.homework.HomeworkAdapter;

public class StudyMaterialActivity extends AppCompatActivity {

    RecyclerView rView;
    StudyMaterialAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);

        rView = (RecyclerView) findViewById(R.id.study_material_recycler);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(linearLayoutManager);
        rView.setAdapter(rcAdapter);
    }
}
