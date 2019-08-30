import apiexample.GithubClient;
import apiexample.Repository;
import org.junit.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GithubTest {

    @Test
    public void testRepositories() throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build();
        GithubClient client = retrofit
                .create(GithubClient.class);


        List<Repository> body = client.listRepos("natagolovkina").execute().body();

        System.out.println(body);

        assertEquals(body.get(0).name, "repo");


    }
}