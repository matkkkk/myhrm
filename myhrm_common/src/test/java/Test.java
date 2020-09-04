import com.libra.common.utils.SnowFlakeIdWorker;

public class Test {

    @org.junit.Test
    public void test1(){
        SnowFlakeIdWorker snowFlakeIdWorker = new SnowFlakeIdWorker(1,1,1);
        System.out.println();
        long id = snowFlakeIdWorker.nextId();
        System.out.println(Long.toBinaryString(id));
    }
}
