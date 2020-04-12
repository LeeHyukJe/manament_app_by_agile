package com.taskagile.web.payload;

import com.taskagile.config.SecurityConfiguration;
import com.taskagile.domain.application.UserService;
import com.taskagile.web.apis.RegistrationApiController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SecurityConfiguration.class, RegistrationApiController.class})
@WebMvcTest
public class RegistrationApiControllerTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private UserService serviceMock;


  @Test
  public void register_blankPayload_shouldFailAdnReturn400() throws Exception{
    mockMvc.perform(post("/api/registrations"))
      .andExpect(status().is(400));
  }
}
