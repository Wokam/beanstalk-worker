package com.wokam.beanstalk.worker;

/**
 * @author: Kamil Wojciech <wojciech.kamil@gmail.com>
 */
public class Application {

    public static void main(String[] args)
    {
//        String param = System.getProperty("max-threads");

        int maxThreads = 10;
        Worker worker = new Worker(maxThreads);
        worker.run();

//        if (param != null) {
//            maxThreads = Integer.parseInt(param);
//        }
    }
}
