package kz.aitu.smarthome.client;

import kz.aitu.smarthome.abstractfactory.SmartHomeFactory;
import kz.aitu.smarthome.product.Light;
import kz.aitu.smarthome.product.SecuritySystem;
import kz.aitu.smarthome.product.Thermostat;

public class SmartHomeController {
    private final Light light;
    private final Thermostat thermostat;
    private final SecuritySystem securitySystem;
    private final String family;

    public SmartHomeController(SmartHomeFactory factory) {
        this.light = factory.createLight();
        this.thermostat = factory.createThermostat();
        this.securitySystem = factory.createSecuritySystem();
        this.family = factory.getFamilyName();
    }

    public String startMorningMode() {
        return light.turnOn(60) + "\n"
                + thermostat.setTemperature(22) + "\n"
                + securitySystem.disarm();
    }

    public String leaveHome() {
        return light.turnOff() + "\n"
                + thermostat.setTemperature(18) + "\n"
                + securitySystem.arm();
    }

    public String startNightMode() {
        return light.turnOn(20) + "\n"
                + thermostat.setTemperature(19) + "\n"
                + securitySystem.arm();
    }

    public String getFamily() {
        return family;
    }

    public boolean productsAreCompatible() {
        return light.getFamily().equals(thermostat.getFamily())
                && thermostat.getFamily().equals(securitySystem.getFamily());
    }
}
