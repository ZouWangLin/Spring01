package cn.itheima.entity;

public class Grade {
	private Integer id;//年级id
	private String gradeName;//年级名
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public Grade(Integer id, String gradeName) {
		super();
		this.id = id;
		this.gradeName = gradeName;
	}
	public Grade() {
		super();
	}
	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeName=" + gradeName + "]";
	}
	
	

}
