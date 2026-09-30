package kz.aitu.smarthome.abstractfactory;

import kz.aitu.smarthome.family.premium.PremiumLight;
import kz.aitu.smarthome.family.premium.PremiumSecuritySystem;
import kz.aitu.smarthome.family.premium.PremiumThermostat;
import kz.aitu.smarthome.product.Light;
import kz.aitu.smarthome.product.SecuritySystem;
import kz.aitu.smarthome.product.Thermostat;

public class PremiumFactory implements SmartHomeFactory {
    public Light createLight() { return new PremiumLight(); }
    public Thermostat createThermostat() { return new PremiumThermostat(); }
    public SecuritySystem createSecuritySystem() { return new PremiumSecuritySystem(); }
    public String getFamilyName() { return "Premium"; }
}
