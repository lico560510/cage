package tw.org.iii.cageeetext;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class cage59 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.microsoft.com");
			//host name or ip 主機名稱 www.microsoft.com 有很多組IP
			//要先檢查DNS相關規定 DNS就是問哪一台主機
			for(InetAddress ip:ips) {
				System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
		}
		
	}

}
