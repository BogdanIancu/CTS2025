package ro.ase.acs.main;

import ro.ase.acs.memento.VideoEditor;
import ro.ase.acs.state.VendingMachine;
import ro.ase.acs.template.FactoryWorker;
import ro.ase.acs.template.PartMover;
import ro.ase.acs.template.RoboticArm;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(10);
        vendingMachine.selectProduct(5);
        System.out.println();
        vendingMachine.inputMoney(3);
        vendingMachine.selectProduct(3);

        VideoEditor videoEditor = new VideoEditor();
        videoEditor.edit(5);
        videoEditor.save();
        System.out.println(videoEditor);
        videoEditor.edit(3);
        System.out.println(videoEditor);
        videoEditor.undo();
        System.out.println(videoEditor);

        PartMover partMover = new RoboticArm();
        partMover.move();
        partMover = new FactoryWorker();
        partMover.move();
    }
}