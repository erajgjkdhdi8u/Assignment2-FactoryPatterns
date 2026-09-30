package kz.aitu.smarthome.app;

import kz.aitu.smarthome.abstractfactory.SmartHomeFactory;
import kz.aitu.smarthome.client.SmartHomeController;
import kz.aitu.smarthome.factorymethod.DeviceCreator;
import kz.aitu.smarthome.factorymethod.LightCreator;
import kz.aitu.smarthome.factorymethod.SecurityCreator;
import kz.aitu.smarthome.factorymethod.ThermostatCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showFactoryMethodDemo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("
Available families: budget, premium, eco, industrial");
        System.out.print("Choose smart home family: ");
        String family = scanner.nextLine();

        try {
            SmartHomeFactory factory = FactoryProvider.getFactory(family);
            SmartHomeController controller = new SmartHomeController(factory);

            System.out.println("
Created family: " + controller.getFamily());
            System.out.println("Compatible products: " + controller.productsAreCompatible());

            System.out.println("
Morning mode:");
            System.out.println(controller.startMorningMode());

            System.out.println("
Leave home mode:");
            System.out.println(controller.leaveHome());

            System.out.println("
Night mode:");
            System.out.println(controller.startNightMode());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showFactoryMethodDemo() {
        System.out.println("Factory Method demo:");
        DeviceCreator lightCreator = new LightCreator();
        DeviceCreator thermostatCreator = new ThermostatCreator();
        DeviceCreator securityCreator = new SecurityCreator();

        System.out.println(lightCreator.installAndCheckDevice());
        System.out.println(thermostatCreator.installAndCheckDevice());
        System.out.println(securityCreator.installAndCheckDevice());
    }
}
