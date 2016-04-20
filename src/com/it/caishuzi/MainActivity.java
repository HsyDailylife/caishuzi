package com.it.caishuzi;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	int rand;

	public void startGame(View view) {
		EditText numb1Et = (EditText) findViewById(R.id.numb1_et);
		EditText numb2Et = (EditText) findViewById(R.id.numb2_et);
		int numb1 = Integer.parseInt(numb1Et.getText().toString());
		int numb2 = Integer.parseInt(numb2Et.getText().toString());

		if (numb1 >= numb2) {
			Toast.makeText(this, "第一个数字必须小于第二个数字", 0).show();
		} else {
			rand = new Random().nextInt(numb2 - numb1) + numb1;
			System.out.println(rand);
		}

	}

	public void submit(View view) {
		EditText resEt = (EditText) findViewById(R.id.res_et);
		int res = Integer.parseInt(resEt.getText().toString());
		if (res == rand) {
			Toast.makeText(this, "恭喜", 0).show();
		} else if (res > rand) {
			Toast.makeText(this, "大了", 0).show();
		} else {
			Toast.makeText(this, "小了", 0).show();
		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
