package src.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.*;

class ZooTest {
  @Test
  void createZooWithSpaceLimit() {
    Zoo zoo = new Zoo( 5 );
    assertEquals( 5, zoo.getSpace() );
    assertTrue( zoo.getAnimals().isEmpty() );
  }

  @Test
  void createZooWithNegativeSpaceLimit() {
    assertThrows( IllegalArgumentException.class, () -> new Zoo( -1 ) );
  }

  @Test
  void addAnimalToZoo() {
    Zoo zoo = new Zoo( 3 );
    Animal lion = new Animal( "Lion" );
    zoo.addAnimal( lion );
    assertEquals( 1, zoo.getAnimals().size() );
    assertTrue( zoo.getAnimals().contains( lion ) );
  }

  @Test
  void listAllAnimals() {
    Zoo zoo = new Zoo( 5 );
    Animal lion = new Animal( "Lion" );
    Animal zebra = new Animal( "Zebra" );
    Animal monkey = new Animal( "Monkey" );
    zoo.addAnimal( lion );
    zoo.addAnimal( zebra );
    zoo.addAnimal( monkey );
    assertEquals( "Lion, Monkey, Zebra", zoo.listAllAnimals() );
  }

  @Test
  void stopAddingAnimalsWhenZooIsFull() {
    Zoo zoo = new Zoo( 2 );
    Animal lion = new Animal( "Lion" );
    Animal tiger = new Animal( "Tiger" );
    Animal bear = new Animal( "Bear" );
    zoo.addAnimal( lion );
    zoo.addAnimal( tiger );
    assertThrows( IllegalStateException.class, () -> zoo.addAnimal( bear ) );
    assertEquals( 2, zoo.getAnimals().size() );
  }
}
