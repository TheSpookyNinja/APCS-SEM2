package activity_3;

public class Magpie3
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }
        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findKeyword(statement,"mother") >= 0)
        {
            response = "Thats pretty cool. What is the coolest thing about your mom?";
        }
        else if (findKeyword(statement,"father") >= 0)
        {
            response = "Nice. What is the most important characteristic of your dad?";
        }
        else if (findKeyword(statement,"brother") >= 0)
        {
            response = "What is your brother's biggest flaw in your opinon?";
        }
        else if (findKeyword(statement,"sister") >= 0)
        {
            response = "What is the hardest thing to deal with about your sister?";
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

    private int findKeyword(String statement, String goal,
            int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                        psn + goal.length(),
                        psn + goal.length() + 1);
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                                            // letter
                    && ((after.compareTo("a") < 0) || (after
                            .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal, psn + 1);

        }

        return -1;
    }

    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
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