package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Usuario;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-05-21T11:07:10.746Z[GMT]")public abstract class UserApiService {
    public abstract Response inicioSesionUsuarios( @NotNull String username, @NotNull String password,SecurityContext securityContext) throws NotFoundException;
    public abstract Response logoutUsuario(SecurityContext securityContext) throws NotFoundException;
    public abstract Response registroUsuarios(Usuario body,SecurityContext securityContext) throws NotFoundException;
}
