package interviews.examples;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        PaperPost<String> paperPost = new PaperPost<>("ss");
        Object o = paperPost.clone();
        System.out.println(o);
    }
}