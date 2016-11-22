package cn.gaoyuexiang.user.mock.api.controller;

import cn.gaoyuexiang.user.mock.api.model.SignInResp;
import cn.gaoyuexiang.user.mock.api.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

	@PostMapping("signup")
	public SignInResp signUp(@RequestBody User user) {
		if (user.getUsername().equals("唐旭东")) {
			return new SignInResp(1000, "token", "success");
		}
		return new SignInResp("username_existed");
	}

}
