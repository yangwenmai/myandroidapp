//package com.mai.myandroidapp.activity;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.Menu;
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
////public class ButtonDemoActivity extends Activity implements OnClickListener {
////public class ButtonDemoActivity extends Activity implements OnItemSelectedListener {
////public class ButtonDemoActivity extends Activity implements OnItemClickListener {
//public class CopyOfButtonDemoActivity extends Activity {
//	
//	private TextView textView;
////	private EditText editText = null;
////	private RadioButton tangseng;
////	private RadioButton sunwukong;
////	private RadioButton zhubajie;
////	private RadioButton shaheshang;
////	private CheckBox tangseng;
////	private CheckBox sunwukong;
////	private CheckBox zhubajie;
////	private CheckBox shaheshang;
////	private Spinner spinner;
////	private ListView listView;
////	private AutoCompleteTextView autoCompleteTextView;
////	private MultiAutoCompleteTextView multiAutoCompleteTextView;
////	private ArrayAdapter arrayAdapter;
////	private GridView gridView;
////	private SimpleAdapter simpleAdapter;
////	private String[][] ability = {{"会念紧箍咒", "会说阿弥陀佛"}, {"会七十二变", "会打妖精", "会腾云驾雾" }, { "会偷懒", "会睡觉" }, { "会挑担子" }};
////	private ExpandableListView expandableListView;
//
//	private int[] image = {R.drawable.tangseng, R.drawable.sunwukong, R.drawable.zhubajie, R.drawable.shaheshang};
//	private String[] items = {"唐僧", "孙悟空", "猪八戒", "沙和尚"};
//	private Gallery gallery;
//	private ImageSwitcher imgageSwitcher;
//	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		
//		textView = (TextView)findViewById(R.id.text);
////		editText = (EditText)findViewById(R.id.editText);
////		tangseng = (CheckBox)findViewById(R.id.tangseng);
////		sunwukong = (CheckBox)findViewById(R.id.sunwukong);
////		zhubajie = (CheckBox)findViewById(R.id.zhubajie);
////		shaheshang = (CheckBox)findViewById(R.id.shaheshang);
////		spinner = (Spinner)findViewById(R.id.spinner);
////		listView = (ListView)findViewById(R.id.listView);
////		gridView = (GridView) findViewById(R.id.gridView);
//		
////		expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
////		ExpandableListAdapter adapter = new ExpandableListAdapter() {
////			
////			@Override
////			public void unregisterDataSetObserver(DataSetObserver observer) {
////			}
////			
////			@Override
////			public void registerDataSetObserver(DataSetObserver observer) {
////			}
////			
////			@Override
////			public void onGroupExpanded(int groupPosition) {
////			}
////			
////			@Override
////			public void onGroupCollapsed(int groupPosition) {
////			}
////			
////			@Override
////			public boolean isEmpty() {
////				return false;
////			}
////			
////			@Override
////			public boolean isChildSelectable(int groupPosition, int childPosition) {
////				String str = items[groupPosition]  
////                        + ability[groupPosition][childPosition];  
////                updateText(str);
////				return true;
////			}
////			
////			@Override
////			public boolean hasStableIds() {
////				return true;
////			}
////			
////			@Override
////			public View getGroupView(int groupPosition, boolean isExpanded,
////					View convertView, ViewGroup parent) {
////				//新建一个线性布局  
////                LinearLayout ll = new LinearLayout(ButtonDemoActivity.this);  
////                // 设置布局样式为Horizontal  
////                ll.setOrientation(0);  
////                //设置布局左边距为50像素  
////                ll.setPadding(50, 0, 0, 0);  
////                //新建一个ImageView对象  
////                ImageView imageView = new ImageView(ButtonDemoActivity.this);  
////                //设置ImageView要显示的对象ID  
////                imageView.setImageResource(image[groupPosition]);  
////                //将ImageView加到线性布局中  
////                ll.addView(imageView);  
////                //使用自定义文本框  
////                TextView textView = getTextView();  
////                //设置文本框里显示内容  
////                textView.setText(getGroup(groupPosition).toString());  
////                //将TextView加到线性布局中  
////                ll.addView(textView);  
////                return ll;
////			}
////			//返回父控件的ID
////			@Override
////			public long getGroupId(int groupPosition) {
////				return groupPosition;
////			}
////			//返回父控件的总数
////			@Override
////			public int getGroupCount() {
////				return ability.length;
////			}
////			//取得父控件对象
////			@Override
////			public Object getGroup(int groupPosition) {
////				return items[groupPosition];
////			}
////			
////			@Override
////			public long getCombinedGroupId(long groupId) {
////				return 0;
////			}
////			
////			@Override
////			public long getCombinedChildId(long groupId, long childId) {
////				return 0;
////			}
////			//取得子控件的数量
////			@Override
////			public int getChildrenCount(int groupPosition) {
////				return ability[groupPosition].length;
////			}
////			//取得子控件的视图
////			@Override
////			public View getChildView(int groupPosition, int childPosition,
////					boolean isLastChild, View convertView, ViewGroup parent) {
////				//使用自定义TextView控件  
////                TextView textView = getTextView();  
////                //设置自定义TextView控件的内容  
////                textView.setText(getChild(groupPosition, childPosition)  
////                        .toString());  
////                return textView;
////			}
////			//取得子控件的ID
////			@Override
////			public long getChildId(int groupPosition, int childPosition) {
////				return childPosition;
////			}
////			//取得子控件的对象
////			@Override
////			public Object getChild(int groupPosition, int childPosition) {
////				return ability[groupPosition][childPosition];
////			}
////			
////			@Override
////			public boolean areAllItemsEnabled() {
////				return false;
////			}
////			
////			//自定义文本框  
////            public TextView getTextView() {  
////                AbsListView.LayoutParams lp = new AbsListView.LayoutParams(  
////                        ViewGroup.LayoutParams.FILL_PARENT, 64);  
////                TextView textView = new TextView(ButtonDemoActivity.this);  
////                textView.setLayoutParams(lp);  
////                textView.setPadding(20, 0, 0, 0);  
////                //设置TextView控件为向左,水平居中对齐  
////                textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);  
////  
////                return textView;  
////  
////            }
////		};
////		expandableListView.setAdapter(adapter);
//		
////		ArrayList<HashMap<String, Object>> listItems = new ArrayList<HashMap<String, Object>>();
////		
////		int len = items.length;
////		for (int i = 0; i < len; i++) {
////			HashMap<String, Object> map = new HashMap<String, Object>();
////			map.put("image", image[i]);
////			map.put("item", items[i]);
////			listItems.add(map);
////		}
////		String[] from = {"image", "item"};
////		int[] to = {R.id.item_imageView, R.id.item_textView};
////		simpleAdapter = new SimpleAdapter(this, listItems, R.layout.grid_item, from, to);
////		gridView.setAdapter(simpleAdapter);
////		gridView.setOnItemClickListener(new OnItemClickListener() {
////			@Override
////			public void onItemClick(AdapterView<?> parent, View view,
////					int position, long id) {
////				String str = "这次妖精把" + items[position] + "抓住了！";
////				updateText(str);
////			}
////		});
//		
////		arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items);
////		gridView.setAdapter(arrayAdapter);
////		gridView.setOnItemClickListener(new OnItemClickListener() {
////			@Override
////			public void onItemClick(AdapterView<?> parent, View view,
////					int position, long id) {
////				String str = "这次妖精把" + items[position] + "抓住了！";
////				updateText(str);
////			}
////		});
//		
////		autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
////		arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items);
////		autoCompleteTextView.setAdapter(arrayAdapter);
////		autoCompleteTextView.setOnItemClickListener(new OnItemClickListener() {
////			@Override
////			public void onItemClick(AdapterView<?> parent, View view,
////					int position, long id) {
////				String str = "这次妖精把" + autoCompleteTextView.getText().toString() + "抓住了！";
////				updateText(str);
////			}
////		});
////		
////		multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
////		multiAutoCompleteTextView.setAdapter(arrayAdapter);
////		//设置分隔符,默认的是逗号(,)
////		multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
////		multiAutoCompleteTextView.setOnItemClickListener(new OnItemClickListener() {
////			@Override
////			public void onItemClick(AdapterView<?> parent, View view,
////					int position, long id) {
////				String str = "这次妖精把" + multiAutoCompleteTextView.getText().toString() + "抓住了！";
////				updateText(str);
////			}
////		});
//		
//		// 设定一个Array适配器，将数组数据放入适配器中
////		ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, items);
////		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
////		// 对spinner进行适配
////		spinner.setAdapter(adapter);
////		spinner.setOnItemSelectedListener(this);
//		
////		ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
////		listView.setAdapter(adapter);
////		listView.setOnItemClickListener(this);
////		Button button = (Button) findViewById(R.id.button);
////		button.setOnClickListener(this);
//		
//		
//		imgageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
//		imgageSwitcher.setFactory(new ViewFactory() {
//			
//			@Override
//			public View makeView() {
//				ImageView imageView = new ImageView(CopyOfButtonDemoActivity.this);
//				imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//				imageView.setPadding(10, 10, 10, 10);
//				imageView.setLayoutParams(new ImageSwitcher.LayoutParams(  
//                        LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//				return null;
//			}
//		});
//		
//		
//		gallery = (Gallery) findViewById(R.id.gallery1);
//		BaseAdapter adapter = new BaseAdapter() {
//			// 取得适配器中的视图  
//            @Override  
//            public View getView(int position, View convertView, ViewGroup parent)  
//            {  
//                //将适配器中缓冲的视图控件返回  
//                View view = convertView;  
//  
//                if (view == null)  
//                {  
//                    // 将gallery_item.xml适配到View中  
//                    LayoutInflater inflater = LayoutInflater  
//                            .from(getApplicationContext());  
//                    view = inflater.inflate(R.layout.gallery_item, null);  
//                }  
//  
//                // 查找gallery_item.xml中的ImageView控件  
//                ImageView imageView = (ImageView) view  
//                        .findViewById(R.id.item_imageView);  
//                imageView.setImageResource(image[position]);  
//  
//                // 查找gallery_item.xml中的TextView控件  
//                TextView textView = (TextView) view  
//                        .findViewById(R.id.item_textView);  
//                textView.setText(items[position]);  
//                return view;  
//            }  
//  
//            @Override  
//            public long getItemId(int position)  
//            {  
//                return position;  
//            }  
//  
//            @Override  
//            public Object getItem(int position)  
//            {  
//                return position;  
//            }  
//  
//            @Override  
//            public int getCount()  
//            {  
//                return image.length;  
//            }  
//		};
//		gallery.setAdapter(adapter);
//		gallery.setOnItemSelectedListener(new OnItemSelectedListener() {
//
//			@Override
//			public void onItemSelected(AdapterView<?> parent, View view,
//					int position, long id) {
//				String str = "你现在查看的是" + items[position];  
//                updateText(str);
//                imgageSwitcher.setImageResource(image[position]);
//			}
//
//			@Override
//			public void onNothingSelected(AdapterView<?> parent) {
//			}
//			
//		});
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}
//	
////	@Override
////	public void onItemSelected(AdapterView<?> parent, View view, int position,
////			long id) {
////		String str = "这次妖精把" + items[position] + "抓住了！";
////		updateText(str);
////	}
//	
////	@Override
////	public void onClick(View v) {
////		String str = "";
////		if(tangseng.isChecked()) {
////			str += "唐僧~";
////		}
////		//悟空单选框被选中  
////        if(sunwukong.isChecked()){  
////            str += "孙悟空~";  
////        }  
////        //八戒单选框被选中  
////        if(zhubajie.isChecked()){  
////            str += "猪八戒~";  
////        }  
////        //沙僧单选框被选中  
////        if(shaheshang.isChecked()){  
////            str += "沙和尚~";  
////        }  
////        //没有人被选中  
////        if(str.equals("")){  
////            str += "没有人";  
////        }  
////        str +="被妖精抓走了！";
////        updateText(str);
////	}
//	
//	private void updateText(String string) {
//		textView.setText(string);
////		textView.setText(new Date().toString());
////		String editStr = editText.getText().toString();
////		if(editStr!=null && editStr.trim().length()>0) {
////			textView.setText(editStr);
////		} else {
////			textView.setText("你可别偷懒哦，貌似什么内容你也没填写！");
////		}
//	}
//
////	@Override
////	public void onNothingSelected(AdapterView<?> parent) {
////	}
//
//}
