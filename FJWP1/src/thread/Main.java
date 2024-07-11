package thread;
class MyThread extends Thread {

 public void run() {
     for (int i = 0; i < 5; i++) {
         System.out.println("Thread is running: " + i);
         try {
             //  1 sec Sleep
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

public class Main {
 public static void main(String[] args) {
     MyThread myThread = new MyThread();
     myThread.start(); 
 }
}