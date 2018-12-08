import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * 引用测试
 */
public class ReferenceTest {

    public static void main(String[] args) {
        String str = new String("hello");
        ReferenceQueue<String> rq = new ReferenceQueue<>();
        WeakReference<String> wf = new WeakReference<>(str , rq);

        str = null;

        System.gc();
        System.gc();

        String str1 = wf.get();
        System.out.println(str1);

        Reference<? extends String> ref = rq.poll();
        System.out.println(ref);
    }

}
