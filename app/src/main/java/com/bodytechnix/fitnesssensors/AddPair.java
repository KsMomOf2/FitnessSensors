package com.bodytechnix.fitnesssensors;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class AddPair extends AppCompatActivity {

  private TextView mTextMessage;

  private ListView.OnItemClickListener mOnItemClickListener = new ListView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view,
                                       int position, long id) {
      ArrayAdapter<String> devices = (ArrayAdapter<String>) parent.getAdapter();
      Toast.makeText(view.getContext(), devices.getItem(position) + " paired", Toast.LENGTH_LONG).show();
    }
   };

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
    setContentView(R.layout.activity_add_pair);

    String[] values = new String[] { "Sleeve 1","", "Sleeve 2","","Sleeve 3" };
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.rowlayout, R.id.label, values);
    ListView lv = (ListView) findViewById(R.id.lstDevices);
    lv.setAdapter(adapter);
    lv.setOnItemClickListener(mOnItemClickListener);

    mTextMessage = (TextView) findViewById(R.id.message);
    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
  }
}
