package drogenidesoftwares.drogenideschool;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import drogenidesoftwares.drogenideschool.academic.AcademicsActivity;
import drogenidesoftwares.drogenideschool.attendance.AttendanceActivity;
import drogenidesoftwares.drogenideschool.behavior.BehaviorActivity;
import drogenidesoftwares.drogenideschool.helper.FontManager;
import drogenidesoftwares.drogenideschool.library.LibraryActivity;
import drogenidesoftwares.drogenideschool.marks.MarksActivity;
import drogenidesoftwares.drogenideschool.message.ChatActivity;
import drogenidesoftwares.drogenideschool.message.MessagesActivity;
import drogenidesoftwares.drogenideschool.schedule.ScheduleActivity;
import drogenidesoftwares.drogenideschool.teachers.TeachersActivity;
import drogenidesoftwares.drogenideschool.noticeboard.NoticeBoard;
import drogenidesoftwares.drogenideschool.updateinfo.UpdateInfo;
import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DuoDrawerToggle toggle;
    DuoDrawerLayout drawer;
    Toolbar toolbar;
    RelativeLayout updateinfo;
    RelativeLayout rlmessages,rlNotice,rlTeachers,rlSchedule,rlAttendance,rlMarks,rlPayement,rlLibrary,rlBehavior,rlAcademics;
    TextView tv,ico_msg,ico_teacher,ico_schedule,ico_attendence,ico_liberary,ico_marks,ico_academic,ico_behavior,ico_payment,ico_notice;
    private boolean isOpen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        updateinfo=findViewById(R.id.rl_update_info);
        rlmessages=findViewById(R.id.rl_messages);
        rlNotice=findViewById(R.id.rl_notice);
        rlTeachers=findViewById(R.id.rl_teachers);
        rlSchedule=findViewById(R.id.rl_shedule);
        rlAttendance=findViewById(R.id.rl_attendance);
        rlMarks=findViewById(R.id.rl_marks);
        rlLibrary=findViewById(R.id.rl_library);
        rlPayement=findViewById(R.id.rl_payment);
        rlBehavior=findViewById(R.id.rl_behaviour);
        rlAcademics=findViewById(R.id.rl_academics);

        ico_academic=findViewById(R.id.txtIconAcademic);
        ico_attendence=findViewById(R.id.txtIconAttendence);
        ico_behavior=findViewById(R.id.txtIconBehaviour);
        ico_liberary=findViewById(R.id.txtIconLiberary);
        ico_marks=findViewById(R.id.txtIconMarks);
        ico_msg=findViewById(R.id.txtIconMessage);
        ico_notice=findViewById(R.id.txtIconNotice);
        ico_payment=findViewById(R.id.txtIconPayment);
        ico_schedule=findViewById(R.id.txtIconSchedule);
        ico_teacher=findViewById(R.id.txtIconTeachers);

        ico_teacher.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_schedule.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_payment.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_notice.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_msg.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_marks.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_liberary.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_behavior.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_attendence.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));
        ico_academic.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));

        drawer = (DuoDrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new DuoDrawerToggle(this, drawer, toolbar,   R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
         tv=findViewById(R.id.tv_update_info);
         rlNotice.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(MainActivity.this, NoticeBoard.class);
                 startActivity(intent);
             }
         });

         rlmessages.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), MessagesActivity.class);
                 startActivity(intent);
             }
         });
         updateinfo.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), UpdateInfo.class);
                 startActivity(intent);
             }
         });
         rlTeachers.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), TeachersActivity.class);
                 startActivity(intent);
             }
         });
         rlSchedule.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), ScheduleActivity.class);
                 startActivity(intent);
             }
         });
         rlAttendance.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), AttendanceActivity.class);
                 startActivity(intent);
             }
         });
         rlBehavior.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), BehaviorActivity.class);
                 startActivity(intent);
             }
         });
         rlMarks.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), MarksActivity.class);
                 startActivity(intent);
             }
         });
         rlLibrary.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), LibraryActivity.class);
                 startActivity(intent);
             }
         });
         rlPayement.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });
         rlAcademics.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), AcademicsActivity.class);
                 startActivity(intent);
             }
         });

    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        toggle.onConfigurationChanged(newConfig);
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(Gravity.LEFT); //OPEN Nav Drawer!
        } else {
            finish();
        }

    }

    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("");

        toolbar.findViewById(R.id.toolbar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawer.openDrawer();


            }
        });

    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tv_update_info) {


            // Handle the camera action
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
