package app.privatefund.com.moudle1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.Route;

/**
 * desc
 * author wangyongkui  wangyongkui@simuyun.com
 * 日期 17/3/31-09:32
 */
@Route("m1")
public class M1Activity extends AppCompatActivity {
    private Button Mybt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);
        Mybt= (Button) findViewById(R.id.mybb);
        Mybt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Router.build("m2").go(M1Activity.this);
            }
        });
    }
}
