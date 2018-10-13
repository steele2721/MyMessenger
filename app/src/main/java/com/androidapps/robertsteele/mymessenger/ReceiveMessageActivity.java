package com.androidapps.robertsteele.mymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    private static TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        mMessageTextView = findViewById(R.id.recieved_message);
        Intent i = getIntent();
        String message = i.getStringExtra(CreateMessageActivity.MESSAGE);
        mMessageTextView.setText(message);
    }
}
