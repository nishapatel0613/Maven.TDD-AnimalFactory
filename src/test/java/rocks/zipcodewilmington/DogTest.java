package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void newDogTest() {

        String expectedName = "Uno";
        Date expectedBirthDate = new Date(12-6-2019);
        Integer expectedId = 0;
        Integer givenId = 0;


        Dog dog = new Dog(expectedName,expectedBirthDate,expectedId);


        String actual = dog.getName();
        Date actual1 = dog.getBirthDate();
        Integer actual2 = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedName, actual);
        Assert.assertEquals(expectedBirthDate, actual1);
        Assert.assertEquals(expectedId, actual2);
    }
    @Test
    public void speakTest(){

        Dog dog = new Dog(null);

        String givenSpeak = "bark!";

        String dogSpeak = (dog.speak());

        Assert.assertEquals(dogSpeak,givenSpeak);

    }

    @Test
    public void setBirthDateTest(){
        String givenName = "Uno";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Date expectedDate = new Date(12-6-2019);

        Dog dog = new Dog(givenName);
        dog.setBirthDate(expectedDate);


        Date actual = dog.getBirthDate();

        Assert.assertEquals(actual,expectedDate);
    }

    @Test
    public void eatTest(){
        String givenName = "Dog food";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 1;
        Food testFood = new Food("Blue Buffalo",4,"Real meat", true);

        Dog dog = new Dog(givenName);
        dog.eat(testFood);

        Integer actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getIdTest(){
        Dog dog = new Dog(null);

        Integer givenId = 0;

        Integer id = dog.getId();

        Assert.assertEquals(id,givenId);
    }
    @Test
    public void testInheritance(){
        Mammal dog = new Dog("Pepper");
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void testAnimal(){
        Animal dog = new Dog("Bingo");
        Assert.assertTrue(dog instanceof Animal);
    }


}
