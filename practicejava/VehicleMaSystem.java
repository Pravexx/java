class vehicle{
    private String brand;
    private int price;

    public vehicle(String brand,int price ){
        this.brand = brand;
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Vehicle brand :" + brand);
        System.out.println("Vehicle price :" + price);
    }
}
class Car extends vehicle{
    private int NoOfDoor;

    public Car(String brand,int price , int NoOfDoor){
        super(brand, price);
        this.NoOfDoor = NoOfDoor;
    }
    public void displayDetails(){
        System.out.println("--Car DETAILS--");
        System.out.println("Car brand :" + getBrand());
        System.out.println("Car price :" + getPrice());
        System.out.println("No Of Doors :" + NoOfDoor);
    }
} 
class bike extends vehicle{
    private String Type;

    public bike(String brand,int price , String Type){
        super(brand, price);
        this.Type = Type;
    }
    public void displayDetails(){
        System.out.println("--Bike DETAILS--");
        System.out.println("bike brand :" + getBrand());
        System.out.println("bike price :" + getPrice());
        System.out.println("bike type" + Type);
    }
}
public class VehicleMaSystem {
    public static void main(String[] args) {
        Car car1 =  new Car("BMW",1000000,4);
        car1.displayDetails();
        bike b1 = new bike("Yamaha",200000,"sports");
        b1.displayDetails();
    }
}
