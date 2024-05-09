package com.Twitter.org.initializer;

import com.Twitter.org.services.Impl.BookmarksServiceImpl;
import com.Twitter.org.services.Impl.LikesServiceImpl;
import com.Twitter.org.services.Impl.RepostsServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StartupDataInitializer {

    private final LikesServiceImpl likesService;
    private final BookmarksServiceImpl bookmarksService;
    private final RepostsServiceImpl repostsService;

    @Autowired
    public StartupDataInitializer(LikesServiceImpl likesService, BookmarksServiceImpl bookmarksService, RepostsServiceImpl repostsService) {
        this.likesService = likesService;
        this.bookmarksService = bookmarksService;
        this.repostsService = repostsService;
    }

    // TODO: ADD Missing Counters for the Tweets: Comments Counter

    @PostConstruct
    public void initializeData() {
        likesService.updateLikesCountersOnStartup();
        bookmarksService.updateBookmarksCountersOnStartup();
        repostsService.updateRepostsCountersOnStartup();
    }
}