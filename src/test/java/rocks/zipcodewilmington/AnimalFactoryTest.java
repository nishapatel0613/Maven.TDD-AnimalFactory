package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void AnimalCreateDogTest(){
        String name = "Uno";
        Date birthDate = new Date(12-6-2019);
        Dog dog =AnimalFactory.createDog(name, birthDate);;
        int expected = 0;


        // When
        int actual= AnimalFactory.add(dog);


        // Then
        Assert.assertEquals(expected,actual);


    }
    @Test
    public void AnimalCreateCatTest(){
        String name = "Simmi";
        Date birthDate = new Date(12-6-2019);
        Cat cat = AnimalFactory.createCat(name, birthDate);
        int expected = 0;


        // When
        int actual= AnimalFactory.add(cat);


        // Then
        Assert.assertEquals(expected,actual);

    }
}
