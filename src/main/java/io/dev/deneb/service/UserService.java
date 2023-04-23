package io.dev.deneb.service;

import io.dev.deneb.model.User;
import io.dev.deneb.model.UserGetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class UserService {

  private static final Logger log = LoggerFactory.getLogger(UserService.class);
  private final WebClient client;

  public UserService() {
    this.client = WebClient.builder()
        .baseUrl("https://reqres.in/")
        .build();
  }

  public List<User> gePagnated(Long page) {

    UserGetResponse response = client
        .get()
        .uri(uriBuilder ->
            uriBuilder
                .path("api/users")
                .queryParam("page", page)
                .build()
        )
        .retrieve()
        .bodyToMono(UserGetResponse.class)
        .block();


    log.info("==== response: {} ", response);

    return response.getData();
  }
}
