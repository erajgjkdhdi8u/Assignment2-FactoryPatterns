# Smart Home System - Assignment 2

This is a Java 17 project for **Factory Method & Abstract Factory**.
The domain is a smart home system with three device types:

- Light
- Thermostat
- Security System

The original families are **Budget**, **Premium**, and **Eco**. After the main design was finished, a fourth family called **Industrial** was added.

## Why factories are useful here

Without factories the client has to know every concrete class and use many `if/else` blocks. It is also easy to create products from different families by mistake.

The final design uses:

- **Factory Method** for creating standard device types through `DeviceCreator` subclasses. The creator also has the business method `installAndCheckDevice()`.
- **Abstract Factory** for creating a complete compatible smart-home family.

## Product matrix

| Product type | Budget | Premium | Eco | Industrial |
|---|---|---|---|---|
| Light | BudgetLight | PremiumLight | EcoLight | IndustrialLight |
| Thermostat | BudgetThermostat | PremiumThermostat | EcoThermostat | IndustrialThermostat |
| Security | BudgetSecuritySystem | PremiumSecuritySystem | EcoSecuritySystem | IndustrialSecuritySystem |

## Compatibility

`SmartHomeController` receives one `SmartHomeFactory` and creates all three products from the same factory. This means the business client does not receive separate concrete products, so an accidental combination such as Budget Light + Premium Thermostat + Eco Security is avoided by the design.

## Business operations

The controller has three operations where the products work together:

1. `startMorningMode()`
2. `leaveHome()`
3. `startNightMode()`

## Runtime selection

`FactoryProvider` selects a factory from a string such as `budget`, `premium`, `eco`, or `industrial`. `Main` gets the value from the user.

## Run in IntelliJ IDEA

1. Open the project folder.
2. Let IntelliJ load the Maven project.
3. Make sure Project SDK is JDK 17 or newer.
4. Run `kz.aitu.smarthome.app.Main`.

## Run tests

In IntelliJ, open `SmartHomeTest` and press **Run**.
With Maven installed you can also run:

```bash
mvn test
```

There are 18 tests including product creation, compatibility, runtime selection, business behavior, negative cases, and the Industrial family.

## UML

See `docs/uml/class-diagram.png` and `docs/uml/class-diagram.puml`.

## Git history

The repository contains meaningful commits showing the development from direct object creation to Factory Method, Abstract Factory, tests, and the fourth family.
