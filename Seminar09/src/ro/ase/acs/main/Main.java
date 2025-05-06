package ro.ase.acs.main;

import ro.ase.acs.composite.EmailAddress;
import ro.ase.acs.composite.EmailGroup;
import ro.ase.acs.composite.EmailReceiver;
import ro.ase.acs.decorator.Car;
import ro.ase.acs.decorator.CarWithAlarm;
import ro.ase.acs.decorator.CarWithSportSeats;
import ro.ase.acs.decorator.Vehicle;
import ro.ase.acs.flyweight.CharacterPosition;
import ro.ase.acs.flyweight.CustomCharacterFactory;
import ro.ase.acs.flyweight.TextCharacter;

public class Main {
    public static void main(String[] args) {
        EmailReceiver group1087 = new EmailGroup();
        EmailReceiver student1 = new EmailAddress("ion.popescu@stud.ase.ro");
        EmailReceiver student2 = new EmailAddress("maria.ionescu@stud.ase.ro");
        group1087.addReceiver(student1);
        group1087.addReceiver(student2);
        EmailReceiver seriesC = new EmailGroup();
        seriesC.addReceiver(group1087);
        seriesC.addReceiver(new EmailAddress("secretariat@csie.ase.ro"));
        seriesC.receive("Bursele au fost platite");

        CustomCharacterFactory factory = new CustomCharacterFactory();
        TextCharacter textCharacter1 = factory.getCharacter('a');
        textCharacter1.display(new CharacterPosition(1, 1));

        TextCharacter textCharacter2 = factory.getCharacter('b');
        textCharacter2.display(new CharacterPosition(1, 2));

        TextCharacter textCharacter3 = factory.getCharacter('a');
        textCharacter3.display(new CharacterPosition(1, 3));

        System.out.println(factory.getCharactersCreated());

        Vehicle car = new Car();
        car.start();
        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.activateAlarm();

        CarWithSportSeats carWithSportSeatsAndAlarm =
                new CarWithSportSeats(carWithAlarm);
        carWithSportSeatsAndAlarm.setSeatProducer("Recaro");
        System.out.println(carWithSportSeatsAndAlarm.getSeatProducer());
        carWithSportSeatsAndAlarm.stop();
    }
}
