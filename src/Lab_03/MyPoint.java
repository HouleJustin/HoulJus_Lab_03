package Lab_03;
import java.lang.Math;

/**
 * Name: Justin Houle
 * Date: 2022/02/08
 * Description: A class called MyPoint used to create points from a plane,
 *  calculate the distance between 2 coordinates, compare 2 points from each other,
 *  output the points as strings, determine if an array of points is either horizontal or not,
 *  and determine if one point is contained in an array of points.
 */

public class MyPoint{
        private double x;
        private double y;

        /**
         * Constructor which initializes one point with values [0,0].
         */
        public MyPoint(){
            this(0.0,0.0);
        }

        /**
         * A constructor which initializes one point with values [x,y].
         *
         * @param x the x value of the coordinate.
         * @param y the y value of the coordinate.
         */
        public MyPoint(double x, double y){
            this.x = x;
            this.y = y;
        }


        // Getters
        /**
         * Gives the user access to the private variable x.
         *
         * @return the value of x from the coordinate [x,y].
         */
        public double getX(){
            return x;
        }

        /**
         * Gives the user access to the private variable y.
         *
         * @return The value of y from the coordinate [x,y].
         */
        public double getY(){
            return y;
        }

        // Setters

        /**
         * Allows the user to initialize the private variable x for the coordinate [x,y].
         *
         * @param newX the new variable for the private variable x.
         */
        public void setX(double newX){
            this.x = newX;
        }
        /**
         * Allows the user to initialize the private variable y for the coordinate [x,y].
         *
         * @param newY the new value for the private variable y.
         */
        public void setY(double newY){
            this.y = newY;
        }

        /**
         * Overrides the superclass "toString()" from java methods.
         *
         * @return The string out the coordinates of the point.
         */
        @Override
        public String toString(){
            return "["+ this.x + ", " + this.y + "]";
        }

        /**
         * Overrides the superclass "equals(Object ob)" from java methods.
         *
         * @param ob the object which is to be compared to by another point.
         *
         * @return A boolean if the object is equivalent to the inputted point.
         */
        @Override
        public boolean equals(Object ob){
            // check if the argument is a reference to this object
            if(ob == this) {
                return true;
            }

            // cast the argument to the correct type
            Lab_03.MyPoint p = (Lab_03.MyPoint) ob;

            // return the boolean value
            return ( (this.x == p.getX()) && (this.y == p.getY()) );

        }

        /**
         * Finds the Euclidean distance between 2 coordinates.
         *
         * @param coords the point [x,y] which will be used to find the distance between another point.
         * @return The Euclidean distance between the 2 coordinates.
         */
        public double distance(Lab_03.MyPoint coords){
            double diff_x = (this.x - coords.getX());
            double diff_y = (this.y - coords.getY());
            return Math.sqrt(Math.pow(diff_x,2.0) + (Math.pow(diff_y,2.0)));
        }

        /**
         * Finds the Euclidean distance between one preset point and any other point.
         *
         * @param pointX the x value of the new point [x,y].
         * @param pointY the y value of the new point [x,y].
         * @return The Euclidean distance between one preset point and any other point.
         */
        public double setPointDistance(double pointX, double pointY){
            double diff_x = (this.x - pointX);
            double diff_y = (this.y - pointY);
            return Math.sqrt(Math.pow(diff_x,2.0) + (Math.pow(diff_y,2.0)));

        }

        /**
         * Verifies if one point is contained in an array of points.
         *
         * @param points the array of points.
         * @param p the point being checked if it is contained in the array.
         * @return A boolean depending on the point p if it is in the array of points or not.
         */
        public static boolean contains(Lab_03.MyPoint[] points, Lab_03.MyPoint p){
            for(int i = 0; i < points.length; i++){
                if(p.equals(points[i])) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Checks if an array of points producing a line is horizontal or not.
         *
         * @param points the array of points, which is being checked if it produces a horizontal line.
         * @return A boolean depending if the line is horizontal or not.
         */
        public static boolean horizontal(Lab_03.MyPoint[] points){
            for(int i = 0;i < points.length;i++){
                for(int j = i+1; j < (points.length)-i;j++){
                    if(points[i].getY() != points[j].getY()){
                        return false;
                    }
                }
            }
            return true;
        }

}


