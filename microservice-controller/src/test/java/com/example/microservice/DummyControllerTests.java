package com.example.microservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
@SqlGroup({
    @Sql(value = "classpath:sqldummycontroller/reset-cases.sql",
        executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD),
    @Sql(value = "classpath:sqldummycontroller/create-cases.sql",
        executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)})
class DummyControllerTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void should_return_plain_dummy() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.get("/getPlainDummy")) //
        .andDo(MockMvcResultHandlers.print()) //
        .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()))
        .andExpect(MockMvcResultMatchers.content()
            .contentType("text/plain;charset=UTF-8"))
        .andExpect(MockMvcResultMatchers.content().string("Dummy"));
  }

  @Test
  void should_return_dummy_from_db_by_id() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.get("/getDummyById/Dummy"))
        .andDo(MockMvcResultHandlers.print()) //
        .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()))
        .andExpect(MockMvcResultMatchers.content()
            .contentType("text/plain;charset=UTF-8"))
        .andExpect(MockMvcResultMatchers.content().string("Dummy"));
  }

}
