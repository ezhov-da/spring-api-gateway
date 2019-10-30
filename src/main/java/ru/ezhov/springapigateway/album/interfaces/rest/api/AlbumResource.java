package ru.ezhov.springapigateway.album.interfaces.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ezhov.springapigateway.album.domain.album.Album;
import ru.ezhov.springapigateway.album.domain.album.AlbumRepository;

@RestController
@RequestMapping("/albums")
public class AlbumResource {

    private AlbumRepository albumRepository;

    public AlbumResource(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @GetMapping
    private Flux<Album> getAllAlbums() {
        return albumRepository.all();
    }

    @GetMapping("/{id}")
    private Mono<Album> getAlbumBy(@PathVariable int id) {
        return albumRepository.by(id);
    }
}
