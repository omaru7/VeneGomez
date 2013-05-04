package com.VeneGomez.solartechaid;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_third);
	}

	public void solve(View view) {

		EditText inputEquation1 = (EditText) findViewById(R.id.inputEquation1);
		String checker = inputEquation1.getText().toString();
		if( checker.isEmpty())
		{
			checker ="0";
			inputEquation1.setText(checker);
		}
		double answer = square(inputEquation1);
		TextView solution1 = (TextView ) findViewById(R.id.solution1);
		String answerText = Double.toString(answer);
		solution1.setTextColor(Color.RED);
		solution1.setText(answerText);
	}

	public double square( EditText text ) {

		double square = Double.parseDouble(text.getText().toString());
		return square * square;
	}



}
