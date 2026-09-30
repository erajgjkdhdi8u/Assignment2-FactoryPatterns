package kz.aitu.smarthome.factorymethod;

import kz.aitu.smarthome.product.Device;

public class LightCreator extends DeviceCreator {
    @Override
    public Device createDevice() {
        return new StandardLight();
    }
}
