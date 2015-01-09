package com.example.androidpagejump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SendResultActivity extends Activity {

	private Button rst1;
	private Button rst2;
	private final static int RESULTCODE_TEST = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sendresult);

		rst1 = (Button) findViewById(R.id.rst1);
		rst2 = (Button) findViewById(R.id.rst2);

		rst1.setOnClickListener(mCrokyListener);
		rst2.setOnClickListener(mViolettener);
	}

	private OnClickListener mCrokyListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			// 返回参数
			Intent it = new Intent();
			it.putExtra("data", "1233344");
			setResult(RESULTCODE_TEST, it);
			finish();

			// 动作类型：
			// setResult(RESULT_OK, (new Intent()).setAction("Corky!"));
			// finish();

		}

	};
	private OnClickListener mViolettener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent it = new Intent();
			it.putExtra("data", "6768888888");
			setResult(RESULTCODE_TEST, it);
			finish();

			// 动作类型：
			// setResult(RESULT_OK, (new Intent()).setAction("Violet!"));
			// finish();

		}

	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recieve, menu);
		return true;
	}

}
