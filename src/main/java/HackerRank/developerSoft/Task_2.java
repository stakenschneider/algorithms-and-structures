package hackerRank.developerSoft;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'minPartitions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY used
     *  2. INTEGER_ARRAY totalCapacity
     */

    public static int minPartitions(List<Integer> used, List<Integer> totalCapacity) {
        //TODO задача решается полным перебором
        // Write your code here
        Collections.sort(used);
        Collections.sort(totalCapacity);
        Collections.reverse(used);
        Collections.reverse(totalCapacity);

        int result = 0;
        int sum;

        for (int tc : totalCapacity) {
            sum = 0;
            for (int k = 0; !used.isEmpty() && k<used.size(); k++) {
                if (tc >= sum+used.get(k)) {
                    sum += used.get(k);
                    used.remove(k);
                    k--;
                }
            }
            
            result++;
            if (used.isEmpty()){
                return result;
            }
        }
        return result;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        a.add(154);
        a.add(684);
        a.add(48);
        a.add(608);
        a.add(774);
        a.add(523);
        a.add(306);
        a.add(777);
        a.add(454);
        a.add(25);
        a.add(631);
        a.add(367);
        a.add(601);
        a.add(445);
        a.add(171);
        a.add(686);
        a.add(617);
        a.add(299);
        a.add(156);
        a.add(334);
        a.add(358);
        a.add(577);
        a.add(379);
        a.add(667);
        a.add(158);
        a.add(112);
        a.add(679);
        a.add(615);
        a.add(420);
        a.add(538);
        a.add(734);
        a.add(592);
        a.add(521);
        a.add(763);
        a.add(234);
        a.add(198);
        a.add(32);
        a.add(189);
        a.add(590);
        a.add(474);
        a.add(478);
        a.add(505);
        a.add(159);
        a.add(401);
        a.add(455);
        a.add(161);
        a.add(516);
        a.add(348);
        a.add(681);
        a.add(531);
        a.add(356);
        a.add(147);
        a.add(308);
        a.add(439);
        a.add(1);
        a.add(127);
        a.add(236);
        a.add(458);
        a.add(314);
        a.add(515);
        a.add(794);
        a.add(561);
        a.add(755);
        a.add(419);
        a.add(558);
        a.add(186);
        a.add(130);
        a.add(216);
        a.add(564);
        a.add(503);
        a.add(118);
        a.add(244);
        a.add(220);
        a.add(568);
        a.add(548);
        a.add(470);
        a.add(196);
        a.add(104);
        a.add(474);
        a.add(704);
        a.add(549);
        a.add(386);
        a.add(59);
        a.add(260);
        a.add(607);
        a.add(331);
        a.add(625);
        a.add(333);
        a.add(174);
        a.add(404);
        a.add(498);
        a.add(721);
        a.add(751);
        a.add(32);
        a.add(481);
        a.add(204);
        a.add(301);
        a.add(521);
        a.add(134);
        a.add(459);
        a.add(204);
        a.add(277);
        a.add(151);
        a.add(735);
        a.add(381);
        a.add(680);
        a.add(233);
        a.add(175);
        a.add(750);
        a.add(143);
        a.add(650);
        a.add(772);
        a.add(711);
        a.add(680);
        a.add(184);
        a.add(371);
////        a.add(3);
////        a.add(2);
////        a.add(1);
////        a.add(3);
////        a.add(1);
//
////                a.add(3);
////        a.add(2);
////        a.add(1);
//
//        a.add(2);
//        a.add(2);
//        a.add(2);
        List<Integer> b = new ArrayList<>();
        b.add(41);
        b.add(724);
        b.add(651);
        b.add(972);
        b.add(230);
        b.add(319);
        b.add(747);
        b.add(300);
        b.add(231);
        b.add(622);
        b.add(777);
        b.add(125);
        b.add(245);
        b.add(959);
        b.add(697);
        b.add(772);
        b.add(65);
        b.add(561);
        b.add(599);
        b.add(752);
        b.add(941);
        b.add(504);
        b.add(552);
        b.add(802);
        b.add(206);
        b.add(81);
        b.add(419);
        b.add(275);
        b.add(650);
        b.add(414);
        b.add(321);
        b.add(26);
        b.add(13);
        b.add(784);
        b.add(789);
        b.add(118);
        b.add(9);
        b.add(551);
        b.add(325);
        b.add(196);
        b.add(258);
        b.add(512);
        b.add(691);
        b.add(667);
        b.add(411);
        b.add(594);
        b.add(554);
        b.add(566);
        b.add(961);
        b.add(743);
        b.add(404);
        b.add(353);
        b.add(308);
        b.add(142);
        b.add(911);
        b.add(201);
        b.add(800);
        b.add(128);
        b.add(172);
        b.add(788);
        b.add(415);
        b.add(626);
        b.add(642);
        b.add(518);
        b.add(349);
        b.add(843);
        b.add(316);
        b.add(975);
        b.add(446);
        b.add(374);
        b.add(221);
        b.add(912);
        b.add(240);
        b.add(55);
        b.add(306);
        b.add(930);
        b.add(254);
        b.add(190);
        b.add(167);
        b.add(357);
        b.add(305);
        b.add(861);
        b.add(899);
        b.add(593);
        b.add(721);
        b.add(117);
        b.add(581);
        b.add(868);
        b.add(353);
        b.add(940);
        b.add(699);
        b.add(902);
        b.add(812);
        b.add(617);
        b.add(892);
        b.add(672);
        b.add(729);
        b.add(672);
        b.add(662);
        b.add(46);
        b.add(121);
        b.add(241);
        b.add(159);
        b.add(454);
        b.add(628);
        b.add(351);
        b.add(712);
        b.add(564);
        b.add(595);
        b.add(534);
        b.add(728);
        b.add(828);
        b.add(796);
        b.add(532);
        b.add(443);
        b.add(517);
////        b.add(3);
////        b.add(5);
////        b.add(3);
////        b.add(5);
////        b.add(5);
//
//        b.add(3);
//        b.add(3);
//        b.add(3);


        System.out.println(Result.minPartitions(a, b));
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"));
//            String lol = bufferedReader.readLine();
//        int usedCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> used = IntStream.range(0, usedCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int totalCapacityCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> totalCapacity = IntStream.range(0, totalCapacityCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = Result.minPartitions(used, totalCapacity);
//
//        System.out.println(result);
////        bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
//
//        bufferedReader.close();
////        bufferedWriter.close();
//        } catch (Exception e) {
//
//            System.out.println("jdsfksld");
//        }
    }
}

