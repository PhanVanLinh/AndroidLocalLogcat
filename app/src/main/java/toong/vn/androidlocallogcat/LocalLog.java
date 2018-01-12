package toong.vn.androidlocallogcat;

/**
 * Created by PhanVanLinh on 12/01/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class LocalLog {
    private StringBuilder stringBuilder = new StringBuilder();
    private static volatile LocalLog instance = null;

    private LocalLog() {
    }

    public static LocalLog getInstance() {
        if (instance == null) { // first check
            synchronized (LocalLog.class) {
                if (instance == null) { // second check
                    instance = new LocalLog();
                }
            }
        }
        return instance;
    }

    public void i(String TAG, String message) {
        if(BuildConfig.DEBUG){
            stringBuilder.append(TAG + message);
        }
    }
}
