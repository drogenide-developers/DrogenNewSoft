package drogenidesoftwares.drogenideschool.payment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import drogenidesoftwares.drogenideschool.R;
import drogenidesoftwares.drogenideschool.behavior.BehaviorModel;
import drogenidesoftwares.drogenideschool.teachers.TeachersFilter;

/**
 * Created by Vicky on 16-Dec-17.
 */

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.PaymentHolder> {

    List<PaymentModel> itemList,filterList;
    private Context context;
    TeachersFilter filter;

    public PaymentAdapter(Context context, List<PaymentModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.filterList=itemList;


    }

    @Override
    public PaymentHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_payment, null);
        PaymentHolder holder = new PaymentHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(PaymentHolder holder, final int position) {
        PaymentHolder myHolder=holder;
        myHolder.PaymentStudentName.setText(itemList.get(position).getPaymentStudentName());
        myHolder.PaymentAmount.setText(itemList.get(position).getPaymentAmount());
        myHolder.PaymentTitle.setText(itemList.get(position).getPaymentTitle());
        myHolder.PaymentStatus.setText(itemList.get(position).getPaymentStatus());
        myHolder.PaymentDate.setText(itemList.get(position).getPaymentDate());
        // myHolder.Photo.setImageResource(R.mipmap.ic_keyboard_arrow_right_black_36dp);
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(v.getContext(),"position is"+ itemList.get(position),Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(context, BusinessCategoryActivity.class);
//                intent.putExtra("ID",itemList.get(position).getID());
                //intent.putExtra("image", Attributes.Name.get(position)); // put image data in Intent
//                context.startActivity(intent); // start Intent


            }
        });
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }



    public class PaymentHolder extends RecyclerView.ViewHolder{

        public TextView PaymentStudentName, PaymentTitle, PaymentAmount, PaymentStatus, PaymentDate;
        public ImageView Photo;

        public PaymentHolder(View itemView) {
            super(itemView);
            PaymentStudentName = itemView.findViewById(R.id.payment_student_name);
            PaymentTitle = itemView.findViewById(R.id.payment_title);
            PaymentAmount =itemView.findViewById(R.id.payment_amount);
            PaymentStatus =itemView.findViewById(R.id.payment_status);
            PaymentDate =itemView.findViewById(R.id.payment_date);
        }


    }








}
