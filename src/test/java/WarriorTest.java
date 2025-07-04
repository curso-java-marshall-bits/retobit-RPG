import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WarriorTest {

    @Test
    @Order(1)
    @DisplayName("Warrior: Herencia de Character y Constructor con propiedad 'defense'")
    void testWarriorConstructorAndProperties() {
        Warrior warrior = new Warrior("Aragorn", 120, 15);

        assertNotNull(warrior, "El objeto Warrior no debe ser nulo después de la instanciación.");

        assertEquals("Aragorn", warrior.name, "La propiedad 'name' heredada no se inicializa correctamente.");
        assertEquals(120, warrior.health, "La propiedad 'health' heredada no se inicializa correctamente.");
        assertEquals(Status.REGULAR, warrior.status, "La propiedad 'status' heredada no se inicializa a REGULAR por defecto.");

        assertEquals(15, warrior.defense, "La propiedad 'defense' de Warrior no se inicializa correctamente.");
    }

    @Test
    @Order(2)
    @DisplayName("Warrior: Funcionalidad de métodos heredados")
    void testWarriorInheritedCombatantMethods() {
        Warrior warrior = new Warrior("Conan", 150, 10);

        assertTrue(warrior.isAlive(), "isAlive() debería devolver true para un Guerrero con salud > 0.");

        warrior.receiveDamage(150);
        assertFalse(warrior.isAlive(), "isAlive() debería devolver false para un Guerrero con salud = 0.");

        Warrior testWarriorHealth = new Warrior("Test Health Warrior", 95, 5);
        assertEquals(95, testWarriorHealth.getCurrentHealth(), "getCurrentHealth() debería devolver la salud actual del Guerrero.");

        assertEquals("Test Health Warrior", testWarriorHealth.getName(), "getName() debería devolver el nombre del Guerrero.");

        assertEquals(Status.REGULAR.name(), testWarriorHealth.getStatus(), "getStatus() debería devolver REGULAR para un Guerrero inicial.");
        testWarriorHealth.receiveDamage(200);
        assertEquals(Status.DEAD.name(), testWarriorHealth.getStatus(), "getStatus() debería devolver DEAD para un Guerrero muerto.");

        Warrior damageWarrior = new Warrior("Damaged Warrior", 70, 8);
        damageWarrior.receiveDamage(30);
        assertEquals(40, damageWarrior.getCurrentHealth(), "receiveDamage() no reduce la salud del Guerrero correctamente.");
        damageWarrior.receiveDamage(70);
        assertEquals(0, damageWarrior.getCurrentHealth(), "receiveDamage() no fija la salud del Guerrero en 0 al morir.");
        assertEquals(Status.DEAD.name(), damageWarrior.getStatus(), "receiveDamage() no cambia el estado del Guerrero a DEAD al morir.");
    }
}
