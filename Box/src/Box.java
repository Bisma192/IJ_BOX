public class Box
{
    //VARIABLES
    private double length;
    private double breadth;
    private double height;
    public double volume;

//CONSTRUCTOR
    public Box( double length, double breadth, double height)
    {
        this.length= length;
        this.breadth= breadth;
        this.height= height;
    }

//SETTERS
    public void setLength()
    {
        this.length=length;
    }
    public void setBreadth()
    {
        this.breadth=breadth;
    }
    public void setHeight()
    {
        this.height=height;
    }


    //GETTERS
    public double getVolume()
    {
        return length+height+breadth;

    }

    public double getLength()
    {
        return length;
    }
    public double getHeight()
    {
        return height;
    }
    public double getBreadth()
    {
        return breadth;
    }

    //METHOD
    public void cube(){
        if (height== breadth && breadth==length)
        {
            System.out.println("its a cube!");
        }
        else{
            System.out.println("not a cube!");
        }
    }

}



