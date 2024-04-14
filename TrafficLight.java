import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
    List<Color> colors;

    public TrafficLight() {
        this.colors = new ArrayList<>();
    }

    public void renameColor(String colorName, String newColorName){
        for (Color color : colors){
            if(color.getColorName().equals(colorName)){
                color.setColorName(newColorName);
            }
        }
    }

    public void checkColor(String colorName){
        for (Color color : colors){
          if(color.getColorName().equals("Red") || color.getColorName().equals("red")){
              System.out.println("This color is Red");
          } else if (color.getColorName().equals("Green") || color.getColorName().equals("green")) {
              System.out.println("This color is Green");
          } else
              System.out.println("This color isn't Red of Green");
        }
    }
}
