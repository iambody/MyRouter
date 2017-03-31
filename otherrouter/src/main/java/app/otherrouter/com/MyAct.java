package app.otherrouter.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.chenenyu.router.Router;

/**
 * desc
 * author wangyongkui  wangyongkui@simuyun.com
 * 日期 17/3/31-10:50
 */

public class MyAct extends AppCompatActivity {
    private Button Otherbt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_main);
        Otherbt= (Button) findViewById(R.id.other_router_main_bt);
        Otherbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Router.build("m1").go(MyAct.this);
            }
        });
    }
}
