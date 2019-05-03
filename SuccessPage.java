package edu.tamu.ece.ecen489_miniproject1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SuccessPage extends AppCompatActivity {
    public ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_page);
        Intent intent = getIntent();
        String product = intent.getStringExtra("product");
        TextView text = (TextView) findViewById(R.id.successText);
        text.setText("Congratulations on your purchase of " + product +"!");
        TextView text2 = (TextView) findViewById(R.id.textView2);
        int x = (int)(Math.random()*((9999999-1111111)+1))+1111111;
        list.add (String.valueOf(x));
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("trackingnumbers");

        myRef.setValue(list.get(0));
        text2.setText("Tracking Number:  " + list.get(0));

    }


}
