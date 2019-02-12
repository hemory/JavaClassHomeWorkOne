package edu.brandeis.rseg102.oop;

public class BasePlusCommissionEmployee implements Payable
{
    private double baseSalary; // base salary per week
    private CommissionEmployee commissionEmployee;

    // six-argument constructor
    public BasePlusCommissionEmployee( String firstName, String lastName,
                                       String socialSecurityNumber, double grossSales, double commissionRate, double salary )
    {
        commissionEmployee = new CommissionEmployee( firstName, lastName, socialSecurityNumber, grossSales, commissionRate );
        setBaseSalary( salary );
    }

    // set first name
    public void setFirstName( String first )
    {
        commissionEmployee.setFirstName( first );
    }

    // return first nam
    public String getFirstName()
    {
        return commissionEmployee.getFirstName();
    }

    // set last name
    public void setLastName( String last )
    {
        commissionEmployee.setLastName( last );
    }

    // return last name
    public String getLastName()
    {
        return commissionEmployee.getLastName();
    }

    // set social security number
    public void setSocialSecurityNumber( String ssn )
    {
        commissionEmployee.setSocialSecurityNumber( ssn );
    }

    // return social security number
    public String getSocialSecurityNumber()
    {
        return commissionEmployee.getSocialSecurityNumber();
    }

    // set commission employee's gross sales amount
    public void setGrossSales( double sales )
    {
        commissionEmployee.setGrossSales( sales );
    }

    // return commission employee's gross sales amount
    public double getGrossSales()
    {
        return commissionEmployee.getGrossSales();
    }

    // set commission employee's rate
    public void setCommissionRate( double rate )
    {
        commissionEmployee.setCommissionRate( rate );
    }

    // return commission employee's rate
    public double getCommissionRate()
    {
        return commissionEmployee.getCommissionRate();
    }

    // set base-salaried commission employee's base salary
    public void setBaseSalary( double salary )
    {
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    }

    // return base-salaried commission employee's base salary
    public double getBaseSalary()
    {
        return baseSalary;
    }

    public double getBaseSalaryPlusIncrease(double baseSalary) {
        return baseSalary + (baseSalary * .10);
    }


    // calculate base-salaried commission employee's earnings
    public double getPaymentAmount()
    {
        return getBaseSalaryPlusIncrease(baseSalary) + commissionEmployee.getPaymentAmount();
    }

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString()
    {
        return String.format( "%s %s\n%s: %.2f \n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), " base salary", getBaseSalary(), "new base salary plus 10% commission", getBaseSalaryPlusIncrease(baseSalary));
    } // end method toString
}