import com.sun.javafx.scene.paint.GradientUtils;
import com.sun.jna.*;

public class CTest {

    public static void main(String[] args) {

//        /**
//         * 调用传参
//         */
//        System.out.println("****** call test start     ******");
//        JNADemo.Clibrary.INSTANTCE.hello(1,"hello");
//
//
//        /**
//         * 传递回调函数
//         */
//        System.out.println("****** callback test start ******");
//
//        JNADemo.Clibrary.INSTANTCE.helloCallback(2, "world", new JNADemo.Clibrary.HelloCallbackListener() {
//            public void hello(String info) {
//                System.out.println("callback:"+info);
//            }
//        });
//        /**
//         * 直接调用
//         */
//        JNADemo.Clibrary.INSTANTCE.printHello();
//        /**
//         * callback
//         */
//        JNADemo.Clibrary.RunCall runCall =new JNADemo.Clibrary.RunCall() {
//            public void runCall(String info) {
//                System.out.println("over");
//            }
//        };
//
//        JNADemo.Clibrary.INSTANTCE.testCallback();
        /**
         * 调用传参
         */
        System.out.println("****** call test start     ******");
        Pointer p =new Memory(30);
        JNADemo.Clibrary.INSTANTCE.testGetVal(p);
        System.out.println(p.getPointer(0).getString(0));



    }

}
