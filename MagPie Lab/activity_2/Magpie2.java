package activity_2;
public class Magpie2
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    
    public String getResponse(String statement)
    {
        String response = "";
        
        statement = statement.trim();
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }
        
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0)
            {
                response = "Tell me more about your pets.";
            }
        else if (statement.indexOf("Mr.") >= 0)
        {
            response = "He sounds like a pretty cool dude.";
        }
        else if (statement.indexOf("Miss") >= 0
                || statement.indexOf("Ms.") >= 0
                || statement.indexOf("Mrs.") >= 0)
        {
            response = "She sounds like a pretty interesting person.";
        }
        else if (statement.indexOf("peanut") >= 0
                || statement.indexOf("jelly") >= 0)
        {
            response = "Sounds delicious...";    
        }
        else if (statement.indexOf("jam") >= 0
                || statement.indexOf("ketchup") >= 0)
        {
            response = "Yuck, you really put that crap in your body?";
        }
        else if (statement.indexOf("song") >= 0)
        {
            response = "Nice... I have a cool song for you. (https://www.youtube.com/watch?v=xfr64zoBTAQ)";
        }
        else
        {
            response = getRandomResponse();
        }
        
        
        return response;
    }

    
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Where did you think of that?";
        }
        else if (whichResponse == 5)
        {
            response = "Alright? What is your favorite sandwich?";
        }
        
        
        return response;
    }
}
