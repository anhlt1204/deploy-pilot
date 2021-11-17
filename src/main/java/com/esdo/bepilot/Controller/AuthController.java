package com.esdo.bepilot.Controller;

import com.esdo.bepilot.Model.Request.AccountInputDTO;
import com.esdo.bepilot.Model.Request.AuthRequest;
import com.esdo.bepilot.Model.Request.ForgotPasswordRequest;
import com.esdo.bepilot.Model.Request.ResetPasswordRequest;
import com.esdo.bepilot.Service.AuthService;
import com.esdo.bepilot.Service.jwt.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authenticationRequest) throws Exception {
        return ResponseEntity.ok(authService.login(authenticationRequest));
    }

    @PostMapping(value = "/forgot")
    public ResponseEntity<?> forgotPass(@RequestBody ForgotPasswordRequest request) {
        authService.sendOTP(request);
        return ResponseEntity.ok( authService.sendOTP(request));
    }

    @PatchMapping(value = "/reset/{id}")
    public ResponseEntity<?> reset(@PathVariable(name = "id") Long id,
                                   @RequestBody ResetPasswordRequest request) {
        return ResponseEntity.ok(authService.reset(id, request));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> saveAccount(@RequestBody AccountInputDTO account) {
        return ResponseEntity.ok(userDetailsService.save(account));
    }
}

