package com.nunegal.tfctienda.io;

import com.nunegal.tfctienda.modelos.Usuario;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UsuarioService {

        //METODOS Usuario
        @GET("/usuario/todos")
        Call<ArrayList<Usuario>> getUsuarios();

        @GET("/usuario/dni/{dni_usuario}")
        Call<Usuario> getUsuarioDni(@Path("dni_usuario") String dni_Usuario);

        @POST("usuario/registrar")
        Call<Usuario> postUsuario(
                @Body Usuario usuario
        );

//        @GET("login")
//        Call<LoginResponse> getLogin(
//                @Query("username") String username,
//                @Query("password") String password
//        );
//
//        @FormUrlEncoded
//        @POST("product")
//        Call<SimpleResponse> postNewProduct(
//                @Field("code") String code,
//                @Field("name") String name,
//                @Field("description") String description
//        );

}
