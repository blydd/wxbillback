package com.bgt.billback.controller;

import com.bgt.billback.common.Result;
import com.bgt.billback.dto.WxLoginRequest;
import com.bgt.billback.service.UserService;
import com.bgt.billback.vo.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    @PostMapping("/login")
    public Result<LoginResponse> login(@RequestBody WxLoginRequest request) {
        LoginResponse response = userService.wxLogin(request);
        return Result.success(response);
    }

    @GetMapping("/test")
    public Result<String> test() {
        return Result.success("服务正常启动。。。。。。。。。");
    }

}