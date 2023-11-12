class PostgreSqlConnection extends AbstractDbConnection implements IDbConnection {
    @Override
    public String getConnection() {
        return toString();
    }

    @Override
    void initiliaze() {
        this.driver="PostgreSqlDriver";
        this.userName="PostgreSqlUser";
        this.port="PostgreSqlPort";
        this.password="PostgreSqlPassword";
    }


    @Override
    public String toString() {
        return "PostgreSqlConnection{" +
                "host='" + host + '\'' +
                ", driver='" + driver + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
