package drogenidesoftwares.drogenideschool.schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;

/**
 * Created by Vicky on 19-Mar-18.
 */

public class ExamSchedule extends Fragment {
    RecyclerView rView;
    ExamScheduleAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList examScheduleList=new ArrayList();
    examScheduleModel examSchedulemodel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.exam_schedule_fragment, container, false);
        rView = (RecyclerView) rootView.findViewById(R.id.exam_recycler);
        rcAdapter=new ExamScheduleAdapter(getContext(),examScheduleList);
        examSchedulemodel=new examScheduleModel();
        examSchedulemodel.setExamDate("Date"+"12/02/2018");
        examSchedulemodel.setExamTitle("II Semester");
        examSchedulemodel.setExamDetail("Detail.....");
        examScheduleList.add(examSchedulemodel);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(new LinearLayoutManager(getContext()));
        rView.setAdapter(rcAdapter);

        return rootView;
    }
}
