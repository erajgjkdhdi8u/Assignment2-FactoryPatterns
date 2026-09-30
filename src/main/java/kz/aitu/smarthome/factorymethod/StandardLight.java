package kz.aitu.smarthome.factorymethod;

import kz.aitu.smarthome.product.Light;

public class StandardLight implements Light {
    public String getName() { return "Standard Light"; }
    public String getFamily() { return "Standard"; }
    public String connect() { return "Standard Light connected"; }
    public String runDiagnostic() { return "Standard Light diagnostic passed"; }
    public String turnOn(int brightness) { return "Standard Light on at " + brightness + "%"; }
    public String turnOff() { return "Standard Light off"; }
}
