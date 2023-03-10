package org.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

public class DataSourceTest {

    private DataSource getDatasource() {
        HikariConfig config = new HikariConfig();
        config.setUsername("sa");
        config.setPassword("sa");
        config.setJdbcUrl("jdbc:h2:mem:test");
        DataSource ds = new HikariDataSource(config);
        return ds;
    }
    @Test
    public void shouldGetConnectionFromDataSource() throws SQLException {
        DataSource datasource = getDatasource();
        try (Connection con = datasource.getConnection()) {
            assertTrue(con.isValid(1));
        }
    }
}
