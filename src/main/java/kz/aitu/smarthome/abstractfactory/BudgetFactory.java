package kz.aitu.smarthome.abstractfactory;

import kz.aitu.smarthome.family.budget.BudgetLight;
import kz.aitu.smarthome.family.budget.BudgetSecuritySystem;
import kz.aitu.smarthome.family.budget.BudgetThermostat;
import kz.aitu.smarthome.product.Light;
import kz.aitu.smarthome.product.SecuritySystem;
import kz.aitu.smarthome.product.Thermostat;

public class BudgetFactory implements SmartHomeFactory {
    public Light createLight() { return new BudgetLight(); }
    public Thermostat createThermostat() { return new BudgetThermostat(); }
    public SecuritySystem createSecuritySystem() { return new BudgetSecuritySystem(); }
    public String getFamilyName() { return "Budget"; }
}
