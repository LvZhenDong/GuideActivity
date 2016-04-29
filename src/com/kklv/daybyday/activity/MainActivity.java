package com.kklv.daybyday.activity;

import com.kklv.daybyday.R;
import com.kklv.daybyday.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Toolbar mToolbar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bindId();
		initToolbar();
	}
	
	private void bindId(){
		mToolbar=(Toolbar) findViewById(R.id.tb_main);
	}
	
	/**
	 * 初始化Toolbar
	 */
	private void initToolbar(){
		mToolbar.setNavigationIcon(R.drawable.ic_drawer_home);//导航图标
		mToolbar.setLogo(R.drawable.icon);//app logo
		mToolbar.setTitle("Title");//主标题
		mToolbar.setSubtitle("SubTitle");//子标题
		
		mToolbar.inflateMenu(R.menu.toolbar_menu);//设置右上角的填充菜单
		mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
			
			@Override
			public boolean onMenuItemClick(MenuItem arg0) {
				int menuItenId=arg0.getItemId();
				String toastStr="初始化ToastStr";
				switch (menuItenId) {
				case R.id.action_search:
					toastStr="search";
					break;
				case R.id.action_notification:
					toastStr="notification";
					break;
				case R.id.action_item1:
					toastStr="item1";
					break;
				case R.id.action_item2:
					toastStr="item2";
					break;

				default:
					break;
				}
				Toast.makeText(MainActivity.this, toastStr, Toast.LENGTH_SHORT).show();
				// TODO Auto-generated method stub
				return false;
			}
		});
	}
}
