import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MageTest {
    @Test
    @Order(1)
    @DisplayName("Mage: Herencia de Character y Constructor con propiedad 'mana'")
    void testMageConstructorAndProperties() {
        // Constructor de Mage: (name, health, mana)
        Mage mage = new Mage("Gandalf", 80, 50);

        assertNotNull(mage, "El objeto Mage no debe ser nulo después de la instanciación.");

        assertEquals("Gandalf", mage.name, "La propiedad 'name' heredada no se inicializa correctamente.");
        assertEquals(80, mage.health, "La propiedad 'health' heredada no se inicializa correctamente.");
        assertEquals(Status.REGULAR, mage.status, "La propiedad 'status' heredada no se inicializa a REGULAR por defecto.");

        assertEquals(50, mage.mana, "La propiedad 'mana' de Mage no se inicializa correctamente.");
    }

    @Test
    @Order(2)
    @DisplayName("Mage: Funcionalidad de métodos heredados")
    void testMageInheritedCombatantMethods() {
        Mage mage = new Mage("Elminster", 100, 75);

        assertTrue(mage.isAlive(), "isAlive() debería devolver true para un Mago con salud > 0.");

        mage.receiveDamage(100); // Reduce su salud a 0
        assertFalse(mage.isAlive(), "isAlive() debería devolver false para un Mago con salud = 0.");

        Mage testMageHealth = new Mage("Test Health Mage", 65, 30);
        assertEquals(65, testMageHealth.getCurrentHealth(), "getCurrentHealth() debería devolver la salud actual del Mago.");

        assertEquals("Test Health Mage", testMageHealth.getName(), "getName() debería devolver el nombre del Mago.");

        assertEquals(Status.REGULAR.name(), testMageHealth.getStatus(), "getStatus() debería devolver REGULAR para un Mago inicial.");
        testMageHealth.receiveDamage(100); // Para cambiar el estado a DEAD
        assertEquals(Status.DEAD.name(), testMageHealth.getStatus(), "getStatus() debería devolver DEAD para un Mago muerto.");


        Mage damageMage = new Mage("Damaged Mage", 50, 20);
        damageMage.receiveDamage(20);
        assertEquals(30, damageMage.getCurrentHealth(), "receiveDamage() no reduce la salud del Mago correctamente.");
        damageMage.receiveDamage(50); // Daño letal
        assertEquals(0, damageMage.getCurrentHealth(), "receiveDamage() no fija la salud del Mago en 0 al morir.");
        assertEquals(Status.DEAD.name(), damageMage.getStatus(), "receiveDamage() no cambia el estado del Mago a DEAD al morir.");
    }
}
