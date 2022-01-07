class CreateThread extends Thread {
    int value;

    CreateThread(int value) {
        this.value = value;
    }

    public void run() {
        try {
            int sleepingTime = this.value;
            Thread.sleep(1000L * sleepingTime);
            System.out.println(this.value + " ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class SleepSort {
    public static void main(String[] args) {
        int[] values = { 5, 3, 3, 2, 1, 1, 3, 7, 11 };
        for (int x : values) {
            new CreateThread(x).start();
        }
    }
}