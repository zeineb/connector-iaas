package org.ow2.proactive.connector.iaas.fixtures;

import org.json.JSONObject;
import org.ow2.proactive.connector.iaas.model.Credentials;
import org.ow2.proactive.connector.iaas.model.Infrastructure;

public class InfrastructureFixture {

	public static String getInfrastructureAsaString(String name, String type, String endPoint, String userName,
			String password, String privateKey) {
		JSONObject jsonObject = new JSONObject(getInfrastructure(name, type, endPoint, userName, password, privateKey));
		return jsonObject.toString();
	}

	public static Infrastructure getInfrastructure(String name, String type, String endPoint, String username,
			String password, String privateKey) {
		return new Infrastructure(name, type, endPoint, new Credentials(username, password, privateKey));
	}

	public static Infrastructure getSimpleInfrastructure(String type) {
		return new Infrastructure("id-" + type, type, "endPoint", new Credentials("userName", "password", "edoe"));
	}

}
