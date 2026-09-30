package kz.aitu.smarthome.abstractfactory;

import kz.aitu.smarthome.family.industrial.IndustrialLight;
import kz.aitu.smarthome.family.industrial.IndustrialSecuritySystem;
import kz.aitu.smarthome.family.industrial.IndustrialThermostat;
import kz.aitu.smarthome.product.Light;
import kz.aitu.smarthome.product.SecuritySystem;
import kz.aitu.smarthome.product.Thermostat;

public class IndustrialFactory implements SmartHomeFactory {
    public Light createLight() { return new IndustrialLight(); }
    public Thermostat createThermostat() { return new IndustrialThermostat(); }
    public SecuritySystem createSecuritySystem() { return new IndustrialSecuritySystem(); }
    public String getFamilyName() { return "Industrial"; }
}
