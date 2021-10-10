public abstract class Person {
    private String name;
    private Integer speed;
    protected TypeOfLocation location;

    public String getName() {
        return name;
    }

    public Integer getSpeed(){
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Person(){
        name = "Неизвестный чел";
        speed = 0;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(Integer speed){
        super();
        this.speed = speed;
    }

    public Person(String name, Integer speed){
        this.name = name;
        this.speed = speed;
    }

}
