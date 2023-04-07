
/*
 * 
 * attribute : length , width  /  radius, side, height, base.
 * 
 * method : area, perimeter of shape
 * 
 * 
 * 
 */

import java.util.*;



class shape{

    int length,width;
    int radius;
    int side, height, base;

    shape(int length,int width){
        this.length=length;
        this.width=width;
    }
    shape(int radius){
        this.radius=radius;
    }
    shape(int side, int height, int base){
        this.side=side;
        this.height=height;
        this.base=base;
    }

}

class rectangle extends shape{

    rectangle(int length, int width){
        super(length,width);
    }

    public void area(){
        System.out.printf("Area of rectangle : %d\n",(super.length*super.width));
    }

    public void perimeter(){
        System.out.printf("Perimeter of rectangle : %d\n\n",2*(this.length+this.width));
    }
}

class circle extends shape{
    circle(int radius){
        super(radius);
    }
    public void area(){
        System.out.printf("Area of circle : %.2f\n",3.14*(super.radius*super.radius));
    }

    public void perimeter(){
        System.out.printf("Perimeter of circle : %.2f\n\n",2*(3.14*super.radius));
    }
}

class triangle extends shape{

    triangle(int side,int height, int base){
        super(side,height,base);
    }
    public void area(){
        System.out.printf("Area of triangle : %d\n",((super.height*super.base)/2));
    }

    public void perimeter(){
        System.out.printf("Perimeter of triangle : %d\n\n",(super.side+super.base+side));
    }
}



class Shapemain{
    public static void main(String [] args){

        rectangle r1 = new rectangle(4,5);
        r1.area();
        r1.perimeter();



        circle c1= new  circle(5);
        c1.area();
        c1.perimeter();

        triangle t1= new triangle(5,5,6);
        t1.area();
        t1.perimeter();

    }
}