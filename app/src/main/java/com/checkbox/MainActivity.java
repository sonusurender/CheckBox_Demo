package com.checkbox;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	CheckBox check1, check2, check3, check4, check5, check6, check7, check8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Getting all checkbox IDs
		check1 = (CheckBox) findViewById(R.id.checkBox1);
		check2 = (CheckBox) findViewById(R.id.checkBox2);
		check3 = (CheckBox) findViewById(R.id.checkBox3);
		check4 = (CheckBox) findViewById(R.id.checkBox4);
		check5 = (CheckBox) findViewById(R.id.checkBox5);
		check6 = (CheckBox) findViewById(R.id.checkBox6);
		check7 = (CheckBox) findViewById(R.id.checkBox7);
		check8 = (CheckBox) findViewById(R.id.checkBox8);

		// Implementing click listener on button
		findViewById(R.id.click).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				// String buffer to store to append many strings into one
				StringBuffer result = new StringBuffer();

				// Appending checkBox text and its checked or not (boolean)
				result.append(check1.getText() + " : ").append(
						check1.isChecked());
				result.append("\n" + check2.getText() + " : ").append(
						check2.isChecked());
				result.append("\n" + check3.getText() + " : ").append(
						check3.isChecked());
				result.append("\n" + check4.getText() + " : ").append(
						check4.isChecked());

				// Displaying string buffer
				Toast.makeText(MainActivity.this, result.toString(),
						Toast.LENGTH_LONG).show();

			}
		});

		// Implementing click listeners on other check boxes
		check5.setOnClickListener(this);
		check6.setOnClickListener(this);
		check7.setOnClickListener(this);
		check8.setOnClickListener(this);

		// You can use this method also to check whether the check box is
		// checked or not
		/*
		 * check5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		 * 
		 * @Override public void onCheckedChanged(CompoundButton arg0, boolean
		 * ischeced) { if(ischeced){ Toast.makeText(MainActivity.this,
		 * check5.getText() + " : " + check5.isChecked(),
		 * Toast.LENGTH_LONG).show();
		 * 
		 * } else{ Toast.makeText(MainActivity.this, check5.getText() + " : " +
		 * check5.isChecked(), Toast.LENGTH_LONG).show(); }
		 * 
		 * } });
		 */
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		// Displaying a toast on particular check box clicked with its name and
		// checked or not (boolean)
		case R.id.checkBox5:

			Toast.makeText(MainActivity.this,
					check5.getText() + " : " + check5.isChecked(),
					Toast.LENGTH_LONG).show();

			break;

		case R.id.checkBox6:
			Toast.makeText(MainActivity.this,
					check6.getText() + " : " + check6.isChecked(),
					Toast.LENGTH_LONG).show();

			break;
		case R.id.checkBox7:
			Toast.makeText(MainActivity.this,
					check7.getText() + " : " + check7.isChecked(),
					Toast.LENGTH_LONG).show();

			break;
		case R.id.checkBox8:
			Toast.makeText(MainActivity.this,
					check8.getText() + " : " + check8.isChecked(),
					Toast.LENGTH_LONG).show();

			break;

		}

	}

}
