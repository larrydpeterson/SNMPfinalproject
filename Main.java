import java.io.IOException;

import org.snmp4j.smi.OID;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	SimpleSnmpClient client = new SimpleSnmpClient("udp:192.168.1.200/161");


	
	for (int i=01; i<25; i++) {
		
		String sysStatusUpDown = "Unknown";
		String twoDigitInterface = String.format("%02d", i);
		String sysInterface = client.getAsString(new OID(".1.3.6.1.2.1.2.2.1.2.101" + twoDigitInterface));
		String sysStatus = client.getAsString(new OID(".1.3.6.1.2.1.2.2.1.8.101" + twoDigitInterface));
		if (sysStatus.contains("1")) {
			sysStatusUpDown = "Up";
		} else if (sysStatus.contains("2")) {
			sysStatusUpDown = "Down";
		}
			
		String sysIntVlan = client.getAsString(new OID(".1.3.6.1.4.1.9.9.68.1.2.2.1.2.101" + twoDigitInterface));
		String sysIntPortSecurityEnabled = client.getAsString(new OID(".1.3.6.1.4.1.9.9.315.1.2.1.1.1.101" + twoDigitInterface));
		// 1 = Enabled, 2 = Not configured
		String sysIntPortSecurityMax = client.getAsString(new OID(".1.3.6.1.4.1.9.9.315.1.2.1.1.3.101" + twoDigitInterface));
				
		System.out.println(sysInterface + "    " + sysStatusUpDown + "   " + sysIntVlan + "    " + sysIntPortSecurityEnabled + "   " + sysIntPortSecurityMax);
		
	}
	
	
	//String sysDescr = client.getAsString(new OID(".1.3.6.1.2.1.1.1.0"));
	//String sysUptime = client.getAsString(new OID(".1.3.6.1.2.1.2.2.1.2.10101"));
	//System.out.println(sysDescr);
	//System.out.println(sysUptime);
		
	}	
	

}



