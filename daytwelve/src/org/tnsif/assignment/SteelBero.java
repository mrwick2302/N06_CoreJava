package org.tnsif.assignment;

public class SteelBero extends Bero {
    private int beroHeight;

    public SteelBero(String beroType, String beroColour, int beroHeight) {
        super(beroType, beroColour);
        this.beroHeight = beroHeight;
        calculatePrice();
    }

    public int getBeroHeight() {
        return beroHeight;
    }

    public void setBeroHeight(int beroHeight) {
        this.beroHeight = beroHeight;
    }

    @Override
    public void calculatePrice() {
        switch (beroHeight) {
            case 3:
                setPrice(5000.0);
                break;
            case 5:
                setPrice(8000.0);
                break;
            case 7:
                setPrice(10000.0);
                break;
            default:
                setPrice(0.0);
        }
    }
}
