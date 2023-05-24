package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TournamentWinner {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();

        results.add(0);
        results.add(0);
        results.add(1);


        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));

        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);

        String result = tournamentWinner(competitions, results);
        System.out.println(result);


    }

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        HashMap<String, Integer> map = new HashMap<>();
        String winner = "";
        String competitionWinner = "";



        int highestScore = 0;

        for(int i = 0; i< results.size(); i++){
            int currentScore = 0;
            int competitionResult = results.get(i);
            System.out.println(competitionResult);

            if(competitionResult == 1){
                competitionWinner = competitions.get(i).get(0);
            }else {
                competitionWinner = competitions.get(i).get(1);
            }

            if(map.containsKey(competitionWinner)){
                currentScore = map.get(competitionWinner);
            }

            int newScore = currentScore + 3;

            if(newScore > highestScore){
                highestScore = newScore;
                winner = competitionWinner;
            }


            map.put(competitionWinner, newScore);

        }
        return winner;
    }
}
