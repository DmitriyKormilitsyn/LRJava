
package com.company;

public class ModelT extends SiemensMob{

    private String model_name = "Model1";
    @Override
    public void Info() {
        System.out.println(company + " serial:" + model_name);
        System.out.println("Maded by hands");
    }
}