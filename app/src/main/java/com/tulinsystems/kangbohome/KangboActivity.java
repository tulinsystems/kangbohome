package com.tulinsystems.kangbohome;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import org.xwalk.core.XWalkView;
import org.xwalk.core.XWalkPreferences;


public class KangboActivity extends Activity {


    private XWalkView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /* Go full screen */
        requestWindowFeature(getWindow().FEATURE_ACTION_BAR_OVERLAY);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_kangbo);

        /* Browser view - Cross Walk*/
        mView = (XWalkView) findViewById(R.id.xView);
        mView.load("http://localhost:3000", null);

        //debugging
        //XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);

    }


}