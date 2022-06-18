package com.gmail.shihab4t.chapter07.ECommerceProject;

public class NonDigitalProduct extends AbstractProduct{
    public static final int SHIPPING_RATE = 5;
    public static final double DIMENSION_CHARGE = 1.5;

    private final int weight;
    private final Dimension dimension;

    public NonDigitalProduct(String name, int price, int discount, int weight, Dimension dimension) {
        super(name, price, discount);
        this.weight = weight;
        this.dimension = dimension;
    }

    @Override
    public int calculatePrice() {
        double price = this.getPrice() * ((100 - getDiscount()) / 100.0);
        price += weight * SHIPPING_RATE;

        if (dimension.getVolume() > 10) {
            price += dimension.getVolume() * DIMENSION_CHARGE;
        }

        return (int) price;
    }
}
