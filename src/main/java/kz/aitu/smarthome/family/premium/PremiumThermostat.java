package kz.aitu.smarthome.family.premium;

import kz.aitu.smarthome.product.Thermostat;

public class PremiumThermostat implements Thermostat {
    public String getName() { return "Premium Thermostat"; }
    public String getFamily() { return "Premium"; }
    public String connect() { return "Premium Thermostat connected"; }
    public String runDiagnostic() { return "Premium Thermostat diagnostic passed"; }

    public String setTemperature(int temperature) {
        if (temperature < 10 || temperature > 30) {
            throw new IllegalArgumentException("Temperature for Premium must be from 10 to 30");
        }
        return "Premium Thermostat set to " + temperature + "C (precise climate control)";
    }
}
