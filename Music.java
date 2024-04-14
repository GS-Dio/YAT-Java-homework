public class Music {
    public String name;
    public int SongLength;

    public Music(String name, int songLength) {
        this.name = name;
        SongLength = songLength;
    }

    public void play(){
        System.out.println("La la la la la la.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSongLength() {
        return SongLength;
    }

    public void setSongLength(int songLength) {
        SongLength = songLength;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", SongLength=" + SongLength +
                '}';
    }
}
