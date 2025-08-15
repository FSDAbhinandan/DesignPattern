package creational.Singelton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singelton {

    private static Singelton instance;
    private static final Lock lock = new ReentrantLock();

    private Singelton(){}

    public static Singelton getInstance(){
        if(instance==null){
            lock.lock();
            try {
                if(instance == null) {
                    instance = new Singelton();
                }
            }
            finally {
                lock.unlock();
            }
        }
        return instance;
    }
}
