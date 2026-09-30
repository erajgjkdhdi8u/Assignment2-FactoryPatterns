# Defense notes

## 1. What problem does Factory Method solve here?
`DeviceCreator` defines `createDevice()`. `LightCreator`, `ThermostatCreator`, and `SecurityCreator` decide which concrete standard device to create. The parent class has useful logic in `installAndCheckDevice()`, so the creator does more than only return an object.

## 2. Why is it not only a static factory?
The creation method is overridden in subclasses. Polymorphism decides which product is created. A static factory would normally choose inside one static method and cannot be overridden in the same way.

## 3. What problem does Abstract Factory solve?
A smart home needs several related objects at the same time. `SmartHomeFactory` creates a Light, Thermostat, and SecuritySystem that belong to one family.

## 4. How is compatibility guaranteed?
`SmartHomeController` accepts one `SmartHomeFactory`, not three separate products. It creates every product from this same factory. Because of that, normal client code cannot accidentally pass products from different families to the controller.

## 5. How is the family selected at runtime?
`FactoryProvider.getFactory()` receives a string from user input and returns the correct `SmartHomeFactory` implementation.

## 6. What changed when Industrial was added?
New Industrial product classes, `IndustrialFactory`, one new selector branch in `FactoryProvider`, and Industrial tests were added. `SmartHomeController` and its three business operations did not change.

## 7. Three business operations
- Morning: turn on light, set temperature, disarm security.
- Leave home: turn off light, lower temperature, arm security.
- Night: use dim light, lower temperature, arm security.

## 8. Product interfaces
`Light`, `Thermostat`, and `SecuritySystem` are abstractions. Business code does not depend on BudgetLight, PremiumLight, etc.

## 9. Difference between the two patterns
Factory Method uses inheritance: subclasses override one creation method.
Abstract Factory uses an object/interface that can create several related product types.
