package com.bodytechnix.fitnesssensors;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView mTextMessage;

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
    setContentView(R.layout.activity_main);

    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
  }

  public void openPreMade(View view) {
    Intent intent = new Intent(this, PreMade.class);
    startActivity(intent);
  }
  public void openNew1(View view) {
    Intent intent = new Intent(this, New1.class);
    startActivity(intent);
  }
  public void openCurrent1(View view) {
    Intent intent = new Intent(this, Current1.class);
    startActivity(intent);
  }
  public void openSaved1(View view) {
    Intent intent = new Intent(this, Saved1.class);
    startActivity(intent);
  }
  public void openAddDevice(View view) {
    Intent intent = new Intent(this, AddDevice.class);
    startActivity(intent);
  }

}
