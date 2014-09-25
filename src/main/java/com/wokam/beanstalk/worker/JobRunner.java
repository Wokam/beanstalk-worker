package com.wokam.beanstalk.worker;

/**
 * @author: Kamil Wojciech <wojciech.kamil@gmail.com>
 */
public class JobRunner extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }
    }
}
