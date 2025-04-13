package dao;

public class DaoImpl implements Idao {
    @Override
    public double getData() {
        System.out.println("Version Base de données");
        double temp = 23;
        return temp;
    }
}


