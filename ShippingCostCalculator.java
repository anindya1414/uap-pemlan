package uap.interfaces;

public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000;

    default double calculateCost(double massInGram) {
        double kg = Math.ceil(massInGram / MassConverter.DENOMINATOR);
        return kg * PRICE_PER_KG;
    }
}