package oopsdemo4;

//Shape-->Circle-->Rectangle-->ShapeTest
public interface Shape {

	 //implicitly public, static and final--by default
    public String LABLE="Shape";
    
    //interface methods are implicitly abstract and public--by deafult
    void draw();
    
    double getArea();
}
