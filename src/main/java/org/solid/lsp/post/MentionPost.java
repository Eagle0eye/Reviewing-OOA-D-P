package org.solid.lsp.post;

public class MentionPost extends Post{
    @Override
    public String CreatePost(PostDatabase db, String post)
    {return db.AddMentionPost(post);}
}
