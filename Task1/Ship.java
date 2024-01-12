package Task1;

public class Ship {
    private String name;
    private String arivalTime; //время прибытия
    private int stayTime;  //время пребывания
    private boolean isDistress; //терпит бедствие


    public Ship(String name, String arivalTime, int stayTime, boolean isDistress) {
        this.name = name;
        this.arivalTime = arivalTime;
        this.stayTime = stayTime;
        this.isDistress = isDistress;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArivalTime() {
        return arivalTime;
    }
    public void setArivalTime(String arivalTime) {
        this.arivalTime = arivalTime;
    }
    public int getStayTime() {
        return stayTime;
    }
    public void setStayTime(int stayTime) {
        this.stayTime = stayTime;
    }
    public boolean isDistress() {
        return isDistress;
    }
    public void setDistress(boolean distress) {
        isDistress = distress;
    }

    public void overtime(){
        String[] num = arivalTime.split(":");
        String numHour = num[0];
        String numMin = num[1];
        int min = Integer.parseInt(numHour) + Integer.parseInt(numMin);
        int stay = min + stayTime;
        if (isDistress)
            System.out.println(name);
        else if (min + stayTime < 600){
            System.out.println(name);
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", arivalTime='" + arivalTime + '\'' +
                ", stayTime=" + stayTime +
                ", isDistress=" + isDistress +
                '}';
    }

    public static void main(String[] args) {
        Ship ship1 = new Ship("HERMES","8:30",120,false);
        Ship ship2 = new Ship("TITO","5:00", 30, false);
        Ship ship3 = new Ship("SHANYRAK","10:10",25 , true);
        Ship ship4 = new Ship("BOLONA","18:15",30,true);
        Ship ship5 = new Ship("KELVIN", "2:05" ,480, false);
        Ship ship6 = new Ship("TATOOAN", "5:00", 180, false);
        Ship ship7 = new Ship("KIKOGAWA", "6:45",1020, true);
        Ship ship8 = new Ship("RAMSES", "9:45", 30, false);
        Ship ship9 = new Ship("RAMSES", "9:45", 30, false);
        Ship ship10 = new Ship("HELENA", "7:30",300, false);

        ship1.overtime();
        ship2.overtime();
        ship3.overtime();
        ship4.overtime();
        ship5.overtime();
        ship6.overtime();
        ship7.overtime();
        ship8.overtime();
        ship9.overtime();
        ship10.overtime();
    }
}
