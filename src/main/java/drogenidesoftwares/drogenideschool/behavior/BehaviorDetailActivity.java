package drogenidesoftwares.drogenideschool.behavior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import drogenidesoftwares.drogenideschool.R;

public class BehaviorDetailActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView tvRemark,tvSubject,tvRating;
    RatingBar ratingBar;
    Spinner spinerSubject;
    ArrayList<BehaviorModel> behaviorList=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior_detail);


        tvRemark=findViewById(R.id.tv_remark);
        tvSubject=findViewById(R.id.behavior_subject_two);
        tvRating=findViewById(R.id.tv_behavior_rating);
        ratingBar=findViewById(R.id.behavior_rating_bar);
        spinerSubject=findViewById(R.id.spiner_stars_subject);
        AddData();
        spinerSubject.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        if (behaviorList.size()>0)
        {
            for (int i=0;i<behaviorList.size();i++)
            {
                categories.add(behaviorList.get(i).getBehaviorSubject());
            }
        }
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinerSubject.setAdapter(dataAdapter);


    }

    public void AddData()
    {

        BehaviorModel behaviorModel=new BehaviorModel();
        behaviorModel.setBehaviorSubject("Mathematics");
        behaviorModel.setSubjectRating("4.5");
        behaviorModel.setSubjectRemark("Very good in math problem solving");
        behaviorList.add(behaviorModel);

        BehaviorModel behaviorModel1=new BehaviorModel();
        behaviorModel1.setBehaviorSubject("English");
        behaviorModel1.setSubjectRating("4");
        behaviorModel1.setSubjectRemark("Good in english grammer, words.");

        BehaviorModel behaviorModel2=new BehaviorModel();
        behaviorModel2.setBehaviorSubject("Marathi");
        behaviorModel2.setSubjectRating("5");
        behaviorModel2.setSubjectRemark("Excellent in Marathi");
        behaviorList.add(behaviorModel2);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        tvSubject.setText(behaviorList.get(i).getBehaviorSubject());
        tvRemark.setText(behaviorList.get(i).getSubjectRemark());
        tvRating.setText(behaviorList.get(i).getSubjectRating());
        Float ratingFloat=Float.parseFloat(behaviorList.get(i).getSubjectRating());
        ratingBar.setRating(ratingFloat);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
