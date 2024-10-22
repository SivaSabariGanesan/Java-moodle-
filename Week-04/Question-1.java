Q1) Create a class called "Circle" with a radius attribute. You can access and modify this attribute using getter and setter methods. Calculate the area and circumference of the circle.

Answer:
  import java.io.*;
import java.util.Scanner;

class Circle
{
    private double radius;
    
    
    public Circle(double radius){ 
        this.radius = radius;
    }
    

    public void setRadius(double radius){
       this.radius = radius;
        
    }
    

    public double getRadius()    {

       return radius;
        
    }

    public double calculateArea()  { 
       return Math.PI * radius * radius;    
        
    }
    
  
    public double calculateCircumference()    { 
       
       return  2 * Math.PI * radius;   
    }
}
class prog{
    public static void main(String[] args)  {
        int r;
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        Circle c= new Circle(r);
        System.out.println("Area = "+String.format("%.2f", c.calculateArea()));
        System.out.println("Circumference = " + String.format("%.2f", c.calculateCircumference()));
        
        sc.close();
    }
}
