package kz.aitu.smarthome.family.industrial;

import kz.aitu.smarthome.product.Light;

public class IndustrialLight implements Light {
    public String getName() { return "Industrial Light"; }
    public String getFamily() { return "Industrial"; }
    public String connect() { return "Industrial Light connected"; }
    public String runDiagnostic() { return "Industrial Light diagnostic passed"; }

    public String turnOn(int brightness) {
        if (brightness < 0 || brightness > 100) {
            throw new IllegalArgumentException("Brightness must be from 0 to 100");
        }
        return "Industrial Light on at " + brightness + "% (strong industrial lamp)";
    }

    public String turnOff() { return "Industrial Light off"; }
}
