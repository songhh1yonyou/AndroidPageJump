package com.example.androidpagejump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class RecieveActivity extends Activity {

	private TextView reciveText;
	private Button reciveBtn;

	static final private int GET_CODE = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recieve);

		reciveText = (TextView) findViewById(R.id.reciveText);

		reciveBtn = (Button) findViewById(R.id.reciveBtn);

		reciveBtn.setOnClickListener(getResultListener);

	}

	OnClickListener getResultListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(RecieveActivity.this,
					SendResultActivity.class);
			startActivityForResult(intent, GET_CODE);
		}
	};

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub

		if (requestCode == GET_CODE) {
		
			
		//	TextView text = (TextView) reciveText.getText();
			TextView text =reciveText;
			if (resultCode == RESULT_CANCELED) {
				text.append("(cancle)");
			} else {
				text.append("(okay");
				text.append(Integer.toString(resultCode));
				text.append(")");
				if (data != null) {
					text.append(data.getAction());
				}
			}
			text.append("\n");

		}
	//	super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recieve, menu);
		return true;
	}

}
