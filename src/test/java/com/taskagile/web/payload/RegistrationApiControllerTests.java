package com.taskagile.web.payload;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest (RegistrationApiController.class)
public class RegistrationApiControllerTests {

  @Autowired
  private MockMvc mockMvc;


  @Test
  public void register_blankPayload_shouldFailAdnReturn400() throws Exception{
    mockMvc.perform(post("/api/registraions"))
      .andExpect(status().is(400));
  }
}
