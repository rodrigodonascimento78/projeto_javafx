module projeto_javafx_jdbc {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.sql;
	
	opens application;
	opens gui;
	opens model.entities;
	opens db;
}
