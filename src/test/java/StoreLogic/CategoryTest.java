package StoreLogic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    void SetUp() throws NullPointerException {

        category = new Category();
    }

    @Test
    void notNullReturnAllElementsOfVegetables() {

        assertNotNull(category.getVegetableProducts());
    }

    @Test
    void notNullReturnAllElementsOfMeats() {

        assertNotNull(category.getVegetableProducts());
    }

    @Test
    void notNullReturnAllElementsOfCheeses() {

        assertNotNull(category.getVegetableProducts());
    }

    @Test
    void notNullReturnAllElementsOfFish() {

        assertNotNull(category.getVegetableProducts());
    }
}