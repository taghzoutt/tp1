package metier;
import dao.Idao;

public class metierImpl implements Imetier {
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        return t*43/3;
    }
}

}
