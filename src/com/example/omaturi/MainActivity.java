package com.example.omaturi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;




public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		 //�ｽ�ｽﾊ遷�ｽﾚの擾ｿｽ�ｽ�ｽ
	    ImageButton btn = (ImageButton)findViewById(R.id.imageButton2);
	    btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO �ｽ�ｽ�ｽ�ｽ�ｽ�ｽ�ｽ�ｽ�ｽ�ｽ�ｽ黷ｽ�ｽ�ｽ�ｽ\�ｽb�ｽh�ｽE�ｽX�ｽ^�ｽu
				Intent intent = new Intent(MainActivity.this,Zukan.class);
				startActivity(intent);
			}
	    });
	}


}
