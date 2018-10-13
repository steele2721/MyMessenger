package com.androidapps.robertsteele.mymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    public static final String MESSAGE = "message";

    private EditText mEnterMessageText;
    private Button mSendMessageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        mEnterMessageText = findViewById(R.id.recieved_message);
        mSendMessageButton = findViewById(R.id.send);
        mSendMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = mEnterMessageText.getText().toString();
                if(message.equals("")){
                    message = "No message was entered";
                }
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String chooserMessage = getString(R.string.chooser_message);
                i.putExtra(Intent.EXTRA_TEXT, message);
                Intent chooserIntent = Intent.createChooser(i, chooserMessage);
                startActivity(chooserIntent);
            }
        });

    }
}
