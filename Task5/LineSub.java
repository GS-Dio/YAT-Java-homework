package Task5;
public class LineSub extends Point {
    Point end;               // Ending point

    // Constructors
   public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
   public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "end=" + end +
                "} " + super.toString();
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }
    public Point getEnd() { 
      return getEnd();
    }
    public void setBegin(Point begin) {
        setXY(begin.getX(), begin.getY());
    }
    public void setEnd(Point end) {
       this.end = end;
    }

    public int getBeginX() { return getX(); }
    public int getBeginY() { return getY(); }
    public int getEndX() { return end.getX();}
    public int getEndY() { return end.getY(); }

    public void setBeginX(int beginX) { setX(beginX); }
    public void setBeginY(int beginY) { setY(beginY); }
    public void setBeginXY(int beginX,int beginY) { setXY(beginX,beginY); }
    public void setEndX(int endX) { end.setX(endX); }
    public void setEndY(int endY) {end.setY(endY); }
    public void setEndXY(int endX,int endY) {end.setXY(endX,endY); }

    public int getLength() {
        return (int) Math.sqrt(Math.pow(getX() - end.getX(), 2) + Math.pow(getY() - end.getY(), 2));
    }
    public double getGradient() {
        return Math.atan2(end.getY() - getY(), end.getX() - getX());
    }
}
