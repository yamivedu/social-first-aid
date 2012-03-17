package edu.hawaii.ics466;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Sets the current display for the Prepare tab
 * 
 * @author Sean Chung
 *
 */
public class PrepareActivity extends Activity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    TextView textview = new TextView(this);
    textview.setText("Prepare for Social Situations");
    setContentView(textview);
  }
}