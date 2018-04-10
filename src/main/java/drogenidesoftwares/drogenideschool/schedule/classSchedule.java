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

public class classSchedule extends Fragment {
    RecyclerView rView;
    ClassScheduleAdapter classScheduleAdapter;
    ArrayList classScheduleList=new ArrayList();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.class_schedule_fragment, container, false);
        rView=rootView.findViewById(R.id.class_schedule_recycler);

        ClassScheduleModel classScheduleModel=new ClassScheduleModel();
        classScheduleModel.setDay("Monday");
        ClassScheduleModel classScheduleModel1=new ClassScheduleModel();
        classScheduleModel1.setDay("Tuesday");
        ClassScheduleModel classScheduleModel2=new ClassScheduleModel();
        classScheduleModel2.setDay("Wednesday");
        ClassScheduleModel classScheduleModel3=new ClassScheduleModel();
        classScheduleModel3.setDay("Thursday");
        ClassScheduleModel classScheduleModel4=new ClassScheduleModel();
        classScheduleModel4.setDay("Friday");
        ClassScheduleModel classScheduleModel5=new ClassScheduleModel();
        classScheduleModel5.setDay("Saturday");
        classScheduleList.add(classScheduleModel);
        classScheduleList.add(classScheduleModel1);
        classScheduleList.add(classScheduleModel2);
        classScheduleList.add(classScheduleModel3);
        classScheduleList.add(classScheduleModel4);
        classScheduleList.add(classScheduleModel5);
        classScheduleAdapter=new ClassScheduleAdapter(getContext(),classScheduleList);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(new LinearLayoutManager(getContext()));
        rView.setAdapter(classScheduleAdapter);

        return rootView;
    }
}
