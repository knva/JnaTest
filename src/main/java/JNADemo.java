import com.sun.jna.*;


public class JNADemo {
    /**
     * 若需要使用回调函数,需要先继承jna的callback 方法
     * 创建回调函数声明
     * by lichang
     *  c++ 库中声明如下
     *  typedef void (*CallbackFunc) (const char* data);
     *  所以在interface中创建
     *  void hello(String info)
     *  字段对应关系
     *  http://java-native-access.github.io/jna/5.6.0/javadoc/overview-summary.html#overview_description
     *  小节: Marshalling/Unmarshalling (Java/Native Type Conversions)
     */

    //继承Library，用于加载库文件
    public interface Clibrary extends Library {
         interface HelloCallbackListener extends Callback {
            void hello(String info);
        }

        interface RunCall extends Callback {
            void runCall(String info);
        }
        //加载dll链接库
        //不同平台需要不同的版本,可根据平台来判断
        //例如函数Platform.isWindows() 判断是否是windows
        JNADemo.Clibrary INSTANTCE = (JNADemo.Clibrary) Native.loadLibrary(
                "ctime" ,JNADemo.Clibrary.class);

        //此方法为链接库中的方法
        int hello(int a, String b);
        int helloCallback(  int a, String b,HelloCallbackListener c );
        void printHello();
        void testCallback();
        void testGetVal(Pointer t);

    }
}

