package ext;
import dao.Idao

public class DaoImplV2 implements Idao{

    @Override
    public double getData() {
        System.out.println("Version web service");
        return 41;
    }
}
}
