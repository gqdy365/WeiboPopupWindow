package com.jerome.weibo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView image;
	MoreWindow mMoreWindow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		image = (ImageView) findViewById(R.id.show);
		image.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				showMoreWindow(v);
			}
		});
	}

	private void showMoreWindow(View view) {
		if (null == mMoreWindow) {
			mMoreWindow = new MoreWindow(this);
			mMoreWindow.init();
		}

		mMoreWindow.showMoreWindow(view,100);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
