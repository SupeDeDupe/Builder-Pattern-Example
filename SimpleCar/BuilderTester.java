
public class BuilderTester
{
    public static void main (String [] args)
    {
        Car car1 = new CarBuilder()
                    .addWheels("4 large wheels")
                    .addEngine("VEE engine")
                    .addSeats("Heated seats")
                    .addDoors("2 doors")
                    .build();
                    
        Car car2 = new CarBuilder()
                    .addEngine("INLINE engine")
                    .addSeats("Regular seats")
                    .addDoors("4 doors")
                    .addWheels("4 small wheels")
                    .build();
        
        car1.print();
        car2.print();
        
    }
}
