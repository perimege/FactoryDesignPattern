abstract public class AbstractDbConnection{

    public final String host="localhost";
    public String driver;

    public String port;

    public String userName;

    public String password;

    abstract void initiliaze();

    public AbstractDbConnection(){
        initiliaze();
    }



}
