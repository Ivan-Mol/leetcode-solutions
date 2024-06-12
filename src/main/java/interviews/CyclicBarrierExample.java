package interviews;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class CyclicBarrierExample implements Runnable{
    private final CyclicBarrier b1;
    private final CyclicBarrier b2;
    public CyclicBarrierExample(CyclicBarrier b1, CyclicBarrier b2){
        this.b1=b1;
        this.b2=b2;
    }
    @Override
    public void run() {

        try {
            System.out.println("открыть дверь");
            b1.await();
            System.out.println("намазать");
            b2.await();
            System.out.println("приклеить");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CyclicBarrier b1=new CyclicBarrier(10);
        CyclicBarrier b2=new CyclicBarrier(10);
        IntStream.range(0,10).forEach((i)->
                new Thread(new CyclicBarrierExample(b1,b2)).start());
    }
}