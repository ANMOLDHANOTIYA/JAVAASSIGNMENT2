class Distance {
    double miles;

    public Distance(double miles) {
        this.miles = miles;
    }

    public void travelTime() {
        double time = miles / 60;
        System.out.println("Time to cover " + miles + " miles at 60 miles/hour: " + time + " hours.");
    }
}

class DistanceMKS extends Distance {

    public DistanceMKS(double miles) {
        super(miles);
    }

    @Override
    public void travelTime() {
        double kilometers = miles * 1.60934;
        double time = kilometers / 100; // speed in km/s
        System.out.println("Time to cover " + kilometers + " kilometers at 100 km/second: " + time + " seconds.");
    }
}

public class DistanceTest {
    public static void main(String[] args) {
        Distance distance = new Distance(120);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(120);
        distanceMKS.travelTime();
    }
}
