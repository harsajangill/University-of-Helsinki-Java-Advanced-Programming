public class Container {
    private int volume;

    public Container(){
        this.volume = 0;
    }

    public void add(int addAmount){
        if(addAmount > 0){
            this.volume += addAmount;
        }
        if(this.volume > 100) {
            this.volume = 100;
        }
    }

    public void remove(int removeAmount) {
        if (removeAmount > 0) {
            this.volume -= removeAmount;
        }

        if(this.volume < 0) {
            this.volume = 0;
        }
    }

    public int getVolume(){
        return this.volume;
    }

}
