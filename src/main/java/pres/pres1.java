package pres;
import dao.DaoImpl;
import ext.DaoImplV2;
import metier.metierImpl;

public class pres1 {
    public static void main(String[] args){
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES="+metier.calcul());
    }

}
