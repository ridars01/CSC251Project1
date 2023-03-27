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

    public void setPolicyNumber(String pNum)
    {
        policyNum = pNum;
    }

    public void setProviderName(String provName)
    {
        providerName = provName;
    }

    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    public void setLastName(String lName)
    {
        lastName = lName;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public void setSmokingStatus(String smokeStatus)
    {
        smokingStatus = smokeStatus;
    }

    public void setHeight(double h)
    {
        height = h;
    }

    public void setWeight(double w)
    {
        weight = w;
    }


    //getters//

    public String getPolicyNumber()
    {
        return policyNum;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }


    //Calculates the Policyholder's BMI
    public double getBMI()
    {

        return (weight * 703) / (height * height);
    }

    //Calculate Policy price
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