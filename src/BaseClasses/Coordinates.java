package BaseClasses;

public class Coordinates {
    private Double x; //Максимальное значение поля: 33, Поле не может быть null
    private float y;
    public Coordinates(Double x, float y){
        this.x=x;
        this.y=y;
    }
    public void setX(Double x){
        this.x=x;
    }
    public Double getX(Double x){
        return x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getY(float y){
        return y;
    }
}
