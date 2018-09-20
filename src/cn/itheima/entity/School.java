package cn.itheima.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class School {
	private List<Student> studentList;
	private Map<String,Student> studentMap;
	private Properties properties;
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public Map<String, Student> getStudentMap() {
		return studentMap;
	}
	public void setStudentMap(Map<String, Student> studentMap) {
		this.studentMap = studentMap;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public School(List<Student> studentList, Map<String, Student> studentMap, Properties properties) {
		super();
		this.studentList = studentList;
		this.studentMap = studentMap;
		this.properties = properties;
	}
	public School() {
		super();
	}
	@Override
	public String toString() {
		return "School [studentList=" + studentList + ", studentMap=" + studentMap + ", properties=" + properties + "]";
	}
	
	

}
