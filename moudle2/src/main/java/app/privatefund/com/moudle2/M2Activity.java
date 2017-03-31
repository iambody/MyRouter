package app.privatefund.com.moudle2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.chenenyu.router.annotation.Route;

/**
 * desc
 * author wangyongkui  wangyongkui@simuyun.com
 * 日期 17/3/31-09:35
 */
@Route("m2")
public class M2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2_a);
//        Mybt=findViewById(R.id.mybb);
    }
}
