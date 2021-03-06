package com.example.demo.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import com.example.demo.model.request.*;
import com.example.demo.model.responses.*;
import com.example.demo.util.*;

@RequestMapping("/admin") // 所有本类中方法的请求路径都以 /admin 开头
@Controller
@Slf4j
public class UmsAdminController {

	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/login") // 因为在类前注释了“@RequestMapping("/admin")”，只需要写 /admin 之后的路径
	public CommonResult login(@RequestBody LoginParam param) { // 传入参数为 RequestBody （在文档中标识为 body）

		Map<String, String> tokenMap = new HashMap<>();
		tokenMap.put("token", null);
		tokenMap.put("tokenHead", null);

		if (param.getPassword().equals("123") && param.getUsername().equals("abc")) {
			log.info("User {} logged in.", param.getUsername());
			return CommonResult.success(tokenMap);
		} else {
			log.warn("User {} failed to log in.",param);
			return new CommonResult(404, null, "Fail");
		}
	}

	@ResponseBody
	@PostMapping("/logout")
	public CommonResult logout() {
		log.info("User logged out");
		return new CommonResult(200, null, "Succeed");
	}

	@ResponseBody
	@GetMapping("/info")
	public CommonResult info(Principal principal) { // 传入参数为 RequestHeader 中的 parameter （在文档中标识为 query）

		String username = "abc";
		log.info("Getting user " + username + "'s information...");
		Map<String, Object> data = new HashMap<>();
		data.put("username", username);
		data.put("menus", LoginUtil.getMenuList());
		data.put("icon", "");
		data.put("roles", LoginUtil.getRoleList());

		return CommonResult.success(data);
	}
}