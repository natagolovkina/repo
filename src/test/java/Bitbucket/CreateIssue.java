package Bitbucket;
import org.junit.Test;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import Bitbucket.BitbucketClient;
import retrofit2.http.GET;


public class CreateIssue {

    @Test
    public void testRepositories() throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.bitbucket.org")
                .build();
        BitbucketClient client = retrofit.create(BitbucketClient.class);
//        return client;
        System.out.println(client);

    }

}
