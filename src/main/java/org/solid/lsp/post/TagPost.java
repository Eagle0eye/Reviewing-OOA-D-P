package org.solid.lsp.post;

public class TagPost extends Post{
    @Override
    public String CreatePost(PostDatabase db, String post){
        return db.AddTagPost(post);
    }
}
