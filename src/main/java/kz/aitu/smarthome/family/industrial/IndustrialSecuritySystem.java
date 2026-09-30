package kz.aitu.smarthome.family.industrial;

import kz.aitu.smarthome.product.SecuritySystem;

public class IndustrialSecuritySystem implements SecuritySystem {
    public String getName() { return "Industrial Security"; }
    public String getFamily() { return "Industrial"; }
    public String connect() { return "Industrial Security connected"; }
    public String runDiagnostic() { return "Industrial Security diagnostic passed"; }
    public String arm() { return "Industrial Security armed (industrial alarm)"; }
    public String disarm() { return "Industrial Security disarmed"; }
}
