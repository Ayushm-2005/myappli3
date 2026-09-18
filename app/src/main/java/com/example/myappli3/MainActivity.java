package com.example.myappli3;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "LifecycleDemo";
    private TextView logView;

    private void appendLog(String event) {
        logView.append(event + "\n");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logView = findViewById(R.id.logview);
        appendLog("onCreate()" + "\n");
        Toast.makeText(this, "onCreate called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        appendLog("onStart()" + "\n");
        Toast.makeText(this, "onStart called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        appendLog("onResume()" + "\n");
        Toast.makeText(this, "onResume called",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        appendLog("onPause()" + "\n");
        Toast.makeText(this, "onPause called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        appendLog("onStop()" + "\n");
        Toast.makeText(this, "onStop called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        appendLog("onRestart()" + "\n");
        Toast.makeText(this, "onRestart called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        appendLog("onDestroy()" + "\n");
        Toast.makeText(this, "onDestroy called",
                Toast.LENGTH_LONG).show();
    }
}