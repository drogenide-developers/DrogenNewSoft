package drogenidesoftwares.drogenideschool.studymaterial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.homework.HomeworkAdapter;

public class StudyMaterialActivity extends AppCompatActivity {

    RecyclerView rView;
    StudyMaterialAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList<StudyMaterialModel> booklist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);

        rView = (RecyclerView) findViewById(R.id.study_material_recycler);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));

        getSupportActionBar().setTitle("Study Material");
        StudyMaterialModel studymodel=new StudyMaterialModel();
        studymodel.setStudyMaterialDate("1/4/2018");
        studymodel.setStudyMaterialDscription("Complete maths problems with solution.");
        studymodel.setStudyMaterialSubject("Maths");
        studymodel.setStudyMaterialTitle("Maths Magic");
        booklist.add(studymodel);
        rcAdapter=new StudyMaterialAdapter(this,booklist);
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setAdapter(rcAdapter);
    }
}
