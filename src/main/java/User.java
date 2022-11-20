public class User implements Runnable{
    private static final int TUMBLER_ON = 4;
    public static final int USER_WAIT = 2500;

    @Override
    public void run() {
        for (int i = 0; i < TUMBLER_ON; i++) {
            if (!Main.tumbler) {
                Main.tumbler = true;
                System.out.println("ON");
                try {
                    Thread.sleep(USER_WAIT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
