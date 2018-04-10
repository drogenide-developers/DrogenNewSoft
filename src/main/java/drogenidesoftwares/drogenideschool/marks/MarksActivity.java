package drogenidesoftwares.drogenideschool.marks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;

public class MarksActivity extends AppCompatActivity {

    RecyclerView rView;
    marksAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList<MarksModel> examList=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        rView = (RecyclerView) findViewById(R.id.recyclerview);

        MarksModel marksModel=new MarksModel();
        marksModel.setExam(" II Semester");
        marksModel.setDateOfExam("Date"+"12/02/2018");
        marksModel.setRemarks("Good");
        examList.add(marksModel);
        rcAdapter=new marksAdapter(this,examList);
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setAdapter(rcAdapter);
    }
}
