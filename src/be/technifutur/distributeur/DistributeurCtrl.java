package be.technifutur.distributeur;

public class DistributeurCtrl implements StateControler{
    private boolean finish;
    public boolean isFinish(){
        return finish;
    }

    @Override
    public void start() {
        finish = false;
        System.out.println("distributeurCtrl.start");
    }

    @Override
    public void newInput(String input) {
        System.out.println(input);
        if("q".equals(input)){
            /*state.stop();
            state = null;*/
            finish = true;
        }

    }

    @Override
    public void stop() {
        System.out.println("DistributeurCtrl.stop");
        finish = true;
    }
}
