package drogenidesoftwares.drogenideschool.payment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import drogenidesoftwares.drogenideschool.R;

public class PaymentActivity extends AppCompatActivity {
    Button btnPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btnPay=findViewById(R.id.btn_pay_now);
        getSupportActionBar().setTitle("Payment");
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),payInvoiceActivity.class);
                startActivity(intent);
            }
        });


    }
}
