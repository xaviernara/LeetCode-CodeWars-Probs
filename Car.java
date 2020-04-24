import java.util.*;

public class Car {

   private int modelYear;
   private String carMake;
   private double speed = 0.0;
   
   public Car(int modelYear, String carMake, double speed){
      this.modelYear = modelYear;
      this.carMake =carMake;
      this.speed = speed;
      
   }
   
   public double accelerate (){
      speed += 5.0;
      
      return speed ;
   }
   
   public double brake(){
      speed -= 5.0;
      return speed;
   }
   
   public double getSpeed(){
      return speed;
   }
   
   
   
   public static void main (String[] args){
      
      Car car = new Car (1995, "toyota", 50.0);
      
      for (int i =0; i<5; i++){
         car.accelerate();
         System.out.println("Current Speed after accelerating: " + car.getSpeed() );
      }
      
      for (int i =0; i<5; i++){
         car.brake();
         System.out.println("Current Speed after braking: " + car.getSpeed() );
      }
      
      
      System.out.println("Current Speed after loops: " + car.getSpeed() );
      
   
   }
   
}
