package drogenidesoftwares.drogenideschool.payment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import drogenidesoftwares.drogenideschool.ItemOffSetDecoration;
import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.homework.HomeworkAdapter;

public class PaymentActivity extends AppCompatActivity {

    RecyclerView rView;
    PaymentAdapter rcAdapter;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        rView = (RecyclerView) findViewById(R.id.payment_recycler);
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new ItemOffSetDecoration(1));
        rView.setLayoutManager(linearLayoutManager);
        rView.setAdapter(rcAdapter);
    }
}
