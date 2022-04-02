package com.zhuys.module.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuys
 * @company tydic
 * @create 2022-03-30
 * 自旋锁测试
 */
public class ThreadSpinLockTest implements Runnable {
    static int sum;
    private SpinLock lock;
    public ThreadSpinLockTest(SpinLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        sum++;
        System.out.println(sum);
        lock.unLock();
    }

    public static void main(String[] args) throws Exception {
        Map<Integer,Integer> resMap = new HashMap<>();
        SpinLock lock = new SpinLock();
        for (int i = 0; i < 100; i++) {
            ThreadSpinLockTest test = new ThreadSpinLockTest(lock);
            Thread t = new Thread(test);
            t.start();
        }
    }
}
