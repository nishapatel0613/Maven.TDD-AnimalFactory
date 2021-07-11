package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    public Dog(String name) {

        super(name);
    }

    public Dog(String expectedName, Date expectedBirthDate, Integer expectedId) {
        super(expectedName,expectedBirthDate,expectedId);
    }

    public String speak() {

        return "bark!";
    }
}
