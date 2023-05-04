package academy.devdojo.springboot2essentials.requests;

import jakarta.validation.constraints.NotEmpty;

public class AnimePutRequestBody {
    private Long id;
    @NotEmpty(message = "Anime name cannot be empty")
    private String name;

    private AnimePutRequestBody() {}

    public AnimePutRequestBody(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
