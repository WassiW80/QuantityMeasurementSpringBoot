package com.quantity.measurement.enumeration;

public enum UnitType {
    FEET(MainUnitType.LENGTH), INCH(MainUnitType.LENGTH),
    YARD(MainUnitType.LENGTH), CENTIMETER(MainUnitType.LENGTH),

    GALLON(MainUnitType.VOLUME), LITRE(MainUnitType.VOLUME),
    MILLILITRE(MainUnitType.VOLUME),

    KILOGRAM(MainUnitType.MASS), GRAM(MainUnitType.MASS),
    TONNE(MainUnitType.MASS),
    FAHRENHEIT(MainUnitType.TEMPERATURE), CELSIUS(MainUnitType.TEMPERATURE);

    public MainUnitType mainUnitType;

    UnitType(MainUnitType mainUnitType) {
        this.mainUnitType = mainUnitType;
    }
}