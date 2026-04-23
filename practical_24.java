class SequentialThreads {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 101; i <= 200; i++) {
                System.out.println(i);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 201; i <= 300; i++) {
                System.out.println(i);
            }
        });

        try {
            // Start T1 and wait for it to finish
            t1.start();
            t1.join();

            // Start T2 and wait for it to finish
            t2.start();
            t2.join();

            // Start T3 after T2 finishes
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
