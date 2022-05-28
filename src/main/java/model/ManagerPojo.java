package model;

import java.util.Objects;

public class ManagerPojo {
	
	int mgr_id;
	String mgr_firstName;
	String mgr_lastName;
	String mgr_username;
	String mgr_password;
	
	public ManagerPojo() {
		super();
	}

	public ManagerPojo(int mgr_id, String mgr_firstName, String mgr_lastName, String mgr_username,
			String mgr_password) {
		super();
		this.mgr_id = mgr_id;
		this.mgr_firstName = mgr_firstName;
		this.mgr_lastName = mgr_lastName;
		this.mgr_username = mgr_username;
		this.mgr_password = mgr_password;
	}

	public int getMgr_id() {
		return mgr_id;
	}

	public void setMgr_id(int mgr_id) {
		this.mgr_id = mgr_id;
	}

	public String getMgr_firstName() {
		return mgr_firstName;
	}

	public void setMgr_firstName(String mgr_firstName) {
		this.mgr_firstName = mgr_firstName;
	}

	public String getMgr_lastName() {
		return mgr_lastName;
	}

	public void setMgr_lastName(String mgr_lastName) {
		this.mgr_lastName = mgr_lastName;
	}

	public String getMgr_username() {
		return mgr_username;
	}

	public void setMgr_username(String mgr_username) {
		this.mgr_username = mgr_username;
	}

	public String getMgr_password() {
		return mgr_password;
	}

	public void setMgr_password(String mgr_password) {
		this.mgr_password = mgr_password;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(mgr_firstName, mgr_id, mgr_lastName, mgr_password, mgr_username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManagerPojo other = (ManagerPojo) obj;
		return Objects.equals(mgr_firstName, other.mgr_firstName) && mgr_id == other.mgr_id
				&& Objects.equals(mgr_lastName, other.mgr_lastName) && Objects.equals(mgr_password, other.mgr_password)
				&& Objects.equals(mgr_username, other.mgr_username);
	}

	@Override
	public String toString() {
		return "ManagerPojo [mgr_id=" + mgr_id + ", mgr_firstName=" + mgr_firstName + ", mgr_lastName=" + mgr_lastName
				+ ", mgr_username=" + mgr_username + ", mgr_password=" + mgr_password + "]";
	}
	
}

