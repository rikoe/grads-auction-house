package com.weareadaptive.auction.service;

import static java.lang.String.format;
import static java.util.Optional.ofNullable;

import com.weareadaptive.auction.exception.AuctionException;
import com.weareadaptive.auction.exception.NotFoundException;
import com.weareadaptive.auction.model.AuctionLot;
import com.weareadaptive.auction.model.AuctionState;
import com.weareadaptive.auction.model.Bid;
import com.weareadaptive.auction.model.ClosingSummary;
import com.weareadaptive.auction.model.User;
import com.weareadaptive.auction.model.UserState;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

@Service
public class AuctionLotService {
  public static final String AUCTION_LOT_ENTITY = "AuctionLot";
  private final AuctionState auctionState;
  private final UserState userState;

  public AuctionLotService(AuctionState auctionState, UserState userState) {
    this.auctionState = auctionState;
    this.userState = userState;
  }
}
