package StoreLogic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class CategoryTest {

    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    void notNullReturnAllElementsOfVegetable() {

        assertNotNull(category.getVegetableProducts());
    }

    @Test
    void notNullReturnAllElementsOfMeats() {

        assertNotNull(category.getMeatProducts());
    }

    @Test
    void notNullReturnAllElementsOfCheeses() {

        assertNotNull(category.getCheeseProducts());
    }

    @Test
    void notNullReturnAllElementsOfFish() {

        assertNotNull(category.getFishProducts());
    }
}