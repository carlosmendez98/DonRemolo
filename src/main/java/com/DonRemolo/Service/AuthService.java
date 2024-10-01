package com.DonRemolo.Service;

import com.DonRemolo.Jwt.JwtService;
import com.DonRemolo.entidades.AuthResponseToken;
import com.DonRemolo.entidades.Login;
import com.DonRemolo.entidades.Registro;
import com.DonRemolo.entidades.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.DonRemolo.repositorio.registroRepository;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final registroRepository registroRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

   public AuthResponseToken login(Login request){
return null;
   }

   public AuthResponseToken register(Registro request){
       Registro registro1 = Registro.builder()
               .email(request.getEmail())
               .nombre(request.getNombre())
               .apellido(request.getApellido())
               .password(passwordEncoder.encode(request.getPassword()))
               .role(Role.USER) // SE INICIA CON ROL USUARIO ESTO PUEDE MODIFICAR


               .build();
       this.registroRepository.save(registro1);
       return AuthResponseToken.builder()
               .token(jwtService.getToken(registro1))
                       .build();


   }

}
