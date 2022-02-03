package Lab_03;

/**
 * Name: Justin Houle
 * Date: 2022/02/08
 * Description: The main class used to test the class MyPoint
 */

public class Main {
    /**
     * Multiple tests to see if the methods from the class MyPoint function properly.
     *
     * @param args command lines
     */
    public static void main(String[] args){

        // Testing is constructor with initial variables works
        MyPoint p0 = new MyPoint(1.0, 2.0);
        MyPoint p1 = new MyPoint(2.0, 2.0);
        MyPoint p2 = new MyPoint(4.0, 2.0);
        MyPoint p3 = new MyPoint(4.0, 2.0);
        MyPoint p4 = new MyPoint(8.0, 2.0);
        MyPoint p5 = new MyPoint(6.0, 2.0);

        // Testing getter instance, and constructor works
        MyPoint p6 = new MyPoint();
        p6.setX(1.0);
        p6.setY(3.0);

        // initializing test arrays
        MyPoint[] full_arr = {p0,p1,p2,p3,p4,p5,p6};
        MyPoint[] incom_arr = {p0,p1,p2,p3,p4,p5};

        // Testing toString override instance method
        System.out.println("\nTest for toString method override:");
        for(int i = 0; i < full_arr.length;i++){
            System.out.println("p" + i + ": " + full_arr[i]);
        }

        // Testing equals override instance method for true and false cases
        System.out.println("\nTest for equals method override:");
        for(int i = 0; i < full_arr.length; i++){
            if(p2.equals(full_arr[i])){
                System.out.println("p2 == p" + i + ": True");
            }
            else{
                System.out.println("p2 == p" + i + ": False");
            }
        }

        // Test for the distance between 2 coordinates
        System.out.println("\nTest for the Euclidean distance between 2 coordinates:");
        System.out.println("Distance between p6: " + p6 + ", and p5: " + p5 + " is: " + p6.distance(p5));

        // Test for the distance between 1 point and another point
        System.out.println("\nTest for the Euclidean distance to another point:");
        System.out.println("Distance between p6: " + p6 + " and point: [5, 10] is: " + p6.setPointDistance(5.0,10.0));

        // Test for Contains class method both true and false cases
        System.out.print("\nTest #1 for the contains class method is point p6 in full_arr?");
        if(MyPoint.contains(full_arr,p6)){
            System.out.println(" True");
        }
        else{
            System.out.println(" False");
        }
        System.out.print("\nTest #2 for the contains class method, is point p6 in incom_arr?");
        if(MyPoint.contains(incom_arr,p6)){
            System.out.println(" True");
        }
        else{
            System.out.println(" False");
        }

        // Tests for th horizontal class method, both true and false cases
        System.out.print("\nTest #1 for the horizontal class method, is the array: full_arr,  a horizontal line?");
        if(MyPoint.horizontal(full_arr)){
            System.out.println(" True");
        }
        else{
            System.out.println(" False");
        }
        System.out.print("\nTest #2 for the horizontal class method, is the array: incom_arr, a horizontal line?");
        if(MyPoint.horizontal(incom_arr)){
            System.out.println(" True");
        }
        else{
            System.out.println(" False");
        }

    }

}

