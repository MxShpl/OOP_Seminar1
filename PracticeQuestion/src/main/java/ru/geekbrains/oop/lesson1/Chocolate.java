package ru.geekbrains.oop.lesson1;


public class Chocolate extends Product {
    private double clories;


    public double getClories() {
        return clories;
    }

    public void setClories(double clories) {
        this.clories = clories;

    }

    public Chocolate(String brand, String name, double price, double clories) {
        super(brand, name, price);
        this.clories = clories;
    }
    @Override
    public String displayInfo() {
        return String.format("Бутылка с водой\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалории: %.2f]",
                brand, name, price, clories);
    }
}
