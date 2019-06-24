package ru.kpfu.itis.springControllers.repository;

import com.google.gson.Gson;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.Episode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ApiService {
    private OkHttpClient okHttpClient;

    @Autowired
    public ApiService(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    public List<Episode> getEpisodes() {
        String mainUrl = "https://rickandmortyapi.com/api/episode/";
        List<Episode> episodes = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            HttpUrl.Builder urlBuilder = HttpUrl.parse
                    (mainUrl + "" + i).newBuilder();
            String url = urlBuilder.build().toString();
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            try {
                Response response = okHttpClient.newCall(request).execute();
                String jsonData = response.body().string();
                Gson g = new Gson();
                Episode episode = g.fromJson(jsonData, Episode.class);
                episodes.add(episode);
                System.out.println(episode.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return episodes;
    }
}
