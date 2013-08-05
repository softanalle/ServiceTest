package com.softanalle.servicetest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

	private Button btnLogin_, btnDo_;
	private EditText editText_;
	private ProgressBar progressBar_;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnLogin_ = (Button) findViewById(R.id.btnLogin);
        btnDo_ = (Button) findViewById(R.id.btnDo);
        progressBar_ = (ProgressBar) findViewById(R.id.progressBar1);
        editText_ = (EditText) findViewById(R.id.editText1);
        
        progressBar_.setIndeterminate(false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
