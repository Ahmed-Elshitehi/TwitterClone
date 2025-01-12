package com.Twitter.org.Models.dto;

import com.Twitter.org.Models.Users.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String userName;

    private String firstName;

    private String lastName;

    private String bio;

    private byte[] profilePic;

    private byte[] coverPic;

    private LocalDate dateJoined = LocalDate.now();

    public UserDto(User user) {
        this.userName = user.getUserName();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.bio = user.getBio();
        this.profilePic = user.getProfilePic();
        this.coverPic = user.getCoverPic();
        this.dateJoined = user.getDateJoined();
    }
}