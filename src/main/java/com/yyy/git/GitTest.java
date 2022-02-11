package com.yyy.git;

/**
 * @author yyy
 */
public class GitTest {
    private String name;
    private Integer id;

    public GitTest() {
    }

    public GitTest(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("hello world! 1");
        System.out.println("hello world! 2");
        System.out.println("hello world! master");
        System.out.println("hello world! hot-fix");
        System.out.println("hello world! git");


    }
}
