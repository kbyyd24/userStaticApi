package cn.gaoyuexiang.user.mock.api.model;

public class SignUpResp {
	private int uid;
	private String token;
	private String status;

	public SignUpResp() {}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
