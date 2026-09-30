package kz.aitu.smarthome.family.budget;

import kz.aitu.smarthome.product.Light;

public class BudgetLight implements Light {
    public String getName() { return "Budget Light"; }
    public String getFamily() { return "Budget"; }
    public String connect() { return "Budget Light connected"; }
    public String runDiagnostic() { return "Budget Light diagnostic passed"; }

    public String turnOn(int brightness) {
        if (brightness < 0 || brightness > 100) {
            throw new IllegalArgumentException("Brightness must be from 0 to 100");
        }
        int realBrightness = brightness;
        if (realBrightness > 70) {
            realBrightness = 70;
        }
        return "Budget Light on at " + realBrightness + "% (basic lamp)";
    }

    public String turnOff() { return "Budget Light off"; }
}
