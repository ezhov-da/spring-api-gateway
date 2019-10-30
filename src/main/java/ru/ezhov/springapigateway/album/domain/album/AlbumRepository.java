package ru.ezhov.springapigateway.album.domain.album;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AlbumRepository {
    Flux<Album> all();

    Mono<Album> by(int id);
}
