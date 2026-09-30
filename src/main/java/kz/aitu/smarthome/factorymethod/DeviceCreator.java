package kz.aitu.smarthome.factorymethod;

import kz.aitu.smarthome.product.Device;

public abstract class DeviceCreator {
    public abstract Device createDevice();

    public String installAndCheckDevice() {
        Device device = createDevice();
        return "Installing " + device.getName() + " -> "
                + device.connect() + " -> " + device.runDiagnostic();
    }
}
