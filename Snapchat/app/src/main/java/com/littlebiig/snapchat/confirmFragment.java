package com.littlebiig.snapchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class confirmFragment extends AppCompatActivity {


    private EditText mDescriptionInput;
    private Button mPublishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);
        mDescriptionInput = (EditText) findViewById(R.id.confirm_description_input);
        mPublishButton = (Button) findViewById(R.id.confirm_publish_button);
        mPublishButton.setEnabled(false);

        mPublishButton.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPublishButton.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        mPublishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
