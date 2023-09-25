package org.tnsif.assignment;

public class WoodenBero extends Bero {
    private String woodType;

    public WoodenBero(String beroType, String beroColour, String woodType) {
        super(beroType, beroColour);
        this.woodType = woodType;
        calculatePrice();
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    @Override
    public void calculatePrice() {
        switch (woodType) {
            case "Ply Wood":
                setPrice(15000.0);
                break;
            case "Teak Wood":
                setPrice(12000.0);
                break;
            case "Engineered Wood":
                setPrice(10000.0);
                break;
            default:
                setPrice(0.0);
        }
    }
}
