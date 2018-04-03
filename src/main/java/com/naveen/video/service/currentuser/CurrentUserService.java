package com.naveen.video.service.currentuser;

import com.naveen.video.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
