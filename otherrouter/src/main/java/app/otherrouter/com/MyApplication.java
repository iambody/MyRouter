package app.otherrouter.com;

import android.app.Application;

import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.Route;

/**
 * desc
 * author wangyongkui  wangyongkui@simuyun.com
 * 日期 17/3/31-10:58
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Router.initialize(this);
    }
}
