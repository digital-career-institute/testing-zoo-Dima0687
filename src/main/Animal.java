package src.main;

public class Animal {
  private String name;
  
  public Animal( String name ) {
    if(name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be empty");
    }
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
}
