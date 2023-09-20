package week5;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        if (this.isMoreExpensiveThan(otherApartment)) {
            return this.pricePerSquareMeter * this.squareMeters - otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        } else {
            return otherApartment.pricePerSquareMeter * otherApartment.squareMeters - this.pricePerSquareMeter * this.squareMeters;
        }
    }

    public boolean isMoreExpensiveThan(Apartment otherApartment) {
        return (this.squareMeters * this.pricePerSquareMeter) > (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
    }
}