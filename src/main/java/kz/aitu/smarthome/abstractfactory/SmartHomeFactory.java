package kz.aitu.smarthome.abstractfactory;

import kz.aitu.smarthome.product.Light;
import kz.aitu.smarthome.product.Thermostat;
import kz.aitu.smarthome.product.SecuritySystem;

public interface SmartHomeFactory {
    Light createLight();
    Thermostat createThermostat();
    SecuritySystem createSecuritySystem();
    String getFamilyName();
}
