package drogenidesoftwares.drogenideschool.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;

import java.util.ArrayList;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.teachers.TeachersAdapter;

public class LibraryActivity extends AppCompatActivity {

    RecyclerView rView;
    LibraryAdapter rcAdapter;
    LibraryModel libraryModel;
    LinearLayoutManager linearLayoutManager;
    ArrayList libraryList=new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        rView = (RecyclerView) findViewById(R.id.rview_library);
        libraryModel=new LibraryModel();
        rcAdapter=new LibraryAdapter(getApplicationContext(),libraryList);
        getSupportActionBar().setTitle("Library");
        libraryModel.setBookName("Book Name: "+"Vedic Maths");
        libraryModel.setAuthor("Author : "+"Arun Sharma");
        libraryModel.setBookType("Book Type : "+"Normal");
        libraryModel.setDescription("Description : "+"Tricks to Solve Maths Problems");
        libraryModel.setStatus("Status :"+"Available");
        libraryList.add(libraryModel);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setAdapter(rcAdapter);
    }
}
