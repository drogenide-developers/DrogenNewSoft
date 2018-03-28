package drogenidesoftwares.drogenideschool.noticeboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import drogenidesoftwares.drogenideschool.R;

/**
 * Created by pc1 on 3/27/2018.
 */

public class DetailNoticeActivity extends AppCompatActivity
{
    TextView txtDtls_notification,title,date;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_dtls_activity);
        txtDtls_notification=findViewById(R.id.dtls_notice_description);
        title=findViewById(R.id.txt_noticeDtls_hd);
        date=findViewById(R.id.dtls_notice_date);

        Bundle bundle=getIntent().getExtras();
        date.setText("Date: "+bundle.get("Date").toString());
        txtDtls_notification.setText(bundle.get("Description").toString());
        title.setText(bundle.get("NoticeTitle").toString());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
