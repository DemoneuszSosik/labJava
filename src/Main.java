public class Main {
    public static void main(String[] args) {
        Point p1=new Point(3,6);
        Point p2=new Point(1,5);
        Segment seg=new Segment(p1,p2);

        System.out.println(seg.distance());

        System.out.println(seg.toSvg());
    }
}