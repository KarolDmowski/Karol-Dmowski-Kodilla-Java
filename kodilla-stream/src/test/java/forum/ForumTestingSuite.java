package forum;

import com.kodilla.stream.forumuser.Forum;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestingSuite {
    @Test
    public void testGetForumList(){
        //Given
        int listSize = 10;
        //When
        Forum forum = new Forum();
        int resultListSize = forum.getUserList().size();
        //Then
        Assert.assertEquals(listSize,resultListSize);
    }
}
