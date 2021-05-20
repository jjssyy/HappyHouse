package com.ssafy.house.model;

public class InfoDto {
	int no;
	String dong;
	String dAptName;
	String code;
	String buildYear;
	String jibun;
	String lat;
	String lng;
	String img;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getdAptName() {
		return dAptName;
	}
	public void setdAptName(String dAptName) {
		this.dAptName = dAptName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBuildYear() {
		return buildYear;
	}
	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}
	public String getJibun() {
		return jibun;
	}
	public void setJibun(String jibun) {
		this.jibun = jibun;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String toString() {
		return no+"/"+
		dong+"/"+
		dAptName+"/"+
		code+"/"+
		buildYear+"/"+
		jibun+"/"+
		lat+"/"+
		lng+"/"+
		img;
	}
}
