package src.ENUM;

public class SonarSystems {
    public  enum Animals{
        DOG,
        CAT,
        COW,
        LION,
    }

    public static void main(String[] args) {
        Animals a = Animals.DOG;
        if(a==Animals.DOG){
            System.out.println("Verdad");
        }else {
            System.out.println("Falso");
        }
    }
}
