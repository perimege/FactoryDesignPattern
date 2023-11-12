class MongoDbConnection extends AbstractDbConnection implements IDbConnection {
    @Override
    public String getConnection() {
        return toString();
    }

    void initiliaze() {
        this.driver="MongoDbDriver";
        this.userName="MongoDbUser";
        this.port="MongoDbPort";
        this.password="MongoDbPassword";
    }


    @Override
    public String toString() {
        return "MongoDbConnection{" +
                "host='" + host + '\'' +
                ", driver='" + driver + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
