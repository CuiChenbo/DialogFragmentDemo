package choi.ccb.com.dialogfragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import choi.ccb.com.dialogfragmentdemo.dialog.CustomViewDialog;
import choi.ccb.com.dialogfragmentdemo.dialog.DialogTypeDialog;
import choi.ccb.com.dialogfragmentdemo.dialog.TopDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt1).setOnClickListener(this);
        findViewById(R.id.bt2).setOnClickListener(this);
        findViewById(R.id.bt3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt1:
                new TopDialog().show(getSupportFragmentManager(),"1");
                break;
            case R.id.bt2:
                new CustomViewDialog().show(getSupportFragmentManager(),"2'");
                break;
            case R.id.bt3:
                new DialogTypeDialog().show(getSupportFragmentManager(),"3'");
                break;
        }
    }
}
