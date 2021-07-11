package rocks.zipcodewilmington.animals.animal_storage;

import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;

/**
 * @author leon on 4/19/18.
 */
public class DogHouse {
    private static AnimalWarehouse<Dog> dogHouse = new AnimalWarehouse<>();

    public static int add(Dog dog) {
        dogHouse.add(dog);
        return 0;
    }

    public static void remove(Integer id) {
        dogHouse.removeAnimalById(id);
    }

    public static int remove(Dog dog) {

        dogHouse.removeAnimal(dog);

        return 0;
    }

    public static Animal getDogById(Integer id) {
        return dogHouse.getAnimalById(id);
    }

    public static Integer getNumberOfDogs() {
        return dogHouse.getNumberOfAnimals();
    }

    public static void clear() {
        dogHouse.clear();
    }


    public static int add() {
        return add();
    }
}
