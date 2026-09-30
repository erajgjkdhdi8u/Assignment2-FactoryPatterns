package kz.aitu.smarthome.app;

import kz.aitu.smarthome.abstractfactory.BudgetFactory;
import kz.aitu.smarthome.abstractfactory.EcoFactory;
import kz.aitu.smarthome.abstractfactory.PremiumFactory;
import kz.aitu.smarthome.abstractfactory.IndustrialFactory;
import kz.aitu.smarthome.abstractfactory.SmartHomeFactory;

public class FactoryProvider {
    public static SmartHomeFactory getFactory(String family) {
        if (family == null) {
            throw new IllegalArgumentException("Family cannot be null");
        }

        switch (family.toLowerCase()) {
            case "budget":
                return new BudgetFactory();
            case "premium":
                return new PremiumFactory();
            case "eco":
                return new EcoFactory();
            case "industrial":
                return new IndustrialFactory();
            default:
                throw new IllegalArgumentException("Unknown family: " + family);
        }
    }
}
