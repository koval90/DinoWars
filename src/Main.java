
import model.Ankylosaur;
import model.TRex;

public class Main {
    public static void main(String[] args) {

        TRex trex1 = new TRex(100, 30,10);
        Ankylosaur ankylosaur1 = new Ankylosaur(100, 20, 30);

        System.out.println(trex1.getAttackPower());
        System.out.println(ankylosaur1.getHp());

        trex1.attack(ankylosaur1);

        System.out.println(ankylosaur1.getHp());


    }
}