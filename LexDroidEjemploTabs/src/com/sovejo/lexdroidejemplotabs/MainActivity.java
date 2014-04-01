package com.sovejo.lexdroidejemplotabs;

import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.Activity;
import android.graphics.Color;

public class MainActivity extends Activity 
{
	TabHost tabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		tabHost = (TabHost) findViewById(R.id.th);
		tabHost.setup();
		
		TabSpec spec = tabHost.newTabSpec("tag01");
		spec.setIndicator("Num01", getResources().getDrawable(R.drawable.ic_launcher));
		spec.setContent(R.id.tab01);
		tabHost.addTab(spec);
		
		spec = tabHost.newTabSpec("tag02");
		spec.setIndicator("Num02", getResources().getDrawable(R.drawable.ic_launcher));
		spec.setContent(R.id.tab02);
		tabHost.addTab(spec);
		
		spec = tabHost.newTabSpec("tag03");
		spec.setIndicator("Num03");
		spec.setContent(R.id.tab03);
		tabHost.addTab(spec);
		
		spec = tabHost.newTabSpec("tag04");
		spec.setIndicator("Num04");
		spec.setContent(R.id.tab04);
		tabHost.addTab(spec);
		
		/*
		tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.BLACK);
		tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.BLACK);
		tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.BLACK);
		tabHost.getTabWidget().getChildAt(3).setBackgroundColor(Color.BLACK);
		*/
		
		for(int i = 0; i < tabHost.getTabWidget().getChildCount(); i++)
			tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.BLACK);
	}

}
