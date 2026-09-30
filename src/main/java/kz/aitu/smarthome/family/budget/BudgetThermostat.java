package kz.aitu.smarthome.family.budget;

import kz.aitu.smarthome.product.Thermostat;

public class BudgetThermostat implements Thermostat {
    public String getName() { return "Budget Thermostat"; }
    public String getFamily() { return "Budget"; }
    public String connect() { return "Budget Thermostat connected"; }
    public String runDiagnostic() { return "Budget Thermostat diagnostic passed"; }

    public String setTemperature(int temperature) {
        if (temperature < 16 || temperature > 28) {
            throw new IllegalArgumentException("Temperature for Budget must be from 16 to 28");
        }
        return "Budget Thermostat set to " + temperature + "C (basic heating)";
    }
}
