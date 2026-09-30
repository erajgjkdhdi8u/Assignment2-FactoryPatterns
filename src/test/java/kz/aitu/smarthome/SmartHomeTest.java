package kz.aitu.smarthome;

import kz.aitu.smarthome.abstractfactory.BudgetFactory;
import kz.aitu.smarthome.abstractfactory.EcoFactory;
import kz.aitu.smarthome.abstractfactory.PremiumFactory;
import kz.aitu.smarthome.abstractfactory.IndustrialFactory;
import kz.aitu.smarthome.abstractfactory.SmartHomeFactory;
import kz.aitu.smarthome.app.FactoryProvider;
import kz.aitu.smarthome.client.SmartHomeController;
import kz.aitu.smarthome.product.Light;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeTest {

    @Test
    void budgetFactoryCreatesBudgetProducts() {
        SmartHomeFactory factory = new BudgetFactory();
        assertEquals("BudgetLight", factory.createLight().getClass().getSimpleName());
        assertEquals("BudgetThermostat", factory.createThermostat().getClass().getSimpleName());
        assertEquals("BudgetSecuritySystem", factory.createSecuritySystem().getClass().getSimpleName());
    }

    @Test
    void premiumFactoryCreatesPremiumProducts() {
        SmartHomeFactory factory = new PremiumFactory();
        assertEquals("PremiumLight", factory.createLight().getClass().getSimpleName());
        assertEquals("PremiumThermostat", factory.createThermostat().getClass().getSimpleName());
        assertEquals("PremiumSecuritySystem", factory.createSecuritySystem().getClass().getSimpleName());
    }

    @Test
    void ecoFactoryCreatesEcoProducts() {
        SmartHomeFactory factory = new EcoFactory();
        assertEquals("EcoLight", factory.createLight().getClass().getSimpleName());
        assertEquals("EcoThermostat", factory.createThermostat().getClass().getSimpleName());
        assertEquals("EcoSecuritySystem", factory.createSecuritySystem().getClass().getSimpleName());
    }

    @Test
    void budgetProductsAreCompatible() {
        SmartHomeController controller = new SmartHomeController(new BudgetFactory());
        assertTrue(controller.productsAreCompatible());
    }

    @Test
    void premiumProductsAreCompatible() {
        SmartHomeController controller = new SmartHomeController(new PremiumFactory());
        assertTrue(controller.productsAreCompatible());
    }

    @Test
    void ecoProductsAreCompatible() {
        SmartHomeController controller = new SmartHomeController(new EcoFactory());
        assertTrue(controller.productsAreCompatible());
    }

    @Test
    void runtimeSelectionReturnsBudgetFactory() {
        assertEquals("Budget", FactoryProvider.getFactory("budget").getFamilyName());
    }

    @Test
    void runtimeSelectionReturnsPremiumFactory() {
        assertEquals("Premium", FactoryProvider.getFactory("PREMIUM").getFamilyName());
    }

    @Test
    void runtimeSelectionReturnsEcoFactory() {
        assertEquals("Eco", FactoryProvider.getFactory("Eco").getFamilyName());
    }

    @Test
    void morningModeUsesSeveralProducts() {
        SmartHomeController controller = new SmartHomeController(new BudgetFactory());
        String result = controller.startMorningMode();
        assertTrue(result.contains("Light on"));
        assertTrue(result.contains("Thermostat set"));
        assertTrue(result.contains("Security disarmed"));
    }

    @Test
    void leaveHomeUsesSeveralProducts() {
        SmartHomeController controller = new SmartHomeController(new PremiumFactory());
        String result = controller.leaveHome();
        assertTrue(result.contains("Light off"));
        assertTrue(result.contains("18C"));
        assertTrue(result.contains("Security armed"));
    }

    @Test
    void nightModeUsesSeveralProducts() {
        SmartHomeController controller = new SmartHomeController(new EcoFactory());
        String result = controller.startNightMode();
        assertTrue(result.contains("20%"));
        assertTrue(result.contains("19C"));
        assertTrue(result.contains("Security armed"));
    }

    @Test
    void wrongFamilyNameThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> FactoryProvider.getFactory("unknown"));
    }

    @Test
    void invalidBrightnessThrowsException() {
        Light light = new BudgetFactory().createLight();
        assertThrows(IllegalArgumentException.class,
                () -> light.turnOn(120));
    }

    @Test
    void clientWorksWithFactoryInterface() {
        SmartHomeFactory factory = new BudgetFactory();
        SmartHomeController controller = new SmartHomeController(factory);
        assertEquals("Budget", controller.getFamily());
    }

    @Test
    void industrialFactoryCreatesIndustrialProducts() {
        SmartHomeFactory factory = new IndustrialFactory();
        assertEquals("IndustrialLight", factory.createLight().getClass().getSimpleName());
        assertEquals("IndustrialThermostat", factory.createThermostat().getClass().getSimpleName());
        assertEquals("IndustrialSecuritySystem", factory.createSecuritySystem().getClass().getSimpleName());
    }

    @Test
    void industrialProductsAreCompatible() {
        SmartHomeController controller = new SmartHomeController(new IndustrialFactory());
        assertTrue(controller.productsAreCompatible());
    }

    @Test
    void runtimeSelectionReturnsIndustrialFactory() {
        assertEquals("Industrial", FactoryProvider.getFactory("industrial").getFamilyName());
    }
}
