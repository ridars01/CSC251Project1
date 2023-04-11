public class Policy {
    //Instance field to hold the variables
    private String policyNum;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;



    public Policy(){
        policyNum = "";
        providerName = "" ;
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0;
        weight = 0;
    }

    /**
     * Constructor  accepts arguments for each field
     * @param pNum  policy Number
     * @param provName  Policy Provider's Name
     * @param fName  Policyholder's first name
     * @param lName  policyholders last name
     * @param a Policy holders age
     * @param smokeStatus Policyholders smoking status
     * @param h policyholders height
     * @param w policyholders weight
     */

    public Policy(String pNum, String provName, String fName, String lName,int a, String smokeStatus, double h, double w)
    {
        policyNum = pNum;
        providerName = provName;
        firstName = fName;
        lastName = lName;
        age = a;
        smokingStatus = smokeStatus;
        height = h;
        weight = w;
    }


    //setters//

    /**
     * @param pNum Policy Number
     */
    public void setPolicyNumber(String pNum)
    {
        policyNum = pNum;
    }

    /**
     * @param provName Provider name
     */
    public void setProviderName(String provName)
    {
        providerName = provName;
    }

    /**
     * @param fName Providers first name
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     * @param lName Providers last name
     */
    public void setLastName(String lName)
    {
        lastName = lName;
    }

    /**
     * @param a Policy Providers Age
     */
    public void setAge(int a)
    {
        age = a;
    }

    /**
     * @param smokeStatus Providers smoking status
     */
    public void setSmokingStatus(String smokeStatus)
    {
        smokingStatus = smokeStatus;
    }

    /**
     * @param h Providers h
     */
    public void setHeight(double h)
    {
        height = h;
    }

    /**
     * @param w Providers w
     */
    public void setWeight(double w)
    {
        weight = w;
    }


    //getters//

    /**
     * @return Policy Number
     */
    public String getPolicyNumber()
    {
        return policyNum;
    }

    /**
     * @return Provider Name
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * @return First Name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return Last Name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @return Age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * @return Smoking status
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * @return height
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * @return weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     *Calculates the Policyholder's BMI
     * @return The BMI of the policyholder
     */
    //Calculates the Policyholder's BMI
    public double getBMI()
    {

        return (weight * 703) / (height * height);
    }

    /**
     * Calculate Policy price
     * @return The price of the policy
     */
    public double getPrice()
    {
        final double BASE_PRICE = 600;
        final double ADDITIONAL_FEE_AGE = 75;
        final double ADDITIONAL_FEE_SMOKING = 100;
        final double ADDITIONAL_FEE_PER_BMI = 20;

        final int AGE_THRESHOLD = 50;
        final int BMI_THRESHOLD = 35;

        double price = BASE_PRICE;

        if(age > AGE_THRESHOLD) //over 50 years
            price += ADDITIONAL_FEE_AGE; //75

        if(smokingStatus.equalsIgnoreCase("smoker"))
            price += ADDITIONAL_FEE_SMOKING; //100

        //call  getBMI method
        if(getBMI() > BMI_THRESHOLD) //BMI over 35
            price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20

        return price;
    }

}