public class Segment {
    private Point p1,p2;
    public Segment(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public double distance(){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y- p2.y,2));
    }
    public String toSvg(){
        return String.format("<line x1=\"%.2f\" y1=\"%.2f\" x2=\"%.2f\" y2=\"%.2f\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />",p1.x,p1.y,p2.x,p2.y);
    }
}
