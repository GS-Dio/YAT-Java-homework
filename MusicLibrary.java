import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<Music> musicList;

    public MusicLibrary(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void addMusic(Music music){
        musicList.add(music);
    }
    public void remove(Music music){
        musicList.remove(music);
    }
    public void randomPlay(){
        Random random = new Random();
        int randomIndex = random.nextInt(musicList.toArray().length);
        musicList.get(randomIndex).play();
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public String toString() {
        return "MusicLibrary{" +
                "musicList=" + musicList +
                '}';
    }
}
