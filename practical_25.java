class TablePrinter {

    // Synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400); // small delay to demonstrate synchronization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // spacing between tables
    }
}

class MyThread extends Thread {
    TablePrinter printer;
    int number;

    MyThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    public void run() {
        printer.printTable(number);
    }
}

public class SyncTableExample {
    public static void main(String[] args) {

        TablePrinter printer = new TablePrinter();

        MyThread t1 = new MyThread(printer, 5); // Table of 5
        MyThread t2 = new MyThread(printer, 7); // Table of 7

        t1.start();
        t2.start();
    }
}
