package cn.gaoyuexiang.user.mock.api.model;

public class SignInResp {
	private int uid;
	private String token;
	private String status;

	public SignInResp() {}

	public SignInResp(int uid, String token, String status) {
		this.uid = uid;
		this.token = token;
		this.status = status;
	}

	public SignInResp(String status) {
		this.status = status;
	}

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
