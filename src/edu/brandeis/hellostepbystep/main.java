package edu.brandeis.hellostepbystep;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

public class main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
	    GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setBackgroundResource(R.drawable.bgr1);

   }
}