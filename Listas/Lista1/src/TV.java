/**
 *
 * @author Vitória
 */
public class TV {
    private int canal, volume;

    public TV(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public void aumentaVolume(){
        this.volume = this.volume + 1;
    }
    
    public void diminuiVolume(){
        this.volume = this.volume - 1;
    }
}
