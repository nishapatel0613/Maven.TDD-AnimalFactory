package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String expectedName = "Simmi";
        Integer expectedId = 0;
        Date expectedDate = new Date(12-6-2019);
        Integer givenId = 0;
        Cat cat = new Cat(expectedName,expectedDate,expectedId);

        // When (a cat is constructed)

        // When (we retrieve data from the cat)
        String actual = cat.getName();
        Date actual1 = cat.getBirthDate();
        Integer actual2 = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedName, actual);
        Assert.assertEquals(expectedDate, actual1);
        Assert.assertEquals(expectedId, actual2);
    }
    @Test
    public void setNameTest(){

        String givenName = "Simmi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
       String expectedName = "Simmi";
        Cat cat = new Cat(givenName);

        cat.setName(expectedName);

        String actual = cat.getName();
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void speakTest(){
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(null);
        String givenSpeak = "meow!";

        String catSpeak = cat.speak();
        Assert.assertEquals(catSpeak, givenSpeak);

    }
    @Test
    public void setBirthDateTest(){
        String givenName = "Simmi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Date expectedDate = new Date(12-6-2019);

        Cat cat = new Cat(givenName);
        cat.setBirthDate(expectedDate);


        Date actual = cat.getBirthDate();

        Assert.assertEquals(actual,expectedDate);

    }
    @Test
    public void eatTest(){
        String givenName = "Cat food";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 1;
        Food food = new Food("Fancy feast",4,"Real meat", true);

        Cat cat = new Cat(givenName);
        cat.eat(food);

        Integer actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected,actual);


    }
    @Test
    public void getIdTest(){
        Cat cat = new Cat(null);

        Integer givenId = 0;

        Integer id = cat.getId();

        Assert.assertEquals(id,givenId);


    }
    @Test
    public void testInheritance(){
        Mammal cat = new Cat("Lucy");
        Assert.assertTrue(cat instanceof Mammal);
    }
    @Test
    public void testAnimal(){
        Animal cat = new Cat("Kitty");
        Assert.assertTrue(cat instanceof Animal);
    }


}
