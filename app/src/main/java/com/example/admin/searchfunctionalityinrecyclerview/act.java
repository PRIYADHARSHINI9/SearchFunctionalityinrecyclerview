package com.example.admin.searchfunctionalityinrecyclerview;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class act  extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shadow);
        findViewById(R.id.raise).setOnClickListener(this);
        findViewById(R.id.lower).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int elevation = Integer.parseInt(((TextView) findViewById(R.id.label)).getText().toString());
        if (v.getId()==R.id.raise) {
            elevation+=5;
        } else {
            elevation-=5;
        }
        if (elevation<0) {
            elevation=0;
        } else if (elevation>100) {
            elevation=100;
        }
        findViewById(R.id.img).setElevation(elevation);
        ((TextView) findViewById(R.id.label)).setText(Integer.toString(elevation));
    }
}
