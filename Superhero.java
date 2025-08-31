public class Superhero{
    
    private String name;
    private String superpower;
    private String phrase;

    public void setName(String inputName)
    {
        name  = inputName;
    }

    public void setSuperpower(String inputPower)
    {
        superpower = inputPower;
    }

    public void setCatchPhrase(String inputPhrase)
    {
        phrase = inputPhrase;
    }

    public String getName()
    {
        return name;
    }

    public String getSuperpower()
    {
        return superpower;
    }

    public String getCatchPhrase()
    {
        return phrase;
    }

    public void speak()
    {
        System.out.println(phrase);
    }
}