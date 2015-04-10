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

        mView = (XWalkView) findViewById(R.id.xView);
        mView.load("http://www.tulinsystems.com", null);

        //debugging
        //XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);

    }


}