package chapter01;

public class PhraseOMatic {
    public static void main(String[] args) {

        String [] wordListOne = {"java", "spring", "springboot", "hibernate"};
        String [] wordListTwo = {"C#", ".NET", "microsoft", "cool"};
        String [] wordListThree = {"RestAPI", "Spring", "design", "mesh"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random r = new java.util.Random();
        int rand1 = r.nextInt(oneLength);
        int rand2 = r.nextInt(twoLength);
        int rand3 = r.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListThree[rand3] + " " + wordListTwo[rand2];
        System.out.println("What we need is a " + phrase);
    }
}
