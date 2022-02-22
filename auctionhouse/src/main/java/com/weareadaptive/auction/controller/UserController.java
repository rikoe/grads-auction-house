package com.weareadaptive.auction.controller;

import static org.springframework.http.HttpStatus.CREATED;

import com.weareadaptive.auction.controller.dto.CreateUserRequest;
import com.weareadaptive.auction.controller.dto.UpdateUserRequest;
import com.weareadaptive.auction.controller.dto.UserResponse;
import com.weareadaptive.auction.exception.NotFoundException;
import com.weareadaptive.auction.model.User;
import com.weareadaptive.auction.service.UserService;
import java.util.stream.Stream;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  @ResponseStatus(CREATED)
  public UserResponse create(@Valid @RequestBody CreateUserRequest request) {
    throw new UnsupportedOperationException();
  }

    @GetMapping("/{id}")
    public UserResponse get(@PathVariable int id) {
      throw new UnsupportedOperationException();

    }

  @PutMapping("/{id}")
  public UserResponse update(@PathVariable int id, @Valid @RequestBody
      UpdateUserRequest request) {
    throw new UnsupportedOperationException();
  }

  @GetMapping
  public Stream<UserResponse> getAll() {
    throw new UnsupportedOperationException();
  }

  @PutMapping("/{id}/block")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void block(@PathVariable int id) {
    throw new UnsupportedOperationException();
  }

  @PutMapping("/{id}/unblock")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void unblock(@PathVariable int id) {
    throw new UnsupportedOperationException();
  }
}