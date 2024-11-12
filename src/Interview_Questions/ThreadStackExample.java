package Interview_Questions;

    public class ThreadStackExample {
        private static int sharedValue = 0; // Shared variable in heap

        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    sharedValue++; // Modify shared variable
                    System.out.println("Thread 1: " + sharedValue);
                    try {
                        Thread.sleep(100); // Sleep to simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    sharedValue++; // Modify shared variable
                    System.out.println("Thread 2: " + sharedValue);
                    try {
                        Thread.sleep(100); // Sleep to simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    }


