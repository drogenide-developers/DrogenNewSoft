package drogenidesoftwares.drogenideschool.schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import drogenidesoftwares.drogenideschool.R;

/**
 * Created by Vicky on 19-Mar-18.
 */

public class examSchedule extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.exam_schedule_fragment, container, false);

        return rootView;
    }
}