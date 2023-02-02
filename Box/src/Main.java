import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
       /*
        1. Create a class called Box, with 3 attributes: length, breadth and height. Make them
private./]]]]

The class will have the methods
setLength,
setBreadth,
setHeight,
getVolume ,
 to set the attributes values and to get the volume.

 In the Main class create 2 objects
 (Box1 and Box2),
 give values to length, height and breadth and
  calculate the volume of each object box.

        */



        Box box1= new Box(4, 4, 4);
        Box box2= new Box(1,1,2);
        System.out.println("For Box1, the length is " + box1.getLength() +
                " the breadth is " + box1.getBreadth() +
                " the height is " + box1.getHeight() +
                " and the volume is " + box1.getVolume() + ".");

        box1.cube();


    }
}