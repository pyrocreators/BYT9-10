package org.example;
import org.junit.Test;

import static org.junit.Assert.*;
public class UserTest {
    @Test
    public void testSetName() {
        String initialName = "John";
        String newName = "Alice";
        String surname = "Doe";
        String nickname = "johndoe123";
        String password = "password123";
        String level = "A2";

        User user = new UserImpl(initialName, surname, nickname, password, level);

        user.setName(newName);

        assertEquals(newName, user.getName());
    }

    @Test
    public void testSetSurname() {
        String name = "John";
        String initialSurname = "Doe";
        String newSurname = "Smith";
        String nickname = "johndoe123";
        String password = "password123";
        String level = "A1";

        User user = new UserImpl(name, initialSurname, nickname, password, level);

        user.setSurname(newSurname);

        assertEquals(newSurname, user.getSurname());
    }


    @Test
    public void testGetters() {
        String name = "John";
        String surname = "Doe";
        String nickname = "johndoe123";
        String password = "password123";
        String level = "A2";

        User user = new UserImpl(name, surname, nickname, password, level);

        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(nickname, user.getNickname());
        assertEquals(password, user.getPassword());
        assertEquals(level, user.getLevel());
    }

    @Test
    public void testSetNickname() {
        String name = "John";
        String surname = "Doe";
        String initialNickname = "johndoe123";
        String newNickname = "new_johndoe";
        String password = "password123";
        String level = "A1";

        User user = new UserImpl(name, surname, initialNickname, password, level);

        user.setNickname(newNickname);

        assertEquals(newNickname, user.getNickname());
    }

    @Test
    public void testSetPassword() {
        String name = "John";
        String surname = "Doe";
        String nickname = "johndoe123";
        String initialPassword = "password123";
        String newPassword = "new_password";
        String level = "A2";

        User user = new UserImpl(name, surname, nickname, initialPassword, level);

        user.setPassword(newPassword);

        assertEquals(newPassword, user.getPassword());
    }

    @Test
    public void testSetLevel() {
        String name = "John";
        String surname = "Doe";
        String nickname = "johndoe123";
        String password = "password123";
        String initialLevel = "beginner";
        String newLevel = "B2";

        User user = new UserImpl(name, surname, nickname, password, initialLevel);

        user.setLevel(newLevel);

        assertEquals(newLevel, user.getLevel());
    }

    private static class UserImpl extends User {
        public UserImpl(String name, String surname, String nickname, String password, String level) {
            super(name, surname, nickname, password, level);
        }

        @Override
        void setProficiencyLevel(String lang, String level) {}
    }
}
