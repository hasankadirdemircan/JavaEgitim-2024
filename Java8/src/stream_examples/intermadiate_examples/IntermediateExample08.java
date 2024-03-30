package stream_examples.intermadiate_examples;

import java.util.List;
import java.util.Optional;

public class IntermediateExample08 {
    public static void main(String[] args) {
        List<Match> matchList = List.of(new Match("FootballMatch", 11),
                new Match("BasketballMatch", 7),
                new Match("Soccer", 7),
                new Match("Tennis", 2));

        Optional<String> matchName = matchList.stream()
                .map(Match::getName)
                .filter(name -> name.endsWith("asd"))
                .sorted()
                .findFirst();
        System.out.println("result : " + matchName.orElse("match not found!"));
    }
}
