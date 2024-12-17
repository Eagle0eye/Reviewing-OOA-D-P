package org.solid.lsp.post;

public class Post {
    public String CreatePost(PostDatabase db,String post){
        return db.Add(post);
    }
}
