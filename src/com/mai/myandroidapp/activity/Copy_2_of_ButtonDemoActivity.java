//package com.mai.myandroidapp.activity;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.ViewGroup.LayoutParams;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemSelectedListener;
//import android.widget.BaseAdapter;
//import android.widget.Gallery;
//import android.widget.ImageSwitcher;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.ViewSwitcher.ViewFactory;
//
//import com.mai.myandroidapp.R;
//
//public class Copy_2_of_ButtonDemoActivity extends Activity
//{ 
//	private TextView text = null;
//	private int[] image = { R.drawable.tangseng, R.drawable.sunwukong,
//			R.drawable.zhubajie, R.drawable.shaheshang };
//	private String[] item = { "唐僧", "孙悟空 ", "猪八戒", "沙和尚" };
//	private Gallery gallery;
//	private ImageSwitcher switcher;
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
//		// 通过ID查找到main.xml中的ImageSwitcher控件
//		switcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
//
//		switcher.setFactory(new ViewFactory()
//		{
//
//			// 创建ImageSwitcher中的视图
//			@Override
//			public View makeView()
//			{
//				ImageView imageView = new ImageView(Copy_2_of_ButtonDemoActivity.this);
//				imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//				imageView.setPadding(10, 10, 10, 10);
//				imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
//						LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//				return imageView;
//			}
//		});
//
//		// 通过ID查找到main.xml中的Gallery控件
//		gallery = (Gallery) findViewById(R.id.gallery1);
//
//		// 设置Gallery适配器
//		BaseAdapter adapter = new BaseAdapter()
//		{
//
//			// 取得适配器中的视图
//			@Override
//			public View getView(int position, View convertView, ViewGroup parent)
//			{
//				//将适配器中缓冲的视图控件返回
//				View view = convertView;
//
//				if (view == null)
//				{
//					// 将gallery_item.xml适配到View中
//					LayoutInflater inflater = LayoutInflater
//							.from(getApplicationContext());
//					view = inflater.inflate(R.layout.gallery_item, null);
//				}
//
//				// 查找gallery_item.xml中的ImageView控件
//				ImageView imageView = (ImageView) view
//						.findViewById(R.id.item_imageView);
//				imageView.setImageResource(image[position]);
//
//				// 查找gallery_item.xml中的TextView控件
//				TextView textView = (TextView) view
//						.findViewById(R.id.item_textView);
//				textView.setText(item[position]);
//				return view;
//			}
//
//			@Override
//			public long getItemId(int position)
//			{
//
//				return position;
//			}
//
//			@Override
//			public Object getItem(int position)
//			{
//				return position;
//			}
//
//			@Override
//			public int getCount()
//			{
//
//				return image.length;
//			}
//		};
//
//		gallery.setAdapter(adapter);
//
//		// 设置Gallery单项选择监听器
//		gallery.setOnItemSelectedListener(new OnItemSelectedListener()
//		{
//
//			@Override
//			public void onItemSelected(AdapterView<?> arg0, View arg1,
//					int position, long arg3)
//			{
//				String str = "你现在查看的是" + item[position];
//				updateText(str);
//				switcher.setImageResource(image[position]);
//			}
//
//			@Override
//			public void onNothingSelected(AdapterView<?> arg0)
//			{
//				// TODO Auto-generated method stub
//
//			}
//		});
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