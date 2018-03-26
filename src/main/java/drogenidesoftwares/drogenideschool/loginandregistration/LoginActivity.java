package drogenidesoftwares.drogenideschool.loginandregistration;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import drogenidesoftwares.drogenideschool.MainActivity;
import drogenidesoftwares.drogenideschool.R;

public class LoginActivity extends AppCompatActivity {

    Button login,Registration,btnSendPass;
    TextView tvForgetPass;
    Dialog forgetPassPopUP;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = LoginActivity.this;

        login=findViewById(R.id.btn_login);
        Registration=findViewById(R.id.btn_registration);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        tvForgetPass=findViewById(R.id.tv_forget_password);
        tvForgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgetPassPopUP = new Dialog(context);
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View dialogView1 = inflater.inflate(R.layout.forget_pass_pop_up, null);
                forgetPassPopUP.requestWindowFeature(Window.FEATURE_NO_TITLE);
                forgetPassPopUP.setContentView(dialogView1);

                btnSendPass = forgetPassPopUP.findViewById(R.id.btn_send_pwd);
                btnSendPass.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"Password Sent to your registerd email id",Toast.LENGTH_LONG).show();
                        forgetPassPopUP.dismiss();
                    }
                });
                forgetPassPopUP.show();
            }
        });
    }
}
