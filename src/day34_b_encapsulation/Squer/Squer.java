package day34_b_encapsulation.Squer;

public class Squer {
    private int side;

    public Squer(int side){
        this.side = side;
    }

    public void setSide(int side){
        if(side>0){
            this.side = side;
        }
    }

    public int getSide(){
        return side;
    }
}
