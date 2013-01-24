package com.mai.myandroidapp.activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.mai.myandroidapp.R;

public class TabHostDemoActivity extends TabActivity {
	private String[] item = { "唐僧", "孙悟空 ", "猪八戒", "沙和尚" };
	private int[] tab = {R.id.tab1, R.id.tab2, R.id.tab3, R.id.tab4};
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
		
		int len = item.length;
		for(int i= 0; i < len; i++ ){
			tabHost.addTab(tabHost.newTabSpec(item[i]).setIndicator(item[i]).setContent(tab[i]));
		}
		

	}
}
