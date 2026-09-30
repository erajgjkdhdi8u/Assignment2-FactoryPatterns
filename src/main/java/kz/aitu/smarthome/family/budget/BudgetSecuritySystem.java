package kz.aitu.smarthome.family.budget;

import kz.aitu.smarthome.product.SecuritySystem;

public class BudgetSecuritySystem implements SecuritySystem {
    public String getName() { return "Budget Security"; }
    public String getFamily() { return "Budget"; }
    public String connect() { return "Budget Security connected"; }
    public String runDiagnostic() { return "Budget Security diagnostic passed"; }
    public String arm() { return "Budget Security armed (basic alarm)"; }
    public String disarm() { return "Budget Security disarmed"; }
}
