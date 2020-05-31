
package com.company;

public abstract class SiemensMob implements Mobile{

    protected String company = "SIEMENS";
    String model_name;
    @Override
    public void StartScreen() {
        System.out.println("Connecting people©");
    }

}