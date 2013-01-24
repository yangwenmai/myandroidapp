//package com.mai.myandroidapp.activity;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
//import android.content.DialogInterface.OnClickListener;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.ArrayAdapter;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.mai.myandroidapp.R;
//
//public class Copy_3_of_ButtonDemoActivity extends Activity
//{
//	private TextView text = null;
//	private int[] image = { R.drawable.tangseng, R.drawable.sunwukong,
//			R.drawable.zhubajie, R.drawable.shaheshang};
//	private String[] item = { "唐僧", "孙悟空 ", "猪八戒", "沙和尚" };
//	private ListView listView;
//	protected int position_int;
//
//	/** Called when the activity is first created. */
//	@Override
//	public void onCreate(Bundle savedInstanceState)
//	{
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//
//		// 通过ID查找到main.xml中的TextView控件
//		text = (TextView) findViewById(R.id.text);
//
//		// 通过ID查找到main.xml中的ListView控件
//		listView = (ListView) findViewById(R.id.listView);
//
//		// 设置ListView适配器
//		ArrayAdapter adapter = new ArrayAdapter(this,
//				android.R.layout.simple_list_item_1, item);
//
//		listView.setAdapter(adapter);
//
//		// 设置ListView单项选择监听器
//		listView.setOnItemClickListener(new OnItemClickListener()
//		{
//
//			@Override
//			public void onItemClick(AdapterView<?> arg0, View arg1,
//					int position, long arg3)
//			{
//				String str = item[position];
//				updateText(str);
//				// 将点击的位置参数传递给全局变量
//				position_int = position;
//				// 显示登录框
//				dialog_show();
//
//			}
//		});
//
//	}
//
//	/**
//	 * 登录框
//	 */
//	protected void dialog_show()
//	{
//		// 将Layout中的login.xml匹配给视图控件
//		LayoutInflater inflater = LayoutInflater.from(this);
//		final View view = inflater.inflate(R.layout.login, null);
//		// 创建Dialog
//		AlertDialog.Builder builder = new AlertDialog.Builder(this);
//		builder.setTitle("登录框");
//		builder.setView(view);
//		builder.setPositiveButton("登录", new OnClickListener()
//		{
//
//			@Override
//			public void onClick(DialogInterface dialog, int which)
//			{
//				// 取得login.xml中的账号EditText和密码EditText控件
//				EditText user = (EditText) view.findViewById(R.id.user);
//				EditText pass = (EditText) view.findViewById(R.id.pass);
//				// 取得两个控件中的值
//				String user_str = user.getText().toString();
//				String pass_str = pass.getText().toString();
//				// 验证账号和密码
//				validate(user_str, pass_str);
//
//			}
//		});
//		builder.setNegativeButton("取消", new OnClickListener()
//		{
//
//			@Override
//			public void onClick(DialogInterface dialog, int which)
//			{
//				dialog.dismiss();
//			}
//		});
//		// 这个很重要的,是dialog的显示功能,如果这个没有的话,是不会显示出来的
//		builder.show();
//
//	}
//
//	/**
//	 * 验证账号和密码
//	 * 
//	 * @param user_str
//	 *            账号
//	 * @param pass_str
//	 *            密码
//	 */
//	protected void validate(String user_str, String pass_str)
//	{
//		if ("admin".equals(user_str) && "admin".equals(pass_str))
//		{
//			image_dialog();
//		} else
//		{
//			Toast.makeText(this, "您的密码不对,请重新输入", 1).show();
//		}
//
//	}
//	
//	/**
//	 * 图片Dialog显示功能
//	 */
//	private void image_dialog()
//	{
//		//同上一样,是取得Layout中的image.xml模板
//		LayoutInflater inflater = LayoutInflater.from(this);
//		View view = inflater.inflate(R.layout.image, null);
//		//取得image.xml中的ImageView控件
//		ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
//		//设置ImagView控件显示的图片ID
//		imageView.setImageResource(image[position_int]);
//		//创建Dialog
//		AlertDialog.Builder builder = new AlertDialog.Builder(this);
//		builder.setTitle(item[position_int]);
//		builder.setView(view);
//		builder.setPositiveButton("确定", new OnClickListener()
//		{
//
//			@Override
//			public void onClick(DialogInterface dialog, int which)
//			{
//				dialog.dismiss();
//			}
//		});
//		builder.show();
//
//	}
//
//	private void updateText(String string)
//	{
//		// 将文本信息设置给TextView控件显示出来
//		text.setText(string);
//	}
//
//}