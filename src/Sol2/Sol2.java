package Sol2;

import java.util.HashMap;
import java.util.Map;

public class Sol2 {
    private Map<Integer, Integer> map;

    public Map<Integer, Integer> calculate(post[] posts){
        if(posts==null || posts.length==0)
            return null;
        this.map = new HashMap<>();
        boolean [] check = new boolean[posts.length];
        for (int i = 0;i<posts.length;i++){
            post temp = posts[i];
            //System.out.println(temp.postId);
            int followers =0;
            while(temp.repostId!=null){
                if(!check[i]) {
                    followers += temp.followers;
                    check[i]=true;
                }
                temp =temp.repostId;
            }
            if(!check[i]) {
                followers += temp.followers;
                check[i] = true;
            }
            if(map.containsKey(temp.postId))
                map.put(temp.postId,map.get(temp.postId)+followers);
            else
                map.put(temp.postId, followers);
        }
        return map;
    }

    public static void main(String[] args) {
        post p1 = new post(1,null,120);
        post p2 = new post(2,p1,60);
        post p3 = new post(3,p1,30);
        post p4 = new post(4,p2,90);
        post p5 = new post(5,p3,40);
        post p6 = new post(6,p4,10);
        post p7 = new post(45,null,240);
        post p8 = new post(27,p7,190);
        post p9 = new post(45,p7,50);
        post[] posts ={p1,p2,p3,p4,p5,p6,p6,p7,p8,p9};
        Sol2 s2 = new Sol2();
        Map<Integer,Integer> map = s2.calculate(posts);
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
            System.out.println("Post = " + entry.getKey() +
                    ", Followers = " + entry.getValue());

    }
}
