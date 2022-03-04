package be.technifutur.distributeur;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DistributeurCtrl ctrl = getDistributeurCtrl();
        ctrl.start();
        while(!ctrl.isFinish()){
            ctrl.newInput(scan.nextLine());
        }
        ctrl.stop();
    }

    private static DistributeurCtrl getDistributeurCtrl() {

        DistributeurCtrl distributeurCtrl = new DistributeurCtrl();
        return new DistributeurCtrl();
    }
}

