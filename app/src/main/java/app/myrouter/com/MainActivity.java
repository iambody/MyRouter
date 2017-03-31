package app.myrouter.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.Route;

public class MainActivity extends AppCompatActivity {
private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1= (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Router.build("m1").go(MainActivity.this);
            }
        });
    }
}
