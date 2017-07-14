package com.example.firstactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,Main2Activity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }
    @Override
    protected void onRestart() {
         super.onRestart();
        Log.d("MainActivity","onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","Task id id"+getTaskId());
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2Activity.actionStart(MainActivity.this,"data1","data2");
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You Clicked add", Toast.LENGTH_SHORT).show();
                ;
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You Clicked remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
