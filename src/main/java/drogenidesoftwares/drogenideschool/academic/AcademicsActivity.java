package drogenidesoftwares.drogenideschool.academic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.homework.HomeWorkActivity;
import drogenidesoftwares.drogenideschool.onlineexam.OnlineExamActivity;
import drogenidesoftwares.drogenideschool.studymaterial.StudyMaterialActivity;

public class AcademicsActivity extends AppCompatActivity {

    RelativeLayout rlHomework,rlSyllabus,rlStudyMaterial,rlOnlineExam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);
        rlHomework=findViewById(R.id.rl_homework);
        rlSyllabus=findViewById(R.id.rl_syllabus);
        rlStudyMaterial=findViewById(R.id.rl_studymaterial);
        rlOnlineExam=findViewById(R.id.rl_online_exam);

        rlHomework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), HomeWorkActivity.class);
                startActivity(intent);
            }
        });
        rlOnlineExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), OnlineExamActivity.class);
                startActivity(intent);
            }
        });
        rlStudyMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), StudyMaterialActivity.class);
                startActivity(intent);
            }
        });
        rlSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), StudyMaterialActivity.class);
                startActivity(intent);
            }
        });
    }
}
