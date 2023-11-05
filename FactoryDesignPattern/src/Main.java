public class Main {
    public static void main(String[] args) {
        System.out.println(DbConnectionFactory.getInstance(DbType.MONGODB).getConnection());
        System.out.println(DbConnectionFactory.getInstance(DbType.POSTGRESQL).getConnection());
        System.out.println(DbConnectionFactory.getInstance(DbType.MYSQL).getConnection());
    }
}