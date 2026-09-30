package kz.aitu.smarthome.family.premium;

import kz.aitu.smarthome.product.Light;

public class PremiumLight implements Light {
    public String getName() { return "Premium Light"; }
    public String getFamily() { return "Premium"; }
    public String connect() { return "Premium Light connected"; }
    public String runDiagnostic() { return "Premium Light diagnostic passed"; }

    public String turnOn(int brightness) {
        if (brightness < 0 || brightness > 100) {
            throw new IllegalArgumentException("Brightness must be from 0 to 100");
        }
        int realBrightness = brightness;
        if (realBrightness > 100) {
            realBrightness = 100;
        }
        return "Premium Light on at " + realBrightness + "% (smooth premium lamp)";
    }

    public String turnOff() { return "Premium Light off"; }
}
