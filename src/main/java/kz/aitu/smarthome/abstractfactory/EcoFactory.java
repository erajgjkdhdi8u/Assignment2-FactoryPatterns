package kz.aitu.smarthome.abstractfactory;

import kz.aitu.smarthome.family.eco.EcoLight;
import kz.aitu.smarthome.family.eco.EcoSecuritySystem;
import kz.aitu.smarthome.family.eco.EcoThermostat;
import kz.aitu.smarthome.product.Light;
import kz.aitu.smarthome.product.SecuritySystem;
import kz.aitu.smarthome.product.Thermostat;

public class EcoFactory implements SmartHomeFactory {
    public Light createLight() { return new EcoLight(); }
    public Thermostat createThermostat() { return new EcoThermostat(); }
    public SecuritySystem createSecuritySystem() { return new EcoSecuritySystem(); }
    public String getFamilyName() { return "Eco"; }
}
