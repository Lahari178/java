package thread;

class MyRunnable implements Runnable {
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunEx {
    public static void main(String[] args) {
        MyRunnable th = new MyRunnable(); 
        Thread thread = new Thread(th);  
        thread.start(); 
    }
}