package kz.aitu.smarthome.initial;

import java.util.Scanner;

public class InitialSmartHomeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose family (budget, premium, eco): ");
        String family = scanner.nextLine().toLowerCase();

        if (family.equals("budget")) {
            BudgetLight light = new BudgetLight();
            BudgetThermostat thermostat = new BudgetThermostat();
            BudgetSecurity security = new BudgetSecurity();
            light.turnOn();
            thermostat.setTemperature(22);
            security.disarm();
        } else if (family.equals("premium")) {
            PremiumLight light = new PremiumLight();
            PremiumThermostat thermostat = new PremiumThermostat();
            PremiumSecurity security = new PremiumSecurity();
            light.turnOn();
            thermostat.setTemperature(22);
            security.disarm();
        } else if (family.equals("eco")) {
            EcoLight light = new EcoLight();
            EcoThermostat thermostat = new EcoThermostat();
            EcoSecurity security = new EcoSecurity();
            light.turnOn();
            thermostat.setTemperature(22);
            security.disarm();
        } else {
            System.out.println("Unknown family");
        }
    }

    static class BudgetLight { void turnOn() { System.out.println("Budget light is on"); } }
    static class BudgetThermostat { void setTemperature(int value) { System.out.println("Budget temperature: " + value); } }
    static class BudgetSecurity { void disarm() { System.out.println("Budget security is disarmed"); } }

    static class PremiumLight { void turnOn() { System.out.println("Premium light is on"); } }
    static class PremiumThermostat { void setTemperature(int value) { System.out.println("Premium temperature: " + value); } }
    static class PremiumSecurity { void disarm() { System.out.println("Premium security is disarmed"); } }

    static class EcoLight { void turnOn() { System.out.println("Eco light is on"); } }
    static class EcoThermostat { void setTemperature(int value) { System.out.println("Eco temperature: " + value); } }
    static class EcoSecurity { void disarm() { System.out.println("Eco security is disarmed"); } }
}
