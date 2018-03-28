package drogenidesoftwares.drogenideschool.noticeboard;

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
import java.util.List;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;

public class NoticeBoard extends AppCompatActivity {

    RecyclerView rView;
    NoticeBoardAdapter rcAdapter;
    private SearchView mSearchView;
    private MenuItem searchMenuItem;
    LinearLayoutManager linearLayoutManager;
    ArrayList<NoticeBoardModel> itemList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_board);
        rView = (RecyclerView) findViewById(R.id.recycler_view);
        /*rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
*/
        NoticeBoardModel boardModel=new NoticeBoardModel();
        boardModel.setID("1");
        boardModel.setNoticeTitle("Exam Notice");
        boardModel.setNoticeDate("01/01/2018");
        boardModel.setNoticeDescription("Hi all, New exam notification all MCA 1st year students notifiy that annual exam will be starts on next of december 1st. Please get your hall tickets, submit your project/practical submission with respect your teacher. Also check your attendece and get remarks from your class teacher, last date of submission is 30th Nov.");

        NoticeBoardModel boardModel1=new NoticeBoardModel();
        boardModel1.setID("2");
        boardModel1.setNoticeTitle("Holiday");
        boardModel1.setNoticeDate("02/01/2018");
        boardModel1.setNoticeDescription("Hi all, there is holiday on 2nd Jan 2018, an event is schedule on this day. Please note this.");

        itemList.add(boardModel);
        itemList.add(boardModel1);
        rcAdapter=new NoticeBoardAdapter(this,itemList);
        rView.setLayoutManager(new LinearLayoutManager(this));
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
        mSearchView.setQueryHint("Search Notification here...");
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
