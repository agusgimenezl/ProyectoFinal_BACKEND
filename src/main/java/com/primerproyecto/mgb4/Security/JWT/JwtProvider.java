/*
Esta clase GENERA EL TOKEN
 */
package com.primerproyecto.mgb4.Security.JWT;

import com.primerproyecto.mgb4.Security.Entity.UsuarioPrincipal;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import static io.jsonwebtoken.Jwts.parser;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/*
Esta clase genera el token y tiene metodos de validación
 */

@Component
public class JwtProvider { 
     private final static Logger logger= LoggerFactory.getLogger(JwtProvider.class);
    
     @Value("${jwt.secret}")
     private String secret;
     @Value("${jwt.expiration}")
     private int expiration;
     
     public String generateToken(Authentication authentication){
         UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
         return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
                 .setIssuedAt(new Date()) //toma la fecha y la guarda
                 .setExpiration(new Date(new Date().getTime()+expiration*1000))
                 .signWith(SignatureAlgorithm.HS512, secret)
                 .compact();
     }
     
     public String getNombreUsuarioFromToken(String token){
         return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
         
     }
     
     public boolean validateToken(String token){
         try{
             Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
             return true;
         } catch (MalformedJwtException e){
             logger.error("Token mal formado");
              } catch (UnsupportedJwtException e){
             logger.error("Token no soportado");
              } catch (ExpiredJwtException e){
             logger.error("Token espirado");
              } catch (IllegalArgumentException e){
             logger.error("Token Vacío");
              } catch (SignatureException e){
             logger.error("Firma inválida");
         }
         return false;
     }
     
}

