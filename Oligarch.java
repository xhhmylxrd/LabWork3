import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Oligarch extends Person implements NormalAction{

    public HashSet<TypeOfBelongings> inventory = new HashSet<>();


    public Oligarch(String name, Integer speed){
        super(name, speed);
    }

    public Oligarch(){
        super();
    }

    public Oligarch(String name, Integer speed, TypeOfLocation location){
        super(name, speed);
        this.location = location;
    }

    @Override
    public void changeLocation(TypeOfLocation location) {
        this.location = location;
        System.out.println(this.getName() + " переместился в " + location);
    }

    @Override
    public void getPotato() {
        if (this.location != TypeOfLocation.FIELD){
            System.out.println("На данной локации нет картошки");
        }
        else{
            this.inventory.add(TypeOfBelongings.ROOTS);
            this.inventory.add(TypeOfBelongings.TUBERS);
            System.out.println("Клубни и корни были собраны");
        }
    }

    @Override
    public void getRidOfTubers() {
        if (inventory.contains(TypeOfBelongings.TUBERS)){
            inventory.remove(TypeOfBelongings.TUBERS);
            System.out.println(getName() +" Выкинул батву");
        }
        else{
            System.out.println(getName() +" И так не имеет при себе батвы");
        }
    }


    @Override
    public String toString(){
        return "Oligarch { " + this.getName() + " " + this.getSpeed() + " " + inventory.toString();
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.getClass(), this.getName(), this.getSpeed(), inventory);
    }
    @Override
    public boolean equals(Object o){
        return o == this;
    }

    public void putOnCylinder(){
        if (this.inventory.contains(TypeOfBelongings.CYLINDER)){
            System.out.println("Цилиндр уже надет");
        }
        else{
            this.inventory.add(TypeOfBelongings.CYLINDER);
        }
    }
}
