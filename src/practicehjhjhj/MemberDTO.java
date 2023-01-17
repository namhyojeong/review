package practicehjhjhj;

public class MemberDTO {

	private String id;
	private String pwd;
	private String name;
	
	public MemberDTO() {}
	
	public MemberDTO(String id, String pwd, String name) {
		
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public void getInformation() {
		System.out.println("id = " + id);
		System.out.println("pwd = " + pwd);
		System.out.println("name = " + name);
		
	}
}
