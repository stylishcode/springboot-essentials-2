package academy.devdojo.springboot2essentials.exception;

public class BadRequestExceptionDetails extends ExceptionDetails {

    public static class BadRequestExceptionDetailsBuilder
            extends ExceptionDetailsBuilder<BadRequestExceptionDetailsBuilder> {

        @Override
        protected BadRequestExceptionDetailsBuilder self() {
            return this;
        }

        @Override
        public BadRequestExceptionDetails build() {
            return new BadRequestExceptionDetails(this);
        }
    }

    public BadRequestExceptionDetails(BadRequestExceptionDetailsBuilder builder) {
        super(builder);
    }

    public static BadRequestExceptionDetailsBuilder builder() {
        return new BadRequestExceptionDetailsBuilder();
    }

    @Override
    public String toString() {
        return "BadRequestExceptionDetails{" +
                "title='" + title + '\'' +
                ", status=" + status +
                ", details='" + details + '\'' +
                ", developerMessage='" + developerMessage + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
