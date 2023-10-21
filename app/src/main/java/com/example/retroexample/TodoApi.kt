
import com.example.retroexample.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("api/login")
    suspend fun fetchData(): Response<ApiResponse>
}
