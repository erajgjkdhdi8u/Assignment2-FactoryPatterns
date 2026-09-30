package kz.aitu.smarthome.family.eco;

import kz.aitu.smarthome.product.Light;

public class EcoLight implements Light {
    public String getName() { return "Eco Light"; }
    public String getFamily() { return "Eco"; }
    public String connect() { return "Eco Light connected"; }
    public String runDiagnostic() { return "Eco Light diagnostic passed"; }

    public String turnOn(int brightness) {
        if (brightness < 0 || brightness > 100) {
            throw new IllegalArgumentException("Brightness must be from 0 to 100");
        }
        int realBrightness = brightness;
        if (realBrightness > 50) {
            realBrightness = 50;
        }
        return "Eco Light on at " + realBrightness + "% (energy saving lamp)";
    }

    public String turnOff() { return "Eco Light off"; }
}
