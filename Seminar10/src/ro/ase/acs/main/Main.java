package ro.ase.acs.main;

import ro.ase.acs.chain.CallCenterHandler;
import ro.ase.acs.chain.CallCenterManager;
import ro.ase.acs.chain.CallCenterOfficer;
import ro.ase.acs.chain.CallCenterOperator;
import ro.ase.acs.command.BurgerOrder;
import ro.ase.acs.command.Chef;
import ro.ase.acs.command.PizzaOrder;
import ro.ase.acs.command.Waiter;
import ro.ase.acs.observer.YouTubeChannel;
import ro.ase.acs.observer.YouTubeSubscriber;
import ro.ase.acs.strategy.Calculator;
import ro.ase.acs.strategy.Product;
import ro.ase.acs.strategy.Sum;

public class Main {
    public static void main(String[] args) {

        CallCenterHandler operator = new CallCenterOperator();
        CallCenterHandler officer = new CallCenterOfficer();
        CallCenterHandler manager = new CallCenterManager();
        operator.setNextHandler(officer);
        officer.setNextHandler(manager);

        operator.refund(70);
        operator.refund(150);
        operator.refund(600);

        Chef chef=new Chef();
        BurgerOrder burger=new BurgerOrder(chef);
        PizzaOrder pizza=new PizzaOrder(chef);
        Waiter waiter=new Waiter();
        waiter.addOrder(burger);
        waiter.addOrder(pizza);
        waiter.sendOrders();
        PizzaOrder otherPizza=new PizzaOrder(chef);
        waiter.addOrder(otherPizza);
        waiter.sendOrders();

        Calculator calculator = new Calculator();
        calculator.setOperation(new Sum());
        double result = calculator.compute(1, 2, 3, 4);
        System.out.println(result);
        calculator.setOperation(new Product());
        result = calculator.compute(1, 2, 3, 4);
        System.out.println(result);

        calculator.setOperation(x->x.stream().mapToInt(i->i).average().getAsDouble());
        result = calculator.compute(1, 2, 3, 4);
        System.out.println(result);

        YouTubeChannel channel=new YouTubeChannel("Recorder");
        YouTubeSubscriber subscriber1=new YouTubeSubscriber();
        YouTubeSubscriber subscriber2=new YouTubeSubscriber();
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.publishVideo("Portret de candidat");
        channel.unsubscribe(subscriber2);
        channel.publishVideo("Ancheta jurnalistica");


    }
}
