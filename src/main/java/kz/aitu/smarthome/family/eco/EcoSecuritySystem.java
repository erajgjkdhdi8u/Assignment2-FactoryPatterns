package kz.aitu.smarthome.family.eco;

import kz.aitu.smarthome.product.SecuritySystem;

public class EcoSecuritySystem implements SecuritySystem {
    public String getName() { return "Eco Security"; }
    public String getFamily() { return "Eco"; }
    public String connect() { return "Eco Security connected"; }
    public String runDiagnostic() { return "Eco Security diagnostic passed"; }
    public String arm() { return "Eco Security armed (low power alarm)"; }
    public String disarm() { return "Eco Security disarmed"; }
}
