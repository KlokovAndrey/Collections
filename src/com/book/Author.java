package com.book;

import java.util.Objects;

public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender &&
                Objects.equals(name, author.name) &&
                Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result+name.hashCode();
        result = 31*result+email.hashCode();
        result = 31*result+(int)gender;
        return result;
    }
}
