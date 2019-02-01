package com.bytrustu.controller;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

	@Test
	public void TestConnection() {
		try ( Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr") ) {
			log.info(conn);
		} catch ( Exception e ) {
			fail(e.getMessage());
		}
	}
}
