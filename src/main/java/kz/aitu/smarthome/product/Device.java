package kz.aitu.smarthome.product;

public interface Device {
    String getName();
    String getFamily();
    String connect();
    String runDiagnostic();
}
