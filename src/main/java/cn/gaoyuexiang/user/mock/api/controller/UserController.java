package cn.gaoyuexiang.user.mock.api.controller;

import cn.gaoyuexiang.user.mock.api.model.SignUpResp;
import cn.gaoyuexiang.user.mock.api.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

	@PostMapping("signup")
	public SignUpResp signUp(@RequestBody User user) {

		return null;
	}

}
