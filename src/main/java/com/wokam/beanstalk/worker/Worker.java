package com.wokam.beanstalk.worker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Kamil Wojciech <wojciech.kamil@gmail.com>
 */
public class Worker {

    private List<Thread> threads = new ArrayList<Thread>();

    private int maxThreads;

    public Worker(int maxThreads) {
        this.maxThreads = maxThreads;
    }

    public void run() {

        while (true) {

            List<Thread> toRemove = new ArrayList<Thread>();

            for (Thread item : this.threads) {
                System.out.print(item.getId() + "; ");
                System.out.print(item.getName() + "; ");
                System.out.println("is alive: " + item.isAlive());
                if (!item.isAlive()) {
                    toRemove.add(item);
                }
            }

            this.threads.removeAll(toRemove);

            if (this.threads.size() < this.maxThreads) {
                Thread thread = new JobRunner();
                thread.start();
                this.threads.add(thread);
            }


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.print(e.getMessage());
            }
        }
    }
}
