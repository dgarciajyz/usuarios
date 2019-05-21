package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Usuario;

//import java.util.Ma/p;
import java.util.*;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-05-21T11:07:10.746Z[GMT]")public class UserApiServiceImpl extends UserApiService {
    List<Usuario> users = new LinkedList<Usuario>();
    @Override
    public Response inicioSesionUsuarios( @NotNull String username,  @NotNull String password, SecurityContext securityContext) throws NotFoundException {
        String mess="No puedes iniciar sesion";
        for(int i = 0; i<users.size();i++){
            if(users.get(i).getUsername().equals(username)&&users.get(i).getPassword().equals(password))
                mess="Sesion iniciada";
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, mess)).build();
    }
    @Override
    public Response logoutUsuario(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Sesion Cerrada!")).build();
    }
    @Override
    public Response registroUsuarios(Usuario body, SecurityContext securityContext) throws NotFoundException {
        Usuario u = new Usuario();
        u.setIdUsuario(body.getIdUsuario());
        u.setUsername(body.getUsername());
        u.setPassword(body.getPassword());
        users.add(u);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Registro Correcto")).build();
    }
}
