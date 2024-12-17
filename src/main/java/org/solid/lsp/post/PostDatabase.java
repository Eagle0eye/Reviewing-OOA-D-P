package org.solid.lsp.post;

public class PostDatabase {
    public String Add(String post){
        return "Original post: "+post;
    }
    public String AddTagPost(String post){
        return  "Tag post: "+post;
    }
    public String AddMentionPost(String post){
        return "Mention: "+post;
    }
    public String AddLinkPost(String post){
        return "Link: "+post;
    }

}
