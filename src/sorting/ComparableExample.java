package sorting;


import java.util.Arrays;

public class ComparableExample {

    public static void main(String[] args) {
        Points [] points = {new Points(3,5), new Points(1,2), new Points(0,4), new Points(4,5)};
        Arrays.sort(points);
        for (int i=0; i< points.length; i++){
            System.out.println(points[i].x+" "+points[i].y);
        }
    }

}

class Points implements Comparable<Points>{
    int x;
    int y;

    Points(int x, int y){
        this.x = x;
        this.y =y;
    }

    public int compareTo(Points p){
        return this.x - p.x;
    }
}
