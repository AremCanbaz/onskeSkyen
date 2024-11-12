package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.UserModel;
import com.example.onskeskyen.Repository.UserRepository;
import com.example.onskeskyen.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(UserController.class)
class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    void showlogin() throws Exception {
        mockMvc.perform(get(""))
                .andExpect(status().isOk())
                .andExpect(view().name("login"));

    }

    @Test
    void showLoginForm() throws Exception {
            mockMvc.perform(get("/login"))
                    .andExpect(status().isOk())
                    .andExpect(view().name("login"));
    }

    @Test
    void processLoginForm() throws Exception {
        // Arrange
        String username = "mo";
        String password = "naruto";
        UserModel mockUser = new UserModel();
        mockUser.setUsername(username);
        mockUser.setPassword(password);
        mockUser.setId(1L);



        mockMvc.perform(post("/loginSucces")
                .param("username", username)
                .param("password", password))
                .andExpect(status().isOk());
    }

    @Test
    void showCreateUserForm() {
    }

    @Test
    void processCreateUserForm() {
    }
}