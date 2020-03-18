// It Template class - Gerry Agnew (similar to MyClass)

public class It // extends SuperClass
{

//== Member Variables ====================================================

    private int it; // delete once class is coded

//== Member Methods - Constructors =======================================

    public It ( ) // Default constructor - no parameters
    {
		setIt(0);
    }

    public It (int i) // Constructor with parameters
    {
		setIt(i);
    }

//== Member Methods - Accesser & Mutater =================================

    public int getIt( )
    {
        return it;
    }

   	public void setIt(int i)
    {
        it = i;
    }

// == Other Methods (including toString) =================================

    public String toString()
    {
		return ("'It' is: " + getIt());
    }

} // It class