package academy.devdojo.springboot2essentials.exception;

public class ValidationExceptionDetails extends ExceptionDetails {
    protected final String fields;
    protected final String fieldsMessage;

    public static class ValidationExceptionDetailsBuilder
            extends ExceptionDetailsBuilder<ValidationExceptionDetailsBuilder> {

        private String fields;
        private String fieldsMessage;

        public ValidationExceptionDetailsBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }

        public ValidationExceptionDetailsBuilder fieldsMessage(String fieldsMessage) {
            this.fieldsMessage = fieldsMessage;
            return this;
        }

        @Override
        protected ValidationExceptionDetailsBuilder self() {
            return this;
        }

        @Override
        public ValidationExceptionDetails build() {
            return new ValidationExceptionDetails(this);
        }
    }

    public ValidationExceptionDetails(ValidationExceptionDetailsBuilder builder) {
        super(builder);
        this.fields = builder.fields;
        this.fieldsMessage = builder.fieldsMessage;
    }

    public static ValidationExceptionDetailsBuilder builder() {
        return new ValidationExceptionDetailsBuilder();
    }

    @Override
    public String toString() {
        return "ValidationExceptionDetails{" +
                "fields='" + fields + '\'' +
                ", fieldsMessage='" + fieldsMessage + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", details='" + details + '\'' +
                ", developerMessage='" + developerMessage + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public String getFields() {
        return fields;
    }

    public String getFieldsMessage() {
        return fieldsMessage;
    }
}
