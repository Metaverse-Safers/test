package com.safers.api.response;

import com.safers.db.entity.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse{

    String id;
    String nickName;
    String profileUrl;

    public static UserResponse of(User user){
        return UserResponse.builder()
                .id(user.getId())
                .nickName(user.getNickName())
                .profileUrl(user.getProfileUrl())
                .build();
    }
}
