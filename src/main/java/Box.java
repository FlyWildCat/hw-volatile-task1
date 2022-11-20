public class Box implements Runnable{
    public static final int BOX_WAIT = 500;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.tumbler) {
                Main.tumbler = false;
                System.out.println("OFF");
                try {
                    Thread.sleep(BOX_WAIT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
