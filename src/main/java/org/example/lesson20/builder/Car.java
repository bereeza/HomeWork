package org.example.lesson20.builder;

import lombok.Getter;
import lombok.ToString;
import org.example.lesson20.builder.car_type.Type;

@Getter
@ToString
public class Car {
    private String engine;
    private int wheels;
    private int horsePower;
    private Type type;

    public Car(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.horsePower = builder.horsePower;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    static final class Builder{
        private String engine;
        private int wheels;
        private int horsePower;
        private Type type;
        private Builder() {

        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder horsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
