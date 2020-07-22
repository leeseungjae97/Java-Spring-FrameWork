package com.spring;

public class Test {
    int tot;
    int kor;
    int math;
    int eng;


    public Test(int tot, int kor, int math, int eng) {
        this.tot = tot;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public int getTot() {
        return this.tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public int getKor() {
        return this.kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return this.eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public Test tot(int tot) {
        this.tot = tot;
        return this;
    }

    public Test kor(int kor) {
        this.kor = kor;
        return this;
    }

    public Test math(int math) {
        this.math = math;
        return this;
    }

    public Test eng(int eng) {
        this.eng = eng;
        return this;
    }
    public int tot() {
        return (kor + eng+ math);
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Test)) {
            return false;
        }
        Test test = (Test) o;
        return tot == test.tot && kor == test.kor && math == test.math && eng == test.eng;
    }

    @Override
    public String toString() {
        return "{" +
            " tot='" + getTot() + "'" +
            ", kor='" + getKor() + "'" +
            ", math='" + getMath() + "'" +
            ", eng='" + getEng() + "'" +
            "}";
    }

    public double avg() {
        return((double)tot() / 3);
    }

}