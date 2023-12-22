package collectionsframework;

import java.util.ArrayList;

public class Players_01
{
	private int pid;
	private String pname;
	private int page;
	private String pteam;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPteam() {
		return pteam;
	}
	public void setPteam(String pteam) {
		this.pteam = pteam;
	}
	@Override
	public String toString() {
		return "Players_01 [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pteam=" + pteam + "]";
	}
//	public Players_01(int pid, String pname, int page, String pteam) {
//		super();
//		this.pid = pid;
//		this.pname = pname;
//		this.page = page;
//		this.pteam = pteam;
//	}
	public void addAll(ArrayList<Players_01> cskplayer) {
		// TODO Auto-generated method stub
		
	}
	
	

}
