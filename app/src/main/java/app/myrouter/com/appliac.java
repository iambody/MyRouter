package app.myrouter.com;

import android.app.Application;

import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.Route;

/**
 * desc
 * author wangyongkui  wangyongkui@simuyun.com
 * 日期 17/3/31-09:44
 */

public class appliac extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Router.initialize(this);
    }
}
