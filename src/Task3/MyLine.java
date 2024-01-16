package Task3;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin.setXY(x1, y1);
        end.setXY(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int EndX) {
        end.setX(EndX);
    }

    public int getEndY() {
        return begin.getY();
    }

    public void setEndY(int endY) {
        end.setX(endY);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x1, int y1) {
        begin.setXY(x1, y1);
    }

    public int[] getEndXY() {
        return begin.getXY();
    }

    public void setEndXY(int x1, int y1) {
        begin.setXY(x1, y1);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {

        return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
    }

    @Override
    public String toString() {
        return "MyLine[ begin=" + begin.toString() + ", end = " + end.toString();
    }
}
