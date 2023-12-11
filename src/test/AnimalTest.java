package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.Animal;

public class AnimalTest {
	
	@Test
	void hasName() {
		Animal animal = new Animal("Tiger");
		assertEquals("Tiger", animal.getName());
	}
	
	@Test
	void createAnimalWithEmptyName() {
	  assertThrows(IllegalArgumentException.class, () -> new Animal(""));
	}
}