package com.mai.myandroidapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.mai.myandroidapp.R;

//public class ButtonDemoActivity extends Activity implements OnClickListener {
//public class ButtonDemoActivity extends Activity implements OnItemSelectedListener {
public class ButtonDemoActivity extends Activity implements OnItemClickListener {
	
	private TextView textView;
//	private EditText editText = null;
//	private RadioButton tangseng;
//	private RadioButton sunwukong;
//	private RadioButton zhubajie;
//	private RadioButton shaheshang;
//	private CheckBox tangseng;
//	private CheckBox sunwukong;
//	private CheckBox zhubajie;
//	private CheckBox shaheshang;
//	private Spinner spinner;
	
	private ListView listView;
	private String[] items = {"唐僧", "孙悟空", "猪八戒", "沙和尚", "沙和尚2", "沙和尚3", "沙和尚4", "沙和尚5"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView)findViewById(R.id.text);
//		editText = (EditText)findViewById(R.id.editText);
//		tangseng = (CheckBox)findViewById(R.id.tangseng);
//		sunwukong = (CheckBox)findViewById(R.id.sunwukong);
//		zhubajie = (CheckBox)findViewById(R.id.zhubajie);
//		shaheshang = (CheckBox)findViewById(R.id.shaheshang);
//		spinner = (Spinner)findViewById(R.id.spinner);
		
		listView = (ListView)findViewById(R.id.listView);
		
		// 设定一个Array适配器，将数组数据放入适配器中
//		ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, items);
//		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		// 对spinner进行适配
//		spinner.setAdapter(adapter);
//		spinner.setOnItemSelectedListener(this);
		
		ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
//		Button button = (Button) findViewById(R.id.button);
//		button.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		String str = "这次妖精把" + items[position] + "抓住了！";
		updateText(str);
	}
	
//	@Override
//	public void onItemSelected(AdapterView<?> parent, View view, int position,
//			long id) {
//		String str = "这次妖精把" + items[position] + "抓住了！";
//		updateText(str);
//	}
	
//	@Override
//	public void onClick(View v) {
//		String str = "";
//		if(tangseng.isChecked()) {
//			str += "唐僧~";
//		}
//		//悟空单选框被选中  
//        if(sunwukong.isChecked()){  
//            str += "孙悟空~";  
//        }  
//        //八戒单选框被选中  
//        if(zhubajie.isChecked()){  
//            str += "猪八戒~";  
//        }  
//        //沙僧单选框被选中  
//        if(shaheshang.isChecked()){  
//            str += "沙和尚~";  
//        }  
//        //没有人被选中  
//        if(str.equals("")){  
//            str += "没有人";  
//        }  
//        str +="被妖精抓走了！";
//        updateText(str);
//	}
	
	private void updateText(String string) {
		textView.setText(string);
//		textView.setText(new Date().toString());
//		String editStr = editText.getText().toString();
//		if(editStr!=null && editStr.trim().length()>0) {
//			textView.setText(editStr);
//		} else {
//			textView.setText("你可别偷懒哦，貌似什么内容你也没填写！");
//		}
	}

//	@Override
//	public void onNothingSelected(AdapterView<?> parent) {
//	}

}
