package com.tulinsystems.kangbohome;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.xwalk.core.XWalkView;
import org.xwalk.core.XWalkPreferences;


public class KangboActivity extends Activity {


    private XWalkView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kangbo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kangbo, menu);



       mView=(XWalkView)findViewById(R.id.xView);
       mView.load("http://www.google.com", null);

        //debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);

        return true;
    }


}
