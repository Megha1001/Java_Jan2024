package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Point [] points = {new Point(3,5), new Point(1,2), new Point(0,4), new Point(4,5)};
        Arrays.sort(points, new MyComparator());
        for (int i=0; i< points.length; i++){
            System.out.println(points[i].x+" "+points[i].y);
        }
    }
}

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}

class MyComparator implements Comparator<Point>{

    @Override
    public int compare(Point o1, Point o2) {
        return o1.x - o2.x;
    }
}