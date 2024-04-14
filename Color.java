public class Color {
    private String colorName;
    private int duration;

    public Color(String colorName, int duration) {
        this.colorName = colorName;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return "TrafficLightColor{" +
                "colorName='" + colorName + '\'' +
                '}';
    }
}
