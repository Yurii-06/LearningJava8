package ua.proky;

import java.util.Objects;

public class MyChildObject extends MyObject {
    private boolean v1;

    public boolean isV1() {
        return v1;
    }

    public void setV1(boolean v1) {
        this.v1 = v1;
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof MyChildObject)) {
            return false;
        }
        MyChildObject castOther = (MyChildObject) other;
        return Objects.equals(v1, castOther.v1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1);
    }
}
