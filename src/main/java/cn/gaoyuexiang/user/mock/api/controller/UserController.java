package cn.gaoyuexiang.user.mock.api.controller;

import cn.gaoyuexiang.user.mock.api.model.Rename;
import cn.gaoyuexiang.user.mock.api.model.Resp;
import cn.gaoyuexiang.user.mock.api.model.SignInResp;
import cn.gaoyuexiang.user.mock.api.model.User;
import org.springframework.web.bind.annotation.*;

@RestController("user")
public class UserController {

	@PostMapping("signup")
	public SignInResp signUp(@RequestBody User user) {
		if (user.getUsername().equals("唐旭东")) {
			return new SignInResp(1000, "token", "success");
		}
		return new SignInResp("username_existed");
	}

	@PostMapping("login")
	public SignInResp login(@RequestBody User user) {
		if (user.getUsername().equals("唐旭东") &&
			user.getPassword().equals("3C0EC236F00D3E8B3B0DA5F96B20622A")) {
			return new SignInResp(1000, "token", "success");
		}
		return new SignInResp("failed");
	}

	@PostMapping("rename")
	public Resp rename(@RequestBody Rename rename,
	                   @RequestHeader("uid") int uid,
	                   @RequestHeader("token") String token) {
		if (uid == 1000 && token.equals("token")) {
			return new Resp("success");
		}
		return new Resp("failed");
	}

	@GetMapping("logout")
	public Resp logout(@RequestHeader("uid") int uid,
	                   @RequestHeader("token") String token) {
		return null;
	}

}
