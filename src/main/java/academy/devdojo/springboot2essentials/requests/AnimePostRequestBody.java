package academy.devdojo.springboot2essentials.requests;

import jakarta.validation.constraints.NotEmpty;

public class AnimePostRequestBody {
    @NotEmpty(message = "Anime name cannot be empty")
    private String name;

    private AnimePostRequestBody() {
    }

    public AnimePostRequestBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
