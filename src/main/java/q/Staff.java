package q;

class Staff extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(4000);                                 //через 2 сек сотрудники стали брать звонки
            while (Main.callQueue.peek() != null) {
                Thread.sleep(4000);                             //имитация обработки звонка 4сек
                long telNumber = Main.callQueue.remove();
                System.out.println("Вызов  " + telNumber + " обработан");
            }
        } catch (InterruptedException err) {
        }
    }
}