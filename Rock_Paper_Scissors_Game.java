public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rps = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int computerInt = random.nextInt(rps.length);
        String computerChoice = rps[computerInt];
        System.out.println("Enter Rock, Paper or Scissors:");
        String userChoice = scanner.nextLine();
        System.out.println("Computer chose: " + computerChoice);