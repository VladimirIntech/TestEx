public class waitT {
// Таймер
    public void waitTime(int pause) {

        try {
            Thread.sleep(pause * 1000);
            //Thread.sleep((long), pause*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
