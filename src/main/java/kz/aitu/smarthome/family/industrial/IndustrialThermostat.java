package kz.aitu.smarthome.family.industrial;

import kz.aitu.smarthome.product.Thermostat;

public class IndustrialThermostat implements Thermostat {
    public String getName() { return "Industrial Thermostat"; }
    public String getFamily() { return "Industrial"; }
    public String connect() { return "Industrial Thermostat connected"; }
    public String runDiagnostic() { return "Industrial Thermostat diagnostic passed"; }

    public String setTemperature(int temperature) {
        if (temperature < 5 || temperature > 35) {
            throw new IllegalArgumentException("Temperature for Industrial must be from 5 to 35");
        }
        return "Industrial Thermostat set to " + temperature + "C (wide range control)";
    }
}
