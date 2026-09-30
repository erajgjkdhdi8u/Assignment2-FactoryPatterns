package kz.aitu.smarthome.product;

public interface Light extends Device {
    String turnOn(int brightness);
    String turnOff();
}
