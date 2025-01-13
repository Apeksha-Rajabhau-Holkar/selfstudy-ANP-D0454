package com.demo;

public class First {

	public static void main(String[] args) {
		 int Total_Score=500;
		 int sub1 = 88;                            //initializing subject1 marks                        
	    	 int sub2 = 80;
	     	int sub3 = 78;
	     	int sub4 = 44;
	     	int sub5 = 68;
	     
	     	 int total = (sub1+sub2+sub3+sub4+sub5);    // total calculated
	    	 System.out.println("Total : "+ total);     // printing total
	     
//	     	 float percentage= (float) (total * 100) / Total_Score;
//	   	 System.out.println(percentage); 

	     	 float p = (float)total;                    // typecasting
		 float percentage = (float) ((p/500.0)*100.0);
		 System.out.println("Percentage : "+ percentage);   // printing percentage	
		 
		 
		 //Area of Rectangle
		 int length = 5;
		 int breadth = 10;
		 int area_rectangle=(length*breadth);
		 System.out.println("Area of Rectangle: "+area_rectangle);                 //area of rectangle calculating
		 
		 
		 //Area of Triangle
		 float base = 10.5f;
		 float height = 11.5f;
		 float area_triangle = ((1/2)*(base*height));
		 System.out.println("Area of Triangle : "+ area_triangle);                //print Area of Triangle
		 
		 
		 //Area of Square
		 int side=5;
		 System.out.println("Area of Square :"+(side*side));                       //print Area of Square
		 
		 
		 //Area of circle
		 double pi = 3.14;
		 double radius = 5.0;
		 double area_circle = (pi*radius*radius);
		 System.out.println("Area of circle :"+area_circle);                      //print Area of Circle
		 
		 
	}

}



output:
Total : 358
Percentage : 71.6
Area of Rectangle: 50
Area of Triangle : 0.0
Area of Square :25
Area of circle :78.5