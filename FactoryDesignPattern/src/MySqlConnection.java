class MySqlConnection extends AbstractDbConnection {


    @Override
    public String getConnection() {
        return toString();

    }


    @Override
    void initiliaze() {
        this.driver="MySqlDriver";
        this.userName="MySqlUser";
        this.port="MysqlPort";
        this.password="MySqlPassword";
    }


    @Override
    public String toString() {
        return "MySqlConnection{" +
                "host='" + host + '\'' +
                ", driver='" + driver + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
