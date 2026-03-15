public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlahObjek = 0;

   public Student(){
    name = "";
    address = "";
    age = 0;
    jumlahObjek++;
}

public Student(String n, String a, int ag){
    name = n;
    address = a;
    age = ag;
    jumlahObjek++;
}

public Student(String n, String a, int ag, double math, double english, double science){
    name = n;
    address = a;
    age = ag;
    mathGrade = math;
    englishGrade = english;
    scienceGrade = science;
    jumlahObjek++;
}
    public void setName(String n){
        name = n;
    } 
    public void setAddress(String a){ 
        address = a; 
    } 
    public void setAge(int ag){ 
        age = ag; 
    } 
    public void setMath(double math){ 
        mathGrade = math; 
    } 
    public void setEnglish(double english){ 
        englishGrade = english; 
    } 
    public void setScience(double science){ 
        scienceGrade = science; 
    } 
    private double getAverage(){ 
        double result = 0; 
        result = (mathGrade+scienceGrade+englishGrade)/3; 
        return result; 
    } 
    public boolean statusAkhir(){
        double rata = getAverage();
        if(rata >= 61){
            return true;
        }else{
            return false;
        }
    }
    public static void jumlahObjek(){
        System.out.println("Jumlah objek Student yang dibuat: " + jumlahObjek);
    }
    public boolean lebihKecil(double nilai){
    return getAverage() < nilai;
    }

    public boolean lebihKecilSama(double nilai){
        return getAverage() <= nilai;
    }

    public boolean lebihBesarSama(double nilai){
        return getAverage() >= nilai;
    }
    public double kurang(double a, double b){
        return a - b;
    }

    public double kali(double a, double b){
        return a * b;
    }

    public double bagi(double a, double b){
        return a / b;
    }
    public void displayMessage(){ 
        System.out.println("Siswa dengan nama "+name); 
        System.out.println("beramalat di "+address); 
        System.out.println("berumur "+age); 
        System.out.println("mempunyai nilai rata rata "+getAverage()); 
         if(statusAkhir()){
        System.out.println("Status: Lolos");
        }else{
            System.out.println("Status: Remidial");
        }
    }
} 

