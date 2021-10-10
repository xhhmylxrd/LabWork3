import java.util.Objects;

public class SecurityGuard extends Person implements AgressiveAction{

    private Integer attentiveness;

    public SecurityGuard(String name, Integer speed, Integer attentiveness){
        super(name, speed);
        this.attentiveness = attentiveness;
    }

    public void setAttentiveness(Integer attentiveness) {
        this.attentiveness = attentiveness;
    }

    public SecurityGuard(String name, Integer speed, Integer attentiveness, TypeOfLocation location){
        super(name, speed);
        this.attentiveness = attentiveness;
        this.location = location;
    }

    @Override
    public void tryToCatch(Oligarch enemy) {
        if (enemy.location == this.location){
            if (this.attentiveness * 0.25 + this.getSpeed() >= enemy.getSpeed()){
                System.out.println("Негодяй был успешно пойман!");
                if(enemy.inventory.contains(TypeOfBelongings.ROOTS)){
                    enemy.inventory.remove(TypeOfBelongings.ROOTS);
                    System.out.println("А корни у него были отобраны.");
                }
                else{
                    System.out.println("Но корней у него не окозалось");
                }
            }
            else{
                System.out.println(enemy.getName() + " удалось вырваться");
                enemy.changeLocation(TypeOfLocation.THICKETS);
            }
        }
        else{
            System.out.println("А кого ловить то?");
        }
    }

    @Override
    public String toString(){
        return "Oligarch { " + this.getName() + " " + this.getSpeed() + " " + attentiveness;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.getClass(), this.getName(), this.getSpeed(), attentiveness);
    }
    @Override
    public boolean equals(Object o){
        return o == this;
    }


}
