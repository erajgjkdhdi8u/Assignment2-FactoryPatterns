package kz.aitu.smarthome.family.eco;

import kz.aitu.smarthome.product.Thermostat;

public class EcoThermostat implements Thermostat {
    public String getName() { return "Eco Thermostat"; }
    public String getFamily() { return "Eco"; }
    public String connect() { return "Eco Thermostat connected"; }
    public String runDiagnostic() { return "Eco Thermostat diagnostic passed"; }

    public String setTemperature(int temperature) {
        if (temperature < 17 || temperature > 26) {
            throw new IllegalArgumentException("Temperature for Eco must be from 17 to 26");
        }
        return "Eco Thermostat set to " + temperature + "C (eco temperature mode)";
    }
}
