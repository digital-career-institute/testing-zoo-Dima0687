package src.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {
  private int space;
  private List< Animal > animals;

  public Zoo( int space ) {
    if ( space <= 0 ) {
      throw new IllegalArgumentException( "Space limit must be a positive number" );
    }
    this.space = space;
    this.animals = new ArrayList<>();
  }

  public void addAnimal( Animal animal ) {
    if ( animals.size() < space ) {
      animals.add( animal );
    } else {
      throw new IllegalStateException( "The zoo is full!" );
    }
  }

  public String listAllAnimals() {
    List< String > animalNames = new ArrayList<>();
    for ( Animal animal : animals ) {
      animalNames.add( animal.getName() );
    }
    Collections.sort( animalNames );
    return String.join( ", ", animalNames );
  }

  public String checkFreeSpace() {
    int freeSpaces = space - animals.size();
    if ( freeSpaces == 0 ) {
      return "The zoo is full!";
    } else {
      return "The zoo has " + freeSpaces + " free spaces!";
    }
  }

  public int getSpace() {
    return space;
  }

  public List< Animal > getAnimals() {
    return animals;
  }

  public static void main( String[] args ) {
    Zoo zoo = new Zoo(5);
    zoo.addAnimal( new Animal( "Bear"  ));
    zoo.addAnimal( new Animal( "Tiger"  ));
    zoo.addAnimal( new Animal( "Monkey"  ));
    zoo.addAnimal( new Animal( "Zebra"  ));
  }
}
