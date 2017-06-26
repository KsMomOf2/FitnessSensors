package com.bodytechnix.fitnesssensors;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddCalibrate extends AppCompatActivity {

  private TextView mTextMessage;
  private View view;

  private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
          = new BottomNavigationView.OnNavigationItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
      switch (item.getItemId()) {
        case R.id.navigation_home:
          mTextMessage.setText(R.string.title_home);
          return true;
        case R.id.navigation_dashboard:
          mTextMessage.setText(R.string.title_dashboard);
          return true;
        case R.id.navigation_notifications:
          mTextMessage.setText(R.string.title_notifications);
          return true;
      }
      return false;
    }

  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add_calibrate);

    mTextMessage = (TextView) findViewById(R.id.message);
    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    View view = (View) getWindow().findViewById(android.R.id.content);
  }

public void addCalibrate(View view) {
  Toast.makeText(view.getContext(), "Calibration Successful!", Toast.LENGTH_LONG).show();
}

}