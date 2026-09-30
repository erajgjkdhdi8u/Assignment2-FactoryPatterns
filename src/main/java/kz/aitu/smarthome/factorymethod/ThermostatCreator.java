package kz.aitu.smarthome.factorymethod;

import kz.aitu.smarthome.product.Device;

public class ThermostatCreator extends DeviceCreator {
    @Override
    public Device createDevice() {
        return new StandardThermostat();
    }
}
