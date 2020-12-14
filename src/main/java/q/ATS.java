package q;

class ATS extends Thread {

    @Override
    public void run() {
        try {
            int i = 60;                                                    //количество звонков АТС
            while (i > 0) {
                Thread.sleep(1000);
                long telNumber = Math.round(Math.random() * 1000000);      //тут генерим входящие телефонные номера
                System.out.println("Всем привет! Позвонил " + telNumber);
                Main.callQueue.add(telNumber);
                i--;
            }
        } catch (InterruptedException err) {
        }
    }
}