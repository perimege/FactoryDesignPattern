public class DbConnectionFactory {

    public static IDbConnection getInstance(DbType dbType){
        switch (dbType){
            case MYSQL: return new MySqlConnection();
            case POSTGRESQL:return new PostgreSqlConnection();
            case MONGODB:return new MongoDbConnection();
            default:throw new UnsupportedOperationException();
        }
    }
}
