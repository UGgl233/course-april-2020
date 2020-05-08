package com.corejava.oopTopic.interface_;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class DataSource {
    String dataSource;
    public DataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection() {
        Connection conn = new Connection();
        return conn;
    }
}
