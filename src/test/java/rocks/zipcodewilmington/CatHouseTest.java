package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void add(){
        String name = "Simmi";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int expected = 0;
        CatHouse.add(animal);

        // When
        int actual= CatHouse.add(animal);


        // Then
        Assert.assertEquals(expected,actual);



    }
    @Test
    public void remove(){
        String name = "Simmi";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int expected = 0;
        CatHouse.add(animal);

        // When
        int actual= CatHouse.remove(animal);


        // Then
        Assert.assertEquals(expected,actual);

    }

     @Test
    public void getCatById(){
        String name = "Simmi";
        Date birthDate = new Date(12-6-2019);
        int id = 0;
        Cat cat = new Cat(name,birthDate,id);
        CatHouse.clear();

        CatHouse.add(cat);

        // When
        Cat actual=  CatHouse.getCatById(id);


        // Then
        Assert.assertEquals(cat,actual);



    }
    @Test
    public void getNumberOfCats(){
        String name = "Simmi";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int expected = 1;
        CatHouse.add(animal);

        // When
        int actual= CatHouse.getNumberOfCats();


        // Then
        Assert.assertEquals(expected,actual);


    }


}
