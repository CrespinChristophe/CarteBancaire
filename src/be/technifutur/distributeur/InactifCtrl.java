package be.technifutur.distributeur;

public class InactifCtrl implements StateControler{

    @Override
    public void start() {
        System.out.println("InactifCtrl.start");
    }

    @Override
    public void newInput(String input) {
        System.out.println("InactifCtrl.newInput");
    }

    @Override
    public void stop() {
        System.out.println("InactifCtrl.stop");
    }
}
