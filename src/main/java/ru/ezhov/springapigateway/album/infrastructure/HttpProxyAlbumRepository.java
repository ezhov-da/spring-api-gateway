package ru.ezhov.springapigateway.album.infrastructure;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ezhov.springapigateway.album.domain.album.Album;
import ru.ezhov.springapigateway.album.domain.album.AlbumRepository;

@Repository
public class HttpProxyAlbumRepository implements AlbumRepository {
    @Override
    public Flux<Album> all() {
        return WebClient.create("http://jsonplaceholder.typicode.com/albums")
                .get()
                .retrieve()
                .bodyToFlux(Album.class);
    }

    @Override
    public Mono<Album> by(int id) {
        return WebClient.create("http://jsonplaceholder.typicode.com/albums?id=" + id)
                .get()
                .retrieve()
                .bodyToMono(Album.class);
    }
}
