package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.model.Connection;

@Component
public class ProviderService {

	ArrayList<Connection> connectionList = new ArrayList<Connection>();
	
	public ArrayList<Connection> getConnectionList() {
		return connectionList;
	}

	public void setConnectionList(ArrayList<Connection> connectionList) {
		this.connectionList = connectionList;
	}

	public ProviderService(){
		connectionList.add(new Connection(1, "John Doe", "Basic Plan", "prepaid"));
        connectionList.add(new Connection(2, "Jane Smith", "Premium Plan", "postpaid"));
	}
	
	public boolean updateConnectionType(int connectionNum,String connectionType) {
		for (Connection conn : connectionList) {
			if (conn.getConnectionNum() == connectionNum) {
				conn.setConnectionType(connectionType);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteConnection(int connectionNum) {
		return connectionList.removeIf(conn -> conn.getConnectionNum() == connectionNum);
	}
}
