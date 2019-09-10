package professorangoti.com.restapp.services;

import java.util.List;

import professorangoti.com.restapp.entidades.Post;
import professorangoti.com.restapp.entidades.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndPoint {
    @GET("users")
    Call<List<User>> obterUsuarios();

    @POST("posts")
    Call<Post> createPost(@Body Post post);
}
