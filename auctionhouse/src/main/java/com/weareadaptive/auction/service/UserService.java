package com.weareadaptive.auction.service;

import com.weareadaptive.auction.model.User;
import com.weareadaptive.auction.model.UserState;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final UserState userState;

  public UserService(UserState userState) {
    this.userState = userState;
  }

  public User create(String username, String password, String firstName, String lastName,
                     String organisation) {
    throw new UnsupportedOperationException();
  }
}
