package com.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author JX
 * @ClassName: com.jdbc.JDBCTemplateTest
 * @Create 2023-09-07 20:51
 * @Description: TODO
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JDBCTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 增删改
    @Test
    public void testUpdate() {
//        String sql = "INSERT INTO t_emp VALUES(NULL,?,?,?)";
//        int rows = jdbcTemplate.update(sql, "赵五", 60, "女");
//        System.out.println(rows);

//        String sql = "update t_emp set name=? where id=?";
//        int rows = jdbcTemplate.update(sql, "赵五_改", 3);
//        System.out.println(rows);

        String sql = "delete from t_emp where id = ?";
        int rows = jdbcTemplate.update(sql, 3);
        System.out.println(rows);
    }
}
