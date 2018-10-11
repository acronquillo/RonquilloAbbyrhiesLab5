package abbyrhies.ronquillo.com.ronquilloabbyrhieslab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        setTitle("Activity 2");
        Log.d("4ITH", "onCreate() has successfully executed");
        Intent i = new Intent(this, Service.class);
        startService(i);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("4ITH","onResume() has successfully executed");
        Intent i = new Intent(this, Service.class);
        startService(i);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("4ITH","onPause() has successfully executed");
        Intent i = new Intent(this, Service.class);
        startService(i);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("4ITH","onStop() has successfully executed");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("4ITH","onDestroy() has successfully executed");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("4ITH","onRestart() has successfully executed");
        Intent i = new Intent(this, Service.class);
        startService(i);
    }

    public void process(View v)
    {
        Intent i = null;
        Intent chooser = null;


        if(v.getId()==R.id.act1)
        {
            i = new Intent(this,Activity1.class);
            startActivity(i);
        }

        else if(v.getId()==R.id.btnMap2)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 11.164976, 119.397253"));
            chooser = Intent.createChooser(i,"Select a map");
            startActivity(chooser);
        }
    }

}