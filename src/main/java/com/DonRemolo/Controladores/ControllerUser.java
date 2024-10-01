package com.DonRemolo.Controladores;


import com.DonRemolo.Service.AuthService;
import com.DonRemolo.entidades.AuthResponseToken;
import com.DonRemolo.entidades.Login;
import com.DonRemolo.entidades.Registro;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class ControllerUser  {

    // REGISTRO DE USUARIO

    private final AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<AuthResponseToken> login(@RequestBody Login request)
    {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponseToken> register(@RequestBody Registro request)
    {
        return ResponseEntity.ok(authService.register(request));
    }
}
