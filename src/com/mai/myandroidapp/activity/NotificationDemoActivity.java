package com.mai.myandroidapp.activity;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mai.myandroidapp.R;

public class NotificationDemoActivity extends Activity {
	private final static int NOTIFYCATION_ID = 0x11;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main1);
		
		//查找main.xml中的Button控件
		Button wukong = (Button) findViewById(R.id.sunwukong);
		wukong.setOnClickListener(new ClickEvent());

		Button bajie = (Button) findViewById(R.id.zhubajie);
		bajie.setOnClickListener(new ClickEvent());

		Button shaseng = (Button) findViewById(R.id.shaheshang);
		shaseng.setOnClickListener(new ClickEvent());
		
		Button notify_cancal = (Button)findViewById(R.id.notify_cancal);
		notify_cancal.setOnClickListener(new ClickEvent());
	}

	class ClickEvent implements View.OnClickListener
	{

		@Override
		public void onClick(View v)
		{
			//获取系统的NotificationManager服务
			NotificationManager notifyManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
			
			//创建一个启动其他Activity的Intent
			Intent intent = new Intent(NotificationDemoActivity.this,
					TabHostDemoActivity.class);
			//设置点击通知时显示内容启动的类
			PendingIntent pi = PendingIntent.getActivity(NotificationDemoActivity.this,
					0, intent, 0);
			
			//创建Notification对象
			Notification notify = new Notification();
			
			//设置Notification的发送时间
			notify.when = System.currentTimeMillis();
			//为Notification设置默认的声音,默认的振动,默认的闪光灯,但这些需要在AndroidManifest.xml中加入相应的权限,不然会报错
			notify.defaults = Notification.DEFAULT_ALL;
			
			switch (v.getId())
			{
			case R.id.sunwukong:
				//设置Notification的图标
				notify.icon = R.drawable.sunwukong;
				//设置Notification事件信息
				notify.setLatestEventInfo(NotificationDemoActivity.this, "悟空",
						"悟空来救师傅的通知", pi);
				//设置Notification的文本内容,会显示在状态栏中
				notify.tickerText = "悟空来救师傅了";
				//发送通知
				notifyManager.notify(NOTIFYCATION_ID, notify);

				break;

			case R.id.zhubajie:
				
				//同上
				notify.icon = R.drawable.zhubajie;
				notify.setLatestEventInfo(NotificationDemoActivity.this, "八戒",
						"八戒来救师傅的通知", pi);
				notify.tickerText = "八戒来救师傅了";
				notifyManager.notify(NOTIFYCATION_ID, notify);

				break;

			case R.id.shaheshang:
				
				//同上
				notify.icon = R.drawable.shaheshang;
				notify.setLatestEventInfo(NotificationDemoActivity.this, "沙僧",
						"沙僧来救师傅的通知", pi);
				notify.tickerText = "沙僧来救师傅了";
				notifyManager.notify(NOTIFYCATION_ID, notify);

				break;
				
			case R.id.notify_cancal:
				
				//取消通知
				notifyManager.cancel(NOTIFYCATION_ID);

			}	
			
		}

	}
}
