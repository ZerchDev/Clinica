package com.mx.ClinicaPrivada.controlador;

import com.mx.ClinicaPrivada.entidades.usuarios.DatosUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/login")
public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping(name = "/registrar")
    public ResponseEntity login(@RequestBody DatosUsuario datosUsuario){
        Authentication token=new UsernamePasswordAuthenticationToken(datosUsuario.nombre(),datosUsuario.contraseña());
        authenticationManager.authenticate(token);
        return ResponseEntity.ok().build();

    }
}
