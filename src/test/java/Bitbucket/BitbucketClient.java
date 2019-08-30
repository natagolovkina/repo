package Bitbucket;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;


public interface BitbucketClient {
//    @POST("/2.0/repositories/natagolovkina/4lesson/issues")
//    Call<List> postIssue();

    @GET("/2.0/repositories/natagolovkina/4lesson/issues")
    Call<Issue> getIssue();

}
