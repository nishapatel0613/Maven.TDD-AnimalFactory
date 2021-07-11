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
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 1;
        DogHouse.add(animal);

        // When
        DogHouse.getNumberOfDogs();
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void addTest(){
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 0;
        DogHouse.add(animal);

        // When
        DogHouse.add(animal);
      int actual= DogHouse.add(animal);


        // Then
        Assert.assertEquals(expected,actual);


    }
    @Test
    public void removeTest(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 0;
        DogHouse.add(animal);

        // When
        DogHouse.remove(animal);
        int actual= DogHouse.remove(animal);


        // Then
        Assert.assertEquals(expected,actual);

    }

     @Test
    public void getDogByIdTest(){
         String name = "Uno";
         Date birthDate = new Date(12-6-2019);
         int id = 0;
         Dog dog = new Dog(name,birthDate,id);
         DogHouse.clear();

         DogHouse.add(dog);

         // When
         Animal actual=  DogHouse.getDogById(id);


         // Then
         Assert.assertEquals(dog,actual);

    }
    @Test
    public void getNumberOfDogsTest(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 1;
        DogHouse.add(animal);

        // When
        DogHouse.getNumberOfDogs();
        int actual= DogHouse.getNumberOfDogs();


        // Then
        Assert.assertEquals(expected,actual);

    }
}
