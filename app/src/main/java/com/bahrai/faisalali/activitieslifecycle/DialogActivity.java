package com.bahrai.faisalali.activitieslifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}
