package drogenidesoftwares.drogenideschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import drogenidesoftwares.drogenideschool.academic.AcademicsActivity;
import drogenidesoftwares.drogenideschool.attendance.AttendanceActivity;
import drogenidesoftwares.drogenideschool.behavior.BehaviorActivity;
import drogenidesoftwares.drogenideschool.behavior.BehaviorDetailActivity;
import drogenidesoftwares.drogenideschool.helper.FontManager;
import drogenidesoftwares.drogenideschool.homework.HomeWorkActivity;
import drogenidesoftwares.drogenideschool.library.LibraryActivity;
import drogenidesoftwares.drogenideschool.marks.MarksActivity;
import drogenidesoftwares.drogenideschool.message.ChatThreadListActivity;
import drogenidesoftwares.drogenideschool.noticeboard.NoticeBoard;
import drogenidesoftwares.drogenideschool.payment.PaymentActivity;
import drogenidesoftwares.drogenideschool.schedule.ScheduleActivity;
import drogenidesoftwares.drogenideschool.teachers.TeachersActivity;
import drogenidesoftwares.drogenideschool.tracking.TrackingActivity;
import drogenidesoftwares.drogenideschool.updateinfo.UpdateInfo;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;

public class DrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RelativeLayout rlmessages,rltracking,rlNotice,rlTeachers,rlSchedule,rlAttendance,rlMarks,rlPayement,rlLibrary,rlBehavior,rlAcademics;
    TextView tv,ico_track,ico_msg,ico_teacher,ico_schedule,ico_attendence,ico_liberary,ico_marks,ico_academic,ico_behavior,ico_payment,ico_notice;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        drawer=findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar,   R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        rlmessages=findViewById(R.id.rl_messages);
        rlNotice=findViewById(R.id.rl_notice);
        rltracking=findViewById(R.id.rl_tracking);
        rlTeachers=findViewById(R.id.rl_teachers);
        rlSchedule=findViewById(R.id.rl_shedule);
        rlAttendance=findViewById(R.id.rl_attendance);
        rlMarks=findViewById(R.id.rl_marks);
        rlLibrary=findViewById(R.id.rl_library);
        rlPayement=findViewById(R.id.payment_rl);
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
        ico_track=findViewById(R.id.txtIconTrack);

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
        ico_track.setTypeface(FontManager.getTypeface(this,FontManager.REGULAR));

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        rlNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), NoticeBoard.class);
                startActivity(intent);
            }
        });

        rlmessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ChatThreadListActivity.class);
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
                Intent intent=new Intent(getApplicationContext(), BehaviorDetailActivity.class);
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
                Intent intent=new Intent(getApplicationContext(), PaymentActivity.class);
                startActivity(intent);

            }
        });
        rlAcademics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), AcademicsActivity.class);
                startActivity(intent);
            }
        });
        rltracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), TrackingActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Intent i=null;
        if (id == R.id.nav_schedule) {
            // Handle the camera action
            i=new Intent(this, ScheduleActivity.class);
        } else if (id == R.id.nav_message) {
            i=new Intent(this, ChatThreadListActivity.class);

        } else if (id == R.id.nav_teacher) {
            i=new Intent(this, TeachersActivity.class);

        } else if (id == R.id.nav_attendence) {
            i=new Intent(this, AttendanceActivity.class);

        } else if (id == R.id.nav_library) {
            i=new Intent(this, LibraryActivity.class);

        } else if (id == R.id.nav_marks) {
            i=new Intent(this, MarksActivity.class);

        } else if (id == R.id.nav_homework) {
            i=new Intent(this, HomeWorkActivity.class);

        } else if (id == R.id.nav_stars) {
            i=new Intent(this, BehaviorActivity.class);

        } else if (id == R.id.nav_payment) {
            i=new Intent(this, PaymentActivity.class);

        } else if (id == R.id.nav_notice) {
            i=new Intent(this, NoticeBoard.class);

        }

        if (i!=null) {startActivity(i);}
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
