package academy.devdojo.springboot2essentials.exception;

import java.time.LocalDateTime;

public class ExceptionDetails {
    protected final String title;
    protected final int status;
    protected final String details;
    protected final String developerMessage;
    protected final LocalDateTime timestamp;

    public abstract static class ExceptionDetailsBuilder<T extends ExceptionDetailsBuilder<T>> {
        private String title;
        private int status;
        private String details;
        private String developerMessage;
        private LocalDateTime timestamp;

        public T title(String title) {
            this.title = title;
            return self();
        }

        public T status(int status) {
            this.status = status;
            return self();
        }

        public T details(String details) {
            this.details = details;
            return self();
        }

        public T developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return self();
        }

        public T timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return self();
        }

        protected abstract T self();

        public abstract ExceptionDetails build();
    }

    public ExceptionDetails(ExceptionDetailsBuilder<?> builder) {
        this.title = builder.title;
        this.status = builder.status;
        this.details = builder.details;
        this.developerMessage = builder.developerMessage;
        this.timestamp = builder.timestamp;
    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
