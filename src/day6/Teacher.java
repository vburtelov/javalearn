package day6;

import java.util.Random;

public class Teacher {
    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String evaluate(Student student) {
        Random rand = new Random();
        int scoreNum = rand.nextInt(4) + 2;
        String scoreString = null;
        switch (scoreNum) {
            case 2:
                scoreString = "Неудовлетворительно";
                break;
            case 3:
                scoreString = "Удовлетворительно";
                break;
            case 4:
                scoreString = "Хорошо";
                break;
            case 5:
                scoreString = "Отлично";
                break;
        }
        return "Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " +
                this.subject + " на оценку " + scoreString;
    }


    public String getName() {
        return name;
    }

}
