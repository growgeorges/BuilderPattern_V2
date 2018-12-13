package Tests;

import API.Meal;
import Implementation.MealImpl;

import static org.junit.jupiter.api.Assertions.*;

class MealImplTest {

    private Meal meal1, meal2;
    final private int nbPersons = 4;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception{
        meal1 = new MealImpl.MeatBuilder(nbPersons).build();
        meal2 = new MealImpl.MeatBuilder(-1).setLocation("ChezFAFA").build();
    }

    @org.junit.jupiter.api.Test
    void getNumberOfPersons() {
        assertEquals(4, meal1.getNumberOfPersons());
        assertEquals(-1, meal2.getNumberOfPersons());
    }

    @org.junit.jupiter.api.Test
    void getLocation() {
        assertEquals("<none defined>", meal1.getLocation());
        assertEquals("ChezFAFA", meal2.getLocation());
    }

    @org.junit.jupiter.api.Test
    void getBudget() {
        assertEquals(0.0, meal1.getBudget());
    }
}