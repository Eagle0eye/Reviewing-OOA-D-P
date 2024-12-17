package org.solid.lsp.post;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args)
    {
        PostDatabase db = new PostDatabase();

        List<String> newPosts = new ArrayList<String>();
        newPosts.add("Origin Post");
        newPosts.add("#Marry");
        newPosts.add("https");
        newPosts.add("@Hanady");
        Post post;

        for (String newPost:newPosts) {
            if(newPost.startsWith("#"))
                post = new TagPost();
            else if (newPost.startsWith("@"))
                post = new MentionPost();
            else if (newPost.startsWith("https")) {
                post = new LinkPost();
            } else
                post = new Post();
            String result = post.CreatePost(db,newPost);
            System.out.println(result);
        }
        System.out.println();

    }
}
