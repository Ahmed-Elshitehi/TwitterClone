package com.Twitter.org.Models.Tweets;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Replies")
@IdClass(RepliesId.class)
@AllArgsConstructor
public class Replies {

    @Id
    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Tweets post;

    @Id
    @ManyToOne
    @JoinColumn(name = "reply_id", referencedColumnName = "id")
    private Tweets reply;

}