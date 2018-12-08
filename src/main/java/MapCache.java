import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * 测试WeakHashMap
 */
public class MapCache {

    static class Key{
        String id;
        public Key(String id){
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }

        public String getId() {
            return id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        public boolean equals(Object r){
            return (r instanceof Key) && id.equals(((Key)r).id);
        }

        public void finalize(){
            System.out.println("Finalizing key :" + id);
        }
    }

    static class Value{
        String id;

        public Value(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }

        public void finalize(){
            System.out.println("Finalizing value :" + id);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int size = 1000;
        Key[] keys = new Key[size];
        WeakHashMap<Key , Value> whm = new WeakHashMap<>();
        for(int i = 0; i < size; i++){
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if(i % 3 == 0)
                keys[i] = k;
            whm.put(k , v);
        }

        System.gc();

        Thread.sleep(8000);

        Set<Map.Entry<Key , Value>> set = whm.entrySet();
        for(Map.Entry<Key , Value> entry :set){
            System.out.println("映射表中剩下的条目：" + entry.getKey() + ":" + entry.getValue());
            if(entry.getKey().getId() == String.valueOf(0)){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        System.out.println("映射表中还剩下" + whm.size() + "个条目");
        System.out.println(0 % 3);
    }

}
