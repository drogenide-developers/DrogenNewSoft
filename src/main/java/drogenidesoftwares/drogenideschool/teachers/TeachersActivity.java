package drogenidesoftwares.drogenideschool.teachers;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;

public class TeachersActivity extends AppCompatActivity {

    RecyclerView rView;
    TeachersAdapter rcAdapter;
    private SearchView mSearchView;
    private MenuItem searchMenuItem;
    LinearLayoutManager linearLayoutManager;
    ArrayList teachersList=new ArrayList();
    TeachersModel teachersModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);
        rView = (RecyclerView) findViewById(R.id.teachers_rv);
        rcAdapter=new TeachersAdapter(getApplicationContext(),teachersList);
        getSupportActionBar().setTitle("Messages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        teachersModel=new TeachersModel();
        teachersModel.setTeacherName("Teachers Name : "+"Drogen");
        teachersModel.setSubjectName("Subject : "+"Mathematics");
        teachersList.add(teachersModel);

        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rView.setAdapter(rcAdapter);

    }
    SearchView.OnQueryTextListener listener = new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            // newText is text entered by user to SearchView
            rcAdapter.getFilter().filter(newText);
            return false;
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        searchMenuItem = menu.findItem(R.id.action_search);
        mSearchView = (SearchView) searchMenuItem.getActionView();
        mSearchView.setOnQueryTextListener(listener);
        mSearchView.setQueryHint("Search Business type here...");
        int searchPlateId = mSearchView.getContext().getResources().getIdentifier("android:id/search_plate", null, null);
        View searchPlate = mSearchView.findViewById(searchPlateId);
        if (searchPlate!=null) {
            searchPlate.setBackgroundColor(Color.WHITE);
            int searchTextId = searchPlate.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
            TextView searchText = (TextView) searchPlate.findViewById(searchTextId);
            if (searchText!=null) {
                searchText.setTextColor(Color.BLACK);
                searchText.setHintTextColor(Color.GRAY);
            }
        }
        return true;
    }
}
