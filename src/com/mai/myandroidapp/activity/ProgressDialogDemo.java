package com.mai.myandroidapp.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.mai.myandroidapp.R;

public class ProgressDialogDemo extends Activity implements OnClickListener {
	private ProgressDialog Dialog;
	private Handler mhandler;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);

		Button wukong = (Button) findViewById(R.id.sunwukong);
		wukong.setOnClickListener(this);

		Button bajie = (Button) findViewById(R.id.zhubajie);
		bajie.setOnClickListener(this);

		Button shaseng = (Button) findViewById(R.id.shaheshang);
		shaseng.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		//设定Handler对象,主要是处理新开线程完毕后交给主线程来处理的数据
		mhandler = new Handler(){
			@Override
			public void handleMessage(Message msg)
			{
				String name =(String)msg.obj;
				Toast.makeText(ProgressDialogDemo.this, name + "把师傅救出来了", 1).show();
			}
		};
		//创建ProgressDialog对象
		Dialog = new ProgressDialog(this);
		//设定ProgressDialog的样式为进度条
		Dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		//设定ProgressDialog的最大值为100,这里就是100只小妖怪啦
		Dialog.setMax(100);
		//设定ProgressDialog不能取消,你不能半途而废啊,当然要100只打完啦
		Dialog.setCancelable(false);
		
		String name = null;
		
		switch (v.getId())
		{
		case R.id.sunwukong:
			//设定名字,看是谁在打妖怪啊
			name = "孙悟空";
			Dialog.setTitle(name);
			//图片
			Dialog.setIcon(R.drawable.sunwukong);
			//消息
			Dialog.setMessage("悟空在打妖怪");
			//自定义打斗的方法
			doFlight(name);

			break;

		case R.id.zhubajie:
			
			//同上
			name = "猪八戒";
			Dialog.setTitle(name);
			Dialog.setIcon(R.drawable.zhubajie);
			Dialog.setMessage("八戒在打妖怪");
			doFlight(name);

			break;

		case R.id.shaheshang:
			
			//同上
			name = "沙和尚";
			Dialog.setTitle(name);
			Dialog.setIcon(R.drawable.shaheshang);
			Dialog.setMessage("沙僧在打妖怪");
			doFlight(name);

			break;
		}

		

	}

	private void doFlight(final String name)
	{
		//显示ProgressDialog
		Dialog.show();
		
		//新开一条线程
		new Thread()
		{
			//打完妖怪的数量
			int count = 0;
			public void run()
			{
				try
				{
					//打完妖怪小于100只的时候运行的方法
					while(count <= 100){
						Dialog.setProgress(count++);
						//睡眠0.2秒,你也得让他们休息一下啊,呵呵
						Thread.sleep(200);
					}
					Dialog.cancel();
					
					//给handler发送消息,看是谁在打妖怪,handler是主线程中的
					Message message = new Message();
					message.obj = name;
					mhandler.sendMessage(message);

				} catch (InterruptedException e)
				{
					Dialog.cancel();
				}
				
			};

		}.start();
		
	}
}
