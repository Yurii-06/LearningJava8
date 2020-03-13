package ua.proky;

import java.util.Objects;

public class MyObject {
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof MyObject)) {
            return false;
        }
        MyObject castOther = (MyObject) other;
        return Objects.equals(field, castOther.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
