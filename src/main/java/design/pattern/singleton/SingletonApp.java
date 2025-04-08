package design.pattern.singleton;

import java.util.logging.Logger;

public class SingletonApp {


    static Logger logger = Logger.getLogger(SingletonApp.class.getName());


    public static void main(String[] args) {

        logger.info("If we see the same value, then singleton was reused,if we see different value," +
                        " then 2 singleton were created"  +
                        "RESULT: ");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }



    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        }
    }
}
