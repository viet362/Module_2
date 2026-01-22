public class Student {
    String name;
    int age;
    double[] score;

    public Student(String name, int age, double[] score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public double[] getScore(){return score;}

    public double avgScore(){
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum/score.length;
    }
}
