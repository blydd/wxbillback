package com.bgt.billback.service;


import com.bgt.billback.dto.WxLoginRequest;
import com.bgt.billback.vo.LoginResponse;

public interface UserService {
    LoginResponse wxLogin(WxLoginRequest request);
}