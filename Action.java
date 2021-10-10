public class Action {
    public static void main(String[] args) {
        Oligarch oligarch = new Oligarch("Vasya", 100, TypeOfLocation.TABLE);
        oligarch.putOnCylinder();
        oligarch.changeLocation(TypeOfLocation.THICKETS);
        oligarch.changeLocation(TypeOfLocation.THICKETS);
        oligarch.changeLocation(TypeOfLocation.FIELD);
        oligarch.getPotato();
        oligarch.getRidOfTubers();
        SecurityGuard securityGuard = new SecurityGuard("Petya", 80, 40, TypeOfLocation.FIELD);
        securityGuard.tryToCatch(oligarch);
    }
}
