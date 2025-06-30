

public class ZipCode {
    private String zipCode;

    // public ZipCode() {
    //     this.zipCode = null;
    // }

    public void setZipCode(String inZipCode) {
        if ((inZipCode.length() == 5) | (inZipCode.length() == 9)) {
            zipCode = inZipCode;
        }else{
            zipCode = "Undifined Zipcode";
        }
    }

    public String getZipCode() {
        return zipCode;
    }

    public static void main(String[] arguments) {
        ZipCode zip1 = new ZipCode();
        zip1.setZipCode("73829456237");
        ZipCode zip2 = new ZipCode();
        zip2.setZipCode("20840");
        // if (!"".equals(zip1.getZipCode())) {
        //     System.out.println("Zip1: " + zip1.getZipCode());
        // } else {
        //     System.out.println("Zip1 not set");
        // }
        // if (!"".equals(zip2.getZipCode())) {
        //     System.out.println("Zip2: " + zip2.getZipCode());
        // } else {
        //     System.out.println("Zip2 not set");
        // }
        System.out.println("Zip1: " + zip1.getZipCode());
        System.out.println("Zip2: " + zip2.getZipCode());



    }
}
