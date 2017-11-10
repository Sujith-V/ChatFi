package com.crafterfactory.chatfi.homepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.crafterfactory.chatfi.R;
import com.crafterfactory.chatfi.util.PresenterAdmin;
import com.crafterfactory.chatfi.util.RequestInterface;

public class HomePageView extends AppCompatActivity implements View.OnClickListener {

    EditText ipAddressEditText;
    EditText messageEditText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ipAddressEditText = this.findViewById(R.id.et_home_activity_ip_address);
        messageEditText = this.findViewById(R.id.et_home_activity_message);
        sendButton = this.findViewById(R.id.btn_home_activity_send);

        sendButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        switch (viewId) {
            case R.id.btn_home_activity_send:
                String ipAddress = ipAddressEditText.getText().toString();
                String message = messageEditText.getText().toString();
                HomePagePresenterRequestInterface homePagePresenterRequestInterface = PresenterAdmin.getHomePagePresenterRequestInterface();

                break;
        }
    }
}
