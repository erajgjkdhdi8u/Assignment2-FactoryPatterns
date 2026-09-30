package kz.aitu.smarthome.family.premium;

import kz.aitu.smarthome.product.SecuritySystem;

public class PremiumSecuritySystem implements SecuritySystem {
    public String getName() { return "Premium Security"; }
    public String getFamily() { return "Premium"; }
    public String connect() { return "Premium Security connected"; }
    public String runDiagnostic() { return "Premium Security diagnostic passed"; }
    public String arm() { return "Premium Security armed (camera and alarm)"; }
    public String disarm() { return "Premium Security disarmed"; }
}
