package kz.aitu.smarthome.factorymethod;

import kz.aitu.smarthome.product.Device;

public class SecurityCreator extends DeviceCreator {
    @Override
    public Device createDevice() {
        return new StandardSecuritySystem();
    }
}
