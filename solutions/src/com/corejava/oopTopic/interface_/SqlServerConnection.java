package com.corejava.oopTopic.interface_;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class SqlServerConnection implements DatabaseConnection {
    public Connection getConnection() {
        DataSource ds = new DataSource("SqlServer");
        return ds.getConnection();
    }
}
