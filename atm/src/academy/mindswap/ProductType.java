package academy.mindswap;

public enum ProductType {
    LATTE(0.99),
    MEAT(6.50),
    POTATOES(2.50),
    HAM(3.00),
    BREAD(0.15);

    private final double price;

    ProductType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
