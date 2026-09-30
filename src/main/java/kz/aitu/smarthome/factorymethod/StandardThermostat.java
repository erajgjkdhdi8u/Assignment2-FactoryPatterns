package kz.aitu.smarthome.factorymethod;

import kz.aitu.smarthome.product.Thermostat;

public class StandardThermostat implements Thermostat {
    public String getName() { return "Standard Thermostat"; }
    public String getFamily() { return "Standard"; }
    public String connect() { return "Standard Thermostat connected"; }
    public String runDiagnostic() { return "Standard Thermostat diagnostic passed"; }
    public String setTemperature(int temperature) { return "Standard temperature set to " + temperature + "C"; }
}
