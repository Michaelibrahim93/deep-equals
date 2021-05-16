package com.mi93.deepequalslib.models;

import java.util.Objects;

public class JUser {
    private final long id;
    private final Float randValue;

    public JUser(long id, Float randValue) {
        this.id = id;
        this.randValue = randValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JUser jUser = (JUser) o;
        return id == jUser.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, randValue);
    }
}
