/* 4. Write a program to create two Threads by extending from Thread class. And create two file like abc.txt file and xyz.txt file.
    • Thread1 should read data from abc.txt then it should read data from xyz.txt file and display on console.  
    • Thread2 should read data from xyz.txt then it should read data from abc.txt file and display on console.
    Create two synchronized blocks to achieve dead lock.  
*/
import java.io.*;

public class DeadLock {
    public static void main(String args[]) throws InterruptedException {
        File abc = new File("abc.txt");
        File xyz = new File("xyz.txt");

        Thread thread1 = new Thread1(abc, xyz);
        Thread thread2 = new Thread2(abc, xyz);

        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread {
    private File abc;
    private File xyz;

    public Thread1(File abc, File xyz) {
        this.abc = abc;
        this.xyz = xyz;
    }

    
    public void run() {
        synchronized (abc) {
            System.out.println("Thread 1: Locked abc");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (xyz) {
                System.out.println("Thread 1: Locked xyz");
                try {
    FileReader fis1 = new FileReader("xyz"); 
    BufferedReader reader = new BufferedReader(fis1);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("Thread 1: " + line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread2 extends Thread {
    private File abc;
    private File xyz;

    public Thread2(File abc, File xyz) {
        this.abc = abc;
        this.xyz = xyz;
    }

    
    public void run() {
        synchronized (xyz) {
            System.out.println("Thread 2: Locked xyz");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (abc) {
                System.out.println("Thread 2: Locked abc");
                try {
    FileReader fis1 = new FileReader("abc"); 
    BufferedReader reader = new BufferedReader(fis1);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("Thread 2: " + line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}