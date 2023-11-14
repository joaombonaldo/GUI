public class Equipe {
    private String codinome;
    private int quantidade;
    private double latitude;
    private double longitude;

    public Equipe(String codinome, int quantidade, double latitude, double longitude){
        this.codinome = codinome;
        this.quantidade = quantidade;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCodinome(){
        return this.codinome;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public void setCodinome(String codinome){
        this.codinome = codinome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    @Override
    public String toString(){
        return "Codinome: " + this.codinome + "\nQuantidade: " + this.quantidade + "\nLatitude: " + this.latitude + "\nLongitude: " + this.longitude + "\n -----------------";
    }
}
