package kz.aitu.smarthome.factorymethod;

import kz.aitu.smarthome.product.SecuritySystem;

public class StandardSecuritySystem implements SecuritySystem {
    public String getName() { return "Standard Security"; }
    public String getFamily() { return "Standard"; }
    public String connect() { return "Standard Security connected"; }
    public String runDiagnostic() { return "Standard Security diagnostic passed"; }
    public String arm() { return "Standard Security armed"; }
    public String disarm() { return "Standard Security disarmed"; }
}
