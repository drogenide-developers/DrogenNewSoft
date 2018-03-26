package drogenidesoftwares.drogenideschool.loginandregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;

import drogenidesoftwares.drogenideschool.R;

public class RegistrationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        final AutoCompleteTextView NameSearch = (AutoCompleteTextView) findViewById(R.id.tf_reg_name);
        final AutoCompleteAdapter adapter = new AutoCompleteAdapter(this,android.R.layout.simple_dropdown_item_1line);
        NameSearch.setAdapter(adapter);

        //when autocomplete is clicked
        NameSearch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String countryName = adapter.getItem(position).getName();
                NameSearch.setText(countryName);
            }
        });
    }
}
