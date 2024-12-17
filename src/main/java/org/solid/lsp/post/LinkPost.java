package org.solid.lsp.post;

public class LinkPost extends Post{
    @Override
    public String CreatePost(PostDatabase db, String post){
        return db.AddLinkPost(post);
    }
}
