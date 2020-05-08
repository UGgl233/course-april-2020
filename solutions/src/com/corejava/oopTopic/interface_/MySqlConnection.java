package com.corejava.oopTopic.interface_;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class MySqlConnection implements DatabaseConnection {
    public Connection getConnection() {
        DataSource ds = new DataSource("Mysql");
        return ds.getConnection();
    }
}
